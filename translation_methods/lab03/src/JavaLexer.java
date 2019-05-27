// Generated from Java.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BOOLEAN=3, CLASS=4, CONST=5, DO=6, ELSE=7, FINAL=8, FOR=9, 
		IF=10, IMPORT=11, INT=12, PACKAGE=13, PRIVATE=14, PROTECTED=15, PUBLIC=16, 
		RETURN=17, STATIC=18, VOID=19, WHILE=20, IntegerLiteral=21, BooleanLiteral=22, 
		NullLiteral=23, LPAREN=24, RPAREN=25, LBRACE=26, RBRACE=27, LBRACK=28, 
		RBRACK=29, SEMI=30, COMMA=31, DOT=32, ASSIGN=33, GT=34, LT=35, BANG=36, 
		TILDE=37, QUESTION=38, COLON=39, EQUAL=40, LE=41, GE=42, NOTEQUAL=43, 
		AND=44, OR=45, INC=46, DEC=47, ADD=48, SUB=49, MUL=50, DIV=51, BITAND=52, 
		BITOR=53, CARET=54, MOD=55, ADD_ASSIGN=56, SUB_ASSIGN=57, MUL_ASSIGN=58, 
		DIV_ASSIGN=59, AND_ASSIGN=60, OR_ASSIGN=61, XOR_ASSIGN=62, MOD_ASSIGN=63, 
		LSHIFT_ASSIGN=64, RSHIFT_ASSIGN=65, URSHIFT_ASSIGN=66, Identifier=67, 
		WS=68, COMMENT=69, LINE_COMMENT=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "BOOLEAN", "CLASS", "CONST", "DO", "ELSE", "FINAL", "FOR", 
		"IF", "IMPORT", "INT", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
		"STATIC", "VOID", "WHILE", "IntegerLiteral", "Digit", "NonZeroDigit", 
		"Sign", "BooleanLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", 
		"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
		"CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<<'", "'>>'", "'boolean'", "'class'", "'const'", "'do'", "'else'", 
		"'final'", "'for'", "'if'", "'import'", "'int'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'static'", "'void'", "'while'", 
		null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
		"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BOOLEAN", "CLASS", "CONST", "DO", "ELSE", "FINAL", 
		"FOR", "IF", "IMPORT", "INT", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
		"RETURN", "STATIC", "VOID", "WHILE", "IntegerLiteral", "BooleanLiteral", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u01d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\5\26\u010f"+
		"\n\26\3\26\3\26\3\26\7\26\u0114\n\26\f\26\16\26\u0117\13\26\5\26\u0119"+
		"\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u012a\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3"+
		">\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3E\3E\3"+
		"E\3E\3F\3F\3F\3F\3F\3G\3G\7G\u01a0\nG\fG\16G\u01a3\13G\3H\3H\3H\3H\5H"+
		"\u01a9\nH\3I\3I\3I\3I\5I\u01af\nI\3J\6J\u01b2\nJ\rJ\16J\u01b3\3J\3J\3"+
		"K\3K\3K\3K\7K\u01bc\nK\fK\16K\u01bf\13K\3K\3K\3K\3K\3K\3L\3L\3L\3L\7L"+
		"\u01ca\nL\fL\16L\u01cd\13L\3L\3L\3\u01bd\2M\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\2/\2\61\2\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'"+
		"S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\177>\u0081"+
		"?\u0083@\u0085A\u0087B\u0089C\u008bD\u008dE\u008f\2\u0091\2\u0093F\u0095"+
		"G\u0097H\3\2\f\3\2\62;\3\2\63;\4\2--//\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\2\u01d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2\2\5\u009c\3\2\2"+
		"\2\7\u009f\3\2\2\2\t\u00a7\3\2\2\2\13\u00ad\3\2\2\2\r\u00b3\3\2\2\2\17"+
		"\u00b6\3\2\2\2\21\u00bb\3\2\2\2\23\u00c1\3\2\2\2\25\u00c5\3\2\2\2\27\u00c8"+
		"\3\2\2\2\31\u00cf\3\2\2\2\33\u00d3\3\2\2\2\35\u00db\3\2\2\2\37\u00e3\3"+
		"\2\2\2!\u00ed\3\2\2\2#\u00f4\3\2\2\2%\u00fb\3\2\2\2\'\u0102\3\2\2\2)\u0107"+
		"\3\2\2\2+\u010e\3\2\2\2-\u011a\3\2\2\2/\u011c\3\2\2\2\61\u011e\3\2\2\2"+
		"\63\u0129\3\2\2\2\65\u012b\3\2\2\2\67\u0130\3\2\2\29\u0132\3\2\2\2;\u0134"+
		"\3\2\2\2=\u0136\3\2\2\2?\u0138\3\2\2\2A\u013a\3\2\2\2C\u013c\3\2\2\2E"+
		"\u013e\3\2\2\2G\u0140\3\2\2\2I\u0142\3\2\2\2K\u0144\3\2\2\2M\u0146\3\2"+
		"\2\2O\u0148\3\2\2\2Q\u014a\3\2\2\2S\u014c\3\2\2\2U\u014e\3\2\2\2W\u0150"+
		"\3\2\2\2Y\u0153\3\2\2\2[\u0156\3\2\2\2]\u0159\3\2\2\2_\u015c\3\2\2\2a"+
		"\u015f\3\2\2\2c\u0162\3\2\2\2e\u0165\3\2\2\2g\u0168\3\2\2\2i\u016a\3\2"+
		"\2\2k\u016c\3\2\2\2m\u016e\3\2\2\2o\u0170\3\2\2\2q\u0172\3\2\2\2s\u0174"+
		"\3\2\2\2u\u0176\3\2\2\2w\u0178\3\2\2\2y\u017b\3\2\2\2{\u017e\3\2\2\2}"+
		"\u0181\3\2\2\2\177\u0184\3\2\2\2\u0081\u0187\3\2\2\2\u0083\u018a\3\2\2"+
		"\2\u0085\u018d\3\2\2\2\u0087\u0190\3\2\2\2\u0089\u0194\3\2\2\2\u008b\u0198"+
		"\3\2\2\2\u008d\u019d\3\2\2\2\u008f\u01a8\3\2\2\2\u0091\u01ae\3\2\2\2\u0093"+
		"\u01b1\3\2\2\2\u0095\u01b7\3\2\2\2\u0097\u01c5\3\2\2\2\u0099\u009a\7>"+
		"\2\2\u009a\u009b\7>\2\2\u009b\4\3\2\2\2\u009c\u009d\7@\2\2\u009d\u009e"+
		"\7@\2\2\u009e\6\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2"+
		"\7q\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7u\2\2\u00ac\n\3\2\2\2\u00ad"+
		"\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7u\2\2"+
		"\u00b1\u00b2\7v\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7q"+
		"\2\2\u00b5\16\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9"+
		"\7u\2\2\u00b9\u00ba\7g\2\2\u00ba\20\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0"+
		"\22\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\24\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7h\2\2\u00c7\26\3\2\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7q\2\2"+
		"\u00cc\u00cd\7t\2\2\u00cd\u00ce\7v\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7"+
		"k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\32\3\2\2\2\u00d3\u00d4"+
		"\7r\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7m\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da\7g\2\2\u00da\34\3\2\2\2\u00db"+
		"\u00dc\7r\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7x\2\2"+
		"\u00df\u00e0\7c\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7g\2\2\u00e2\36\3\2"+
		"\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7f\2\2\u00ec \3\2\2\2\u00ed\u00ee\7r\2\2\u00ee"+
		"\u00ef\7w\2\2\u00ef\u00f0\7d\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7e\2\2\u00f3\"\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g"+
		"\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa$\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe"+
		"\7c\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7e\2\2\u0101"+
		"&\3\2\2\2\u0102\u0103\7x\2\2\u0103\u0104\7q\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7f\2\2\u0106(\3\2\2\2\u0107\u0108\7y\2\2\u0108\u0109\7j\2\2\u0109"+
		"\u010a\7k\2\2\u010a\u010b\7n\2\2\u010b\u010c\7g\2\2\u010c*\3\2\2\2\u010d"+
		"\u010f\5\61\31\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0118\3"+
		"\2\2\2\u0110\u0119\7\62\2\2\u0111\u0115\5/\30\2\u0112\u0114\5-\27\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0110\3\2\2\2\u0118"+
		"\u0111\3\2\2\2\u0119,\3\2\2\2\u011a\u011b\t\2\2\2\u011b.\3\2\2\2\u011c"+
		"\u011d\t\3\2\2\u011d\60\3\2\2\2\u011e\u011f\t\4\2\2\u011f\62\3\2\2\2\u0120"+
		"\u0121\7v\2\2\u0121\u0122\7t\2\2\u0122\u0123\7w\2\2\u0123\u012a\7g\2\2"+
		"\u0124\u0125\7h\2\2\u0125\u0126\7c\2\2\u0126\u0127\7n\2\2\u0127\u0128"+
		"\7u\2\2\u0128\u012a\7g\2\2\u0129\u0120\3\2\2\2\u0129\u0124\3\2\2\2\u012a"+
		"\64\3\2\2\2\u012b\u012c\7p\2\2\u012c\u012d\7w\2\2\u012d\u012e\7n\2\2\u012e"+
		"\u012f\7n\2\2\u012f\66\3\2\2\2\u0130\u0131\7*\2\2\u01318\3\2\2\2\u0132"+
		"\u0133\7+\2\2\u0133:\3\2\2\2\u0134\u0135\7}\2\2\u0135<\3\2\2\2\u0136\u0137"+
		"\7\177\2\2\u0137>\3\2\2\2\u0138\u0139\7]\2\2\u0139@\3\2\2\2\u013a\u013b"+
		"\7_\2\2\u013bB\3\2\2\2\u013c\u013d\7=\2\2\u013dD\3\2\2\2\u013e\u013f\7"+
		".\2\2\u013fF\3\2\2\2\u0140\u0141\7\60\2\2\u0141H\3\2\2\2\u0142\u0143\7"+
		"?\2\2\u0143J\3\2\2\2\u0144\u0145\7@\2\2\u0145L\3\2\2\2\u0146\u0147\7>"+
		"\2\2\u0147N\3\2\2\2\u0148\u0149\7#\2\2\u0149P\3\2\2\2\u014a\u014b\7\u0080"+
		"\2\2\u014bR\3\2\2\2\u014c\u014d\7A\2\2\u014dT\3\2\2\2\u014e\u014f\7<\2"+
		"\2\u014fV\3\2\2\2\u0150\u0151\7?\2\2\u0151\u0152\7?\2\2\u0152X\3\2\2\2"+
		"\u0153\u0154\7>\2\2\u0154\u0155\7?\2\2\u0155Z\3\2\2\2\u0156\u0157\7@\2"+
		"\2\u0157\u0158\7?\2\2\u0158\\\3\2\2\2\u0159\u015a\7#\2\2\u015a\u015b\7"+
		"?\2\2\u015b^\3\2\2\2\u015c\u015d\7(\2\2\u015d\u015e\7(\2\2\u015e`\3\2"+
		"\2\2\u015f\u0160\7~\2\2\u0160\u0161\7~\2\2\u0161b\3\2\2\2\u0162\u0163"+
		"\7-\2\2\u0163\u0164\7-\2\2\u0164d\3\2\2\2\u0165\u0166\7/\2\2\u0166\u0167"+
		"\7/\2\2\u0167f\3\2\2\2\u0168\u0169\7-\2\2\u0169h\3\2\2\2\u016a\u016b\7"+
		"/\2\2\u016bj\3\2\2\2\u016c\u016d\7,\2\2\u016dl\3\2\2\2\u016e\u016f\7\61"+
		"\2\2\u016fn\3\2\2\2\u0170\u0171\7(\2\2\u0171p\3\2\2\2\u0172\u0173\7~\2"+
		"\2\u0173r\3\2\2\2\u0174\u0175\7`\2\2\u0175t\3\2\2\2\u0176\u0177\7\'\2"+
		"\2\u0177v\3\2\2\2\u0178\u0179\7-\2\2\u0179\u017a\7?\2\2\u017ax\3\2\2\2"+
		"\u017b\u017c\7/\2\2\u017c\u017d\7?\2\2\u017dz\3\2\2\2\u017e\u017f\7,\2"+
		"\2\u017f\u0180\7?\2\2\u0180|\3\2\2\2\u0181\u0182\7\61\2\2\u0182\u0183"+
		"\7?\2\2\u0183~\3\2\2\2\u0184\u0185\7(\2\2\u0185\u0186\7?\2\2\u0186\u0080"+
		"\3\2\2\2\u0187\u0188\7~\2\2\u0188\u0189\7?\2\2\u0189\u0082\3\2\2\2\u018a"+
		"\u018b\7`\2\2\u018b\u018c\7?\2\2\u018c\u0084\3\2\2\2\u018d\u018e\7\'\2"+
		"\2\u018e\u018f\7?\2\2\u018f\u0086\3\2\2\2\u0190\u0191\7>\2\2\u0191\u0192"+
		"\7>\2\2\u0192\u0193\7?\2\2\u0193\u0088\3\2\2\2\u0194\u0195\7@\2\2\u0195"+
		"\u0196\7@\2\2\u0196\u0197\7?\2\2\u0197\u008a\3\2\2\2\u0198\u0199\7@\2"+
		"\2\u0199\u019a\7@\2\2\u019a\u019b\7@\2\2\u019b\u019c\7?\2\2\u019c\u008c"+
		"\3\2\2\2\u019d\u01a1\5\u008fH\2\u019e\u01a0\5\u0091I\2\u019f\u019e\3\2"+
		"\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u008e\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a9\t\5\2\2\u01a5\u01a9\n\6"+
		"\2\2\u01a6\u01a7\t\7\2\2\u01a7\u01a9\t\b\2\2\u01a8\u01a4\3\2\2\2\u01a8"+
		"\u01a5\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u0090\3\2\2\2\u01aa\u01af\t\t"+
		"\2\2\u01ab\u01af\n\6\2\2\u01ac\u01ad\t\7\2\2\u01ad\u01af\t\b\2\2\u01ae"+
		"\u01aa\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u0092\3\2"+
		"\2\2\u01b0\u01b2\t\n\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\bJ"+
		"\2\2\u01b6\u0094\3\2\2\2\u01b7\u01b8\7\61\2\2\u01b8\u01b9\7,\2\2\u01b9"+
		"\u01bd\3\2\2\2\u01ba\u01bc\13\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3"+
		"\2\2\2\u01bd\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c2\7\61\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c4\bK\3\2\u01c4\u0096\3\2\2\2\u01c5\u01c6\7\61\2\2\u01c6"+
		"\u01c7\7\61\2\2\u01c7\u01cb\3\2\2\2\u01c8\u01ca\n\13\2\2\u01c9\u01c8\3"+
		"\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\bL\3\2\u01cf\u0098\3\2"+
		"\2\2\r\2\u010e\u0115\u0118\u0129\u01a1\u01a8\u01ae\u01b3\u01bd\u01cb\4"+
		"\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}