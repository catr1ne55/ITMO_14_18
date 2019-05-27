grammar Expr;		

eval returns [int value]
    : sum[0]                        {$value = $sum.value;} 
    ;

sum[int num] returns [int value]
    :
    | term '+' other = sum[$num + $term.value]		 { $value = $other.value; }
    | term                                           { $value = $num + $term.value; }
    ;

term returns [int value]: 
	ROMAN  {
	$value = Converter.romeToArab($ROMAN.text);
	};

WS : [ \t\r\n]+ -> skip ;
ROMAN   : ('I'|'V'|'X'|'L'|'C'|'D'|'M')+ ;
