grammar Java;

compilationUnit returns [String bytecode] 
    :   importDeclaration* typeDeclaration* EOF
    {$bytecode = $typeDeclaration.bytecode;}
;

importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
;

typeDeclaration returns [String bytecode]
    :   classModifier* classDeclaration
    {$bytecode = $classDeclaration.bytecode;}
    |   ';'
;

classModifier
    :   (   'public'     
        |   'protected'  
        |   'private'    
        |   'static'     
        )
;

variableModifier
    :   'final'
    ;

classDeclaration returns [String bytecode]
    :   'class' Identifier
        '{' classBodyDeclaration* '}'

    {StringBuilder s = new StringBuilder();
        for (ClassBodyDeclarationContext cbdc : _localctx.classBodyDeclaration()) {
             s.append(cbdc.bytecode);
        }
    $bytecode = Cmd.classDecl + $Identifier.getText() + "\n" + s.toString();}
;

classBodyDeclaration returns [String bytecode]
    :   ';'
    |   classModifier* memberDeclaration
    {$bytecode = $memberDeclaration.bytecode;}
    ;

memberDeclaration returns [String bytecode]
    :   methodDeclaration
    {$bytecode = $methodDeclaration.bytecode;}
    |   fieldDeclaration
    {$bytecode = $fieldDeclaration.bytecode;}
;

methodDeclaration returns [String bytecode]
    :   (typeType|'void') Identifier formalParameters ('[' ']')*
        (   methodBody
        |   ';'
        )
    {
        String typeId = _localctx.getChild(0).getText();
        String id = $Identifier.getText();
        $bytecode = Cmd.methodDecl + $Identifier.getText() + "\n" +
                    (id.equals("main") ? "" : $formalParameters.bytecode) + $methodBody.bytecode +
                    (typeId.equals("void") ? Cmd.ret : "") + "\n";
    }
;

fieldDeclaration returns [String bytecode]
    :   typeType variableDeclarator ';'
    {$bytecode = "." + $typeType.text + " " + $variableDeclarator.bytecode + "\n";}
;

variableDeclarator returns [String bytecode]
    :   variableDeclaratorId ('=' expression)?
        {String id = $variableDeclaratorId.text;
         String init = "";
         if (_localctx.expression() != null) {
             init = $expression.bytecode;
         } else {
             init = Cmd.push + "0\n";
         }
         $bytecode = id + "\n" + init + Cmd.pop + id;
        }
    ;

variableDeclaratorId
    :   Identifier ('[' ']')*
    ;

typeType
    :   classType ('[' ']')*
    |   primitiveType ('[' ']')*
    ;

classType
    :   Identifier ('.' Identifier)*
    ;

primitiveType
    :   'boolean'
    |   'int'
;

formalParameters returns [String bytecode]
    :   '(' formalParameterList? ')'
    {
        if (_localctx.formalParameterList != null) {
            $bytecode = $formalParameterList.bytecode;
        } else {
            $bytecode = "";
        }
    }
    ;

formalParameterList returns [String bytecode]
    :   formalParameter (',' formalParameter)*
    {
        StringBuilder s = new StringBuilder();
        for (FormalParameterContext fpc : _localctx.formalParameter()) {
            s.insert(0, fpc.bytecode);
        }
        $bytecode = s.toString();
    }
    ;

formalParameter returns [String bytecode]
    :   variableModifier* typeType variableDeclaratorId
    {
        StringBuilder s = new StringBuilder();
        s.append("." + $typeType.text + " " + $variableDeclaratorId.text + "\n");
        s.append(Cmd.pop + $variableDeclaratorId.text + "\n");
        $bytecode = s.toString();
    }
    ;

methodBody returns [String bytecode]
    :   '{' blockStatement* '}'
    {
        StringBuilder s = new StringBuilder();
        for (BlockStatementContext bsc : _localctx.blockStatement()) {
            s.append(bsc.bytecode);
        }
        $bytecode = s.toString();
    }
;

literal returns [String value]
    :   IntegerLiteral
    {$value = $IntegerLiteral.getText();}
    |   BooleanLiteral
    {$value = ($BooleanLiteral.getText().equals("true") ? "1" : "0");}
    |   'null'
    {$value = "0";}
;


blockStatement returns [String bytecode]
    :   localVariableDeclarationStatement
    {$bytecode = $localVariableDeclarationStatement.bytecode;}
    |   statement
    {$bytecode = $statement.bytecode;}
    ;

localVariableDeclarationStatement returns [String bytecode]
    :    localVariableDeclaration ';'
    {$bytecode = $localVariableDeclaration.bytecode;}
    ;

localVariableDeclaration returns [String bytecode]
    :   variableModifier* typeType variableDeclarator
    {$bytecode = "." + $typeType.text + " " + $variableDeclarator.bytecode + "\n";}
    ;

statement returns [String bytecode]
    :   '{' blockStatement* '}'
    {
        StringBuilder s = new StringBuilder();
        for (BlockStatementContext bsc : _localctx.blockStatement()) {
             s.append(bsc.bytecode);
        }
        $bytecode = s.toString();
    }
    |   'if' parExpression statement elseStatement?
    {
        StringBuilder s = new StringBuilder();
        String label = "if" + _localctx.statement.hashCode() + "\n";
        s.append($parExpression.bytecode);
        s.append(Cmd.pop + Cmd.eax + "\n");
        s.append(Cmd.jz + label);
        s.append($statement.bytecode);
        s.append(Cmd.label + label);
        if (_localctx.elseStatement != null) {
            s.append($elseStatement.bytecode);
        }
        $bytecode = s.toString();
    }
    |   'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement
    {
        StringBuilder s = new StringBuilder();
        s.append(Cmd.push + Cmd.eax + "\n");
        if (_localctx.forInit != null) {
            s.append($forInit.bytecode);
        }
        String label_out = "for_out" + _localctx.statement.hashCode() + "\n";
        String label = "for" + _localctx.statement.hashCode() + "\n";
        s.append(Cmd.jmp + label_out);
        s.append(Cmd.label + label);
        s.append($statement.bytecode);
        if (_localctx.forUpdate != null) {
            s.append($forUpdate.bytecode);
            s.append(Cmd.pop + Cmd.ebx + "\n");
        }
        s.append(Cmd.label + label_out);
        if (_localctx.expression != null) {
            s.append($expression.bytecode);
        }
        s.append(Cmd.pop + Cmd.eax + "\n");
        s.append(Cmd.jnz + label);
        s.append(Cmd.pop + Cmd.eax + "\n");
        $bytecode = s.toString();
    }
    |   'while' parExpression statement
    {
        StringBuilder s = new StringBuilder();
        String label_out = "while_out" + _localctx.statement.hashCode() + "\n";
        String label_in = "while" + _localctx.statement.hashCode() + "\n";
        s.append(Cmd.label + label_in);
        s.append($parExpression.bytecode);
        s.append(Cmd.pop + Cmd.eax + "\n");
        s.append(Cmd.jz + label_out);
        s.append($statement.bytecode);
        s.append(Cmd.jmp + label_in);
        s.append(Cmd.label + label_out);
        $bytecode = s.toString();
    }
    |   'do' statement 'while' parExpression ';'
    {
        StringBuilder s = new StringBuilder();
        String label = "do" + _localctx.statement.hashCode() + "\n";
        s.append(Cmd.label + label);
        s.append($statement.bytecode);
        s.append($parExpression.bytecode);
        s.append(Cmd.pop + Cmd.eax + "\n");
        s.append(Cmd.jnz + label);
        $bytecode = s.toString();
    }
    |   'return' expression? ';'
    {
        StringBuilder s = new StringBuilder();
        if (_localctx.expression != null) {
             s.append($expression.bytecode);
        }
        s.append(Cmd.ret);
        $bytecode = s.toString();
    }
    |   ';' {$bytecode = "";}
    |   expression ';'
    {$bytecode = $expression.bytecode;}
;


forInit returns [String bytecode]
    :   localVariableDeclaration
    {$bytecode = $localVariableDeclaration.bytecode;}
    |   expressionList
    {$bytecode = $expressionList.bytecode;}
    ;

forUpdate returns [String bytecode]
    :   expressionList
    {$bytecode = $expressionList.bytecode;}
    ;


parExpression returns [String bytecode]
    :   '(' expression ')'
    {$bytecode = $expression.bytecode;}
    ;

elseStatement returns [String bytecode]
    :   'else' statement
    {$bytecode = $statement.bytecode;}
    ;

expressionList returns [String bytecode, int count]
    :   expression (',' expression)*
    {
        StringBuilder s = new StringBuilder();
        for (ExpressionContext exc : _localctx.expression()) {
             s.append(exc.bytecode);
        }
        $bytecode = s.toString();
        $count = _localctx.expression().size();
    }
    ;


// May return a value at the top of the stack
expression returns [String bytecode, String name]
    :   primary
    {
        $bytecode = $primary.bytecode;
        $name = $primary.name;
    }
    |   expression '.' Identifier
    {
        $bytecode = ((ExpressionContext)_prevctx).bytecode;
        $name = ((ExpressionContext)_prevctx).name + "." + $Identifier.getText();
    }
    |   expression '(' expressionList? ')'
    {
        StringBuilder s = new StringBuilder();
        if (_localctx.expressionList != null) {
            s.append($expressionList.bytecode);
        }
        String name = ((ExpressionContext)_prevctx).name;
        if (name.equals("System.out.println")) {
            name = "print";
        }
        s.append(Cmd.call + name + "\n");
        $bytecode = s.toString();
        $name = "";
    }
    |   expression '++'
        {
            StringBuilder s = new StringBuilder();
            s.append(Cmd.push + _prevctx.name + "\n");
            s.append(Cmd.inc + _prevctx.name + "\n");
            $bytecode = s.toString();
        }
    |   expression '--'
        {
            StringBuilder s = new StringBuilder();
            s.append(Cmd.push + _prevctx.name + "\n");
            s.append(Cmd.dec + _prevctx.name + "\n");
            $bytecode = s.toString();
            $name = "";
        }
    |   '+' expression
        {
            $bytecode = $expression.bytecode;
            $name = "";
        }
    |   '-' expression
        {
            StringBuilder s = new StringBuilder();
            s.append(Cmd.push + 0 + "\n");
            s.append($expression.bytecode);
            s.append(Cmd.sub);
            $bytecode = s.toString();
        }
    |   '++' expression
        {
             StringBuilder s = new StringBuilder();
             s.append(Cmd.inc + $expression.name + "\n");
             s.append(Cmd.push + $expression.name + "\n");
             $bytecode = s.toString();
             $name = "";
        }
    |   '--' expression
        {
             StringBuilder s = new StringBuilder();
             s.append(Cmd.dec + $expression.name + "\n");
             s.append(Cmd.push + $expression.name + "\n");
             $bytecode = s.toString();
             $name = "";
        }
    |  '!' expression
        {
            StringBuilder s = new StringBuilder();
            s.append($expression.bytecode);
            s.append(Cmd.not);
            $bytecode = s.toString();

        }
    |  '~' expression
        {
            StringBuilder s = new StringBuilder();
            s.append($expression.bytecode);
            s.append(Cmd.neg);
            $bytecode = s.toString();

        }
    |   expression binop expression
    {
        StringBuilder s = new StringBuilder();
        s.append(((ExpressionContext)_localctx.children.get(2)).bytecode);
        s.append(((ExpressionContext)_localctx.children.get(0)).bytecode);
        s.append($binop.bytecode);
        $bytecode = s.toString();
        $name = "";
    }
    |   expression '?' expression ':' expression
    {
        StringBuilder s = new StringBuilder();
        s.append(((ExpressionContext)_localctx.children.get(0)).bytecode);
        String label = "ternary" + ((ExpressionContext)_localctx).hashCode() + "\n";
        String exit_label = "ternary" + (((ExpressionContext)_localctx).hashCode() + 1) + "\n";
        s.append(Cmd.pop + Cmd.eax + "\n");
        s.append(Cmd.jz + label);
        s.append(((ExpressionContext)_localctx.children.get(2)).bytecode);
        s.append(Cmd.jmp + exit_label);
        s.append(Cmd.label + label);
        s.append(((ExpressionContext)_localctx.children.get(4)).bytecode);
        s.append(Cmd.label + exit_label);
        $bytecode = s.toString();
        $name = "";
    }
    |   <assoc=right> expression '=' expression
    {
        StringBuilder s = new StringBuilder();
        String name = ((ExpressionContext)_localctx.children.get(0)).name;
        s.append(((ExpressionContext)_localctx.children.get(2)).bytecode);
        s.append(Cmd.pop + name + "\n");
        $bytecode = s.toString();
    }
    |   <assoc=right> expression updateBinop expression
    {
        StringBuilder s = new StringBuilder();
        String name = ((ExpressionContext)_localctx.children.get(0)).name;
        s.append(((ExpressionContext)_localctx.children.get(2)).bytecode);
        s.append(((ExpressionContext)_localctx.children.get(0)).bytecode);
        s.append($updateBinop.bytecode);
        s.append(Cmd.pop + name + "\n");
        $bytecode = s.toString();

    }
;

binop returns [String bytecode]
    :   '+'
    {$bytecode = Cmd.add;}
    |   '-'
    {$bytecode = Cmd.sub;}
    |   '*'
    {$bytecode = Cmd.mul;}
    |   '/'
    {$bytecode = Cmd.div;}
    |   '%'
    {$bytecode = Cmd.mod;}
    |   '<<'
    {$bytecode = Cmd.lsh;}
    |   '>>'
    {$bytecode = Cmd.rsh;}
    |   '<='
    {$bytecode = Cmd.le;}
    |   '>='
    {$bytecode = Cmd.ge;}
    |   '<'
    {$bytecode = Cmd.ls;}
    |   '>'
    {$bytecode = Cmd.gr;}
    |   '=='
    {$bytecode = Cmd.eq;}
    |   '!='
    {$bytecode = Cmd.neq;}
    |   '&&'
    {$bytecode = Cmd.and;}
    |   '||'
    {$bytecode = Cmd.or;}
    |   '&'
    {$bytecode = Cmd.and;}
    |   '|'
    {$bytecode = Cmd.or;}
    |   '^'
    {$bytecode = Cmd.xor;}
;

updateBinop returns [String bytecode]
    :   '+='
    {$bytecode = Cmd.add;}
    |   '-='
    {$bytecode = Cmd.sub;}
    |   '*='
    {$bytecode = Cmd.mul;}
    |   '/='
    {$bytecode = Cmd.div;}
    |   '&='
    {$bytecode = Cmd.and;}
    |   '|='
    {$bytecode = Cmd.or;}
    |   '^='
    {$bytecode = Cmd.xor;}
    |   '>>='
    {$bytecode = Cmd.rsh;}
    |   '<<='
    {$bytecode = Cmd.lsh;}
    |   '%='
    {$bytecode = Cmd.mod;}
;

primary returns [String bytecode, String name]
    :   '(' expression ')'
    {
        $bytecode = $expression.bytecode;
        $name = "";
    }
    |   literal
    {
        $bytecode = Cmd.push + $literal.value + "\n";
        $name = "";
    }
    |   Identifier
    {
        $bytecode = Cmd.push + $Identifier.getText() + "\n";
        $name = $Identifier.getText();
    }
;

BOOLEAN       : 'boolean';
CLASS         : 'class';
CONST         : 'const';
DO            : 'do';
ELSE          : 'else';
FINAL         : 'final';
FOR           : 'for';
IF            : 'if';
IMPORT        : 'import';
INT           : 'int';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
STATIC        : 'static';
VOID          : 'void';
WHILE         : 'while';

IntegerLiteral
    :   Sign?
        (   '0'
        |   NonZeroDigit Digit*
        )
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
Sign
    :   [+-]
;

BooleanLiteral
    :   'true'
    |   'false'
;

NullLiteral
    :   'null'
;

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';


ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] 
    |   ~[\u0000-\u007F\uD800-\uDBFF]
    |   [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_]
    |   ~[\u0000-\u007F\uD800-\uDBFF]
    |   [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
;
