// Generated from Java.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_qualifiedName = 2, 
		RULE_typeDeclaration = 3, RULE_classModifier = 4, RULE_variableModifier = 5, 
		RULE_classDeclaration = 6, RULE_classBodyDeclaration = 7, RULE_memberDeclaration = 8, 
		RULE_methodDeclaration = 9, RULE_fieldDeclaration = 10, RULE_variableDeclarator = 11, 
		RULE_variableDeclaratorId = 12, RULE_typeType = 13, RULE_classType = 14, 
		RULE_primitiveType = 15, RULE_formalParameters = 16, RULE_formalParameterList = 17, 
		RULE_formalParameter = 18, RULE_methodBody = 19, RULE_literal = 20, RULE_blockStatement = 21, 
		RULE_localVariableDeclarationStatement = 22, RULE_localVariableDeclaration = 23, 
		RULE_statement = 24, RULE_forInit = 25, RULE_forUpdate = 26, RULE_parExpression = 27, 
		RULE_elseStatement = 28, RULE_expressionList = 29, RULE_expression = 30, 
		RULE_binop = 31, RULE_updateBinop = 32, RULE_primary = 33;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "qualifiedName", "typeDeclaration", 
		"classModifier", "variableModifier", "classDeclaration", "classBodyDeclaration", 
		"memberDeclaration", "methodDeclaration", "fieldDeclaration", "variableDeclarator", 
		"variableDeclaratorId", "typeType", "classType", "primitiveType", "formalParameters", 
		"formalParameterList", "formalParameter", "methodBody", "literal", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"forInit", "forUpdate", "parExpression", "elseStatement", "expressionList", 
		"expression", "binop", "updateBinop", "primary"
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

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public String bytecode;
		public TypeDeclarationContext typeDeclaration;
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(68);
				importDeclaration();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SEMI))) != 0)) {
				{
				{
				setState(74);
				((CompilationUnitContext)_localctx).typeDeclaration = typeDeclaration();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(EOF);
			((CompilationUnitContext)_localctx).bytecode =  ((CompilationUnitContext)_localctx).typeDeclaration.bytecode;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IMPORT);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(84);
				match(STATIC);
				}
			}

			setState(87);
			qualifiedName();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(88);
				match(DOT);
				setState(89);
				match(MUL);
				}
			}

			setState(92);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(Identifier);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(DOT);
					setState(96);
					match(Identifier);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public ClassDeclarationContext classDeclaration;
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
					{
					{
					setState(102);
					classModifier();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				((TypeDeclarationContext)_localctx).classDeclaration = classDeclaration();
				((TypeDeclarationContext)_localctx).bytecode =  ((TypeDeclarationContext)_localctx).classDeclaration.bytecode;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CLASS);
			setState(119);
			((ClassDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(120);
			match(LBRACE);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID) | (1L << SEMI))) != 0) || _la==Identifier) {
				{
				{
				setState(121);
				classBodyDeclaration();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(RBRACE);
			StringBuilder s = new StringBuilder();
			        for (ClassBodyDeclarationContext cbdc : _localctx.classBodyDeclaration()) {
			             s.append(cbdc.bytecode);
			        }
			    ((ClassDeclarationContext)_localctx).bytecode =  Cmd.classDecl + ((ClassDeclarationContext)_localctx).Identifier.getText() + "\n" + s.toString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public MemberDeclarationContext memberDeclaration;
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(SEMI);
				}
				break;
			case BOOLEAN:
			case INT:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
					{
					{
					setState(131);
					classModifier();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				((ClassBodyDeclarationContext)_localctx).memberDeclaration = memberDeclaration();
				((ClassBodyDeclarationContext)_localctx).bytecode =  ((ClassBodyDeclarationContext)_localctx).memberDeclaration.bytecode;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public MethodDeclarationContext methodDeclaration;
		public FieldDeclarationContext fieldDeclaration;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memberDeclaration);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((MemberDeclarationContext)_localctx).methodDeclaration = methodDeclaration();
				((MemberDeclarationContext)_localctx).bytecode =  ((MemberDeclarationContext)_localctx).methodDeclaration.bytecode;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((MemberDeclarationContext)_localctx).fieldDeclaration = fieldDeclaration();
				((MemberDeclarationContext)_localctx).bytecode =  ((MemberDeclarationContext)_localctx).fieldDeclaration.bytecode;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public Token Identifier;
		public FormalParametersContext formalParameters;
		public MethodBodyContext methodBody;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case Identifier:
				{
				setState(150);
				typeType();
				}
				break;
			case VOID:
				{
				setState(151);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			((MethodDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(155);
			((MethodDeclarationContext)_localctx).formalParameters = formalParameters();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(156);
				match(LBRACK);
				setState(157);
				match(RBRACK);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(163);
				((MethodDeclarationContext)_localctx).methodBody = methodBody();
				}
				break;
			case SEMI:
				{
				setState(164);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        String typeId = _localctx.getChild(0).getText();
			        String id = ((MethodDeclarationContext)_localctx).Identifier.getText();
			        ((MethodDeclarationContext)_localctx).bytecode =  Cmd.methodDecl + ((MethodDeclarationContext)_localctx).Identifier.getText() + "\n" +
			                    (id.equals("main") ? "" : ((MethodDeclarationContext)_localctx).formalParameters.bytecode) + ((MethodDeclarationContext)_localctx).methodBody.bytecode +
			                    (typeId.equals("void") ? Cmd.ret : "") + "\n";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public TypeTypeContext typeType;
		public VariableDeclaratorContext variableDeclarator;
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((FieldDeclarationContext)_localctx).typeType = typeType();
			setState(170);
			((FieldDeclarationContext)_localctx).variableDeclarator = variableDeclarator();
			setState(171);
			match(SEMI);
			((FieldDeclarationContext)_localctx).bytecode =  "." + (((FieldDeclarationContext)_localctx).typeType!=null?_input.getText(((FieldDeclarationContext)_localctx).typeType.start,((FieldDeclarationContext)_localctx).typeType.stop):null) + " " + ((FieldDeclarationContext)_localctx).variableDeclarator.bytecode + "\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public String bytecode;
		public VariableDeclaratorIdContext variableDeclaratorId;
		public ExpressionContext expression;
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((VariableDeclaratorContext)_localctx).variableDeclaratorId = variableDeclaratorId();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(175);
				match(ASSIGN);
				setState(176);
				((VariableDeclaratorContext)_localctx).expression = expression(0);
				}
			}

			String id = (((VariableDeclaratorContext)_localctx).variableDeclaratorId!=null?_input.getText(((VariableDeclaratorContext)_localctx).variableDeclaratorId.start,((VariableDeclaratorContext)_localctx).variableDeclaratorId.stop):null);
			         String init = "";
			         if (_localctx.expression() != null) {
			             init = ((VariableDeclaratorContext)_localctx).expression.bytecode;
			         } else {
			             init = Cmd.push + "0\n";
			         }
			         ((VariableDeclaratorContext)_localctx).bytecode =  id + "\n" + init + Cmd.pop + id;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(Identifier);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(182);
				match(LBRACK);
				setState(183);
				match(RBRACK);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeType);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				classType();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(190);
					match(LBRACK);
					setState(191);
					match(RBRACK);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				primitiveType();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(198);
					match(LBRACK);
					setState(199);
					match(RBRACK);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(Identifier);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(208);
				match(DOT);
				setState(209);
				match(Identifier);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public String bytecode;
		public FormalParameterListContext formalParameterList;
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << FINAL) | (1L << INT))) != 0) || _la==Identifier) {
				{
				setState(218);
				((FormalParametersContext)_localctx).formalParameterList = formalParameterList();
				}
			}

			setState(221);
			match(RPAREN);

			        if (_localctx.formalParameterList != null) {
			            ((FormalParametersContext)_localctx).bytecode =  ((FormalParametersContext)_localctx).formalParameterList.bytecode;
			        } else {
			            ((FormalParametersContext)_localctx).bytecode =  "";
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public String bytecode;
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			formalParameter();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225);
				match(COMMA);
				setState(226);
				formalParameter();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        StringBuilder s = new StringBuilder();
			        for (FormalParameterContext fpc : _localctx.formalParameter()) {
			            s.insert(0, fpc.bytecode);
			        }
			        ((FormalParameterListContext)_localctx).bytecode =  s.toString();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public String bytecode;
		public TypeTypeContext typeType;
		public VariableDeclaratorIdContext variableDeclaratorId;
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(234);
				variableModifier();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			((FormalParameterContext)_localctx).typeType = typeType();
			setState(241);
			((FormalParameterContext)_localctx).variableDeclaratorId = variableDeclaratorId();

			        StringBuilder s = new StringBuilder();
			        s.append("." + (((FormalParameterContext)_localctx).typeType!=null?_input.getText(((FormalParameterContext)_localctx).typeType.start,((FormalParameterContext)_localctx).typeType.stop):null) + " " + (((FormalParameterContext)_localctx).variableDeclaratorId!=null?_input.getText(((FormalParameterContext)_localctx).variableDeclaratorId.start,((FormalParameterContext)_localctx).variableDeclaratorId.stop):null) + "\n");
			        s.append(Cmd.pop + (((FormalParameterContext)_localctx).variableDeclaratorId!=null?_input.getText(((FormalParameterContext)_localctx).variableDeclaratorId.start,((FormalParameterContext)_localctx).variableDeclaratorId.stop):null) + "\n");
			        ((FormalParameterContext)_localctx).bytecode =  s.toString();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public String bytecode;
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(LBRACE);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << DO) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				{
				setState(245);
				blockStatement();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(RBRACE);

			        StringBuilder s = new StringBuilder();
			        for (BlockStatementContext bsc : _localctx.blockStatement()) {
			            s.append(bsc.bytecode);
			        }
			        ((MethodBodyContext)_localctx).bytecode =  s.toString();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public String value;
		public Token IntegerLiteral;
		public Token BooleanLiteral;
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				((LiteralContext)_localctx).IntegerLiteral = match(IntegerLiteral);
				((LiteralContext)_localctx).value =  ((LiteralContext)_localctx).IntegerLiteral.getText();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((LiteralContext)_localctx).BooleanLiteral = match(BooleanLiteral);
				((LiteralContext)_localctx).value =  (((LiteralContext)_localctx).BooleanLiteral.getText().equals("true") ? "1" : "0");
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(NullLiteral);
				((LiteralContext)_localctx).value =  "0";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public String bytecode;
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement;
		public StatementContext statement;
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blockStatement);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((BlockStatementContext)_localctx).localVariableDeclarationStatement = localVariableDeclarationStatement();
				((BlockStatementContext)_localctx).bytecode =  ((BlockStatementContext)_localctx).localVariableDeclarationStatement.bytecode;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				((BlockStatementContext)_localctx).statement = statement();
				((BlockStatementContext)_localctx).bytecode =  ((BlockStatementContext)_localctx).statement.bytecode;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public String bytecode;
		public LocalVariableDeclarationContext localVariableDeclaration;
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			((LocalVariableDeclarationStatementContext)_localctx).localVariableDeclaration = localVariableDeclaration();
			setState(271);
			match(SEMI);
			((LocalVariableDeclarationStatementContext)_localctx).bytecode =  ((LocalVariableDeclarationStatementContext)_localctx).localVariableDeclaration.bytecode;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public TypeTypeContext typeType;
		public VariableDeclaratorContext variableDeclarator;
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(274);
				variableModifier();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			((LocalVariableDeclarationContext)_localctx).typeType = typeType();
			setState(281);
			((LocalVariableDeclarationContext)_localctx).variableDeclarator = variableDeclarator();
			((LocalVariableDeclarationContext)_localctx).bytecode =  "." + (((LocalVariableDeclarationContext)_localctx).typeType!=null?_input.getText(((LocalVariableDeclarationContext)_localctx).typeType.start,((LocalVariableDeclarationContext)_localctx).typeType.stop):null) + " " + ((LocalVariableDeclarationContext)_localctx).variableDeclarator.bytecode + "\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public String bytecode;
		public ParExpressionContext parExpression;
		public StatementContext statement;
		public ElseStatementContext elseStatement;
		public ForInitContext forInit;
		public ExpressionContext expression;
		public ForUpdateContext forUpdate;
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(LBRACE);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << DO) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					{
					setState(285);
					blockStatement();
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(291);
				match(RBRACE);

				        StringBuilder s = new StringBuilder();
				        for (BlockStatementContext bsc : _localctx.blockStatement()) {
				             s.append(bsc.bytecode);
				        }
				        ((StatementContext)_localctx).bytecode =  s.toString();
				    
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(IF);
				setState(294);
				((StatementContext)_localctx).parExpression = parExpression();
				setState(295);
				((StatementContext)_localctx).statement = statement();
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(296);
					((StatementContext)_localctx).elseStatement = elseStatement();
					}
					break;
				}

				        StringBuilder s = new StringBuilder();
				        String label = "if" + _localctx.statement.hashCode() + "\n";
				        s.append(((StatementContext)_localctx).parExpression.bytecode);
				        s.append(Cmd.pop + Cmd.eax + "\n");
				        s.append(Cmd.jz + label);
				        s.append(((StatementContext)_localctx).statement.bytecode);
				        s.append(Cmd.label + label);
				        if (_localctx.elseStatement != null) {
				            s.append(((StatementContext)_localctx).elseStatement.bytecode);
				        }
				        ((StatementContext)_localctx).bytecode =  s.toString();
				    
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(FOR);
				setState(302);
				match(LPAREN);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << FINAL) | (1L << INT) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(303);
					((StatementContext)_localctx).forInit = forInit();
					}
				}

				setState(306);
				match(SEMI);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (IntegerLiteral - 21)) | (1L << (BooleanLiteral - 21)) | (1L << (NullLiteral - 21)) | (1L << (LPAREN - 21)) | (1L << (BANG - 21)) | (1L << (TILDE - 21)) | (1L << (INC - 21)) | (1L << (DEC - 21)) | (1L << (ADD - 21)) | (1L << (SUB - 21)) | (1L << (Identifier - 21)))) != 0)) {
					{
					setState(307);
					((StatementContext)_localctx).expression = expression(0);
					}
				}

				setState(310);
				match(SEMI);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (IntegerLiteral - 21)) | (1L << (BooleanLiteral - 21)) | (1L << (NullLiteral - 21)) | (1L << (LPAREN - 21)) | (1L << (BANG - 21)) | (1L << (TILDE - 21)) | (1L << (INC - 21)) | (1L << (DEC - 21)) | (1L << (ADD - 21)) | (1L << (SUB - 21)) | (1L << (Identifier - 21)))) != 0)) {
					{
					setState(311);
					((StatementContext)_localctx).forUpdate = forUpdate();
					}
				}

				setState(314);
				match(RPAREN);
				setState(315);
				((StatementContext)_localctx).statement = statement();

				        StringBuilder s = new StringBuilder();
				        s.append(Cmd.push + Cmd.eax + "\n");
				        if (_localctx.forInit != null) {
				            s.append(((StatementContext)_localctx).forInit.bytecode);
				        }
				        String label_out = "for_out" + _localctx.statement.hashCode() + "\n";
				        String label = "for" + _localctx.statement.hashCode() + "\n";
				        s.append(Cmd.jmp + label_out);
				        s.append(Cmd.label + label);
				        s.append(((StatementContext)_localctx).statement.bytecode);
				        if (_localctx.forUpdate != null) {
				            s.append(((StatementContext)_localctx).forUpdate.bytecode);
				            s.append(Cmd.pop + Cmd.ebx + "\n");
				        }
				        s.append(Cmd.label + label_out);
				        if (_localctx.expression != null) {
				            s.append(((StatementContext)_localctx).expression.bytecode);
				        }
				        s.append(Cmd.pop + Cmd.eax + "\n");
				        s.append(Cmd.jnz + label);
				        s.append(Cmd.pop + Cmd.eax + "\n");
				        ((StatementContext)_localctx).bytecode =  s.toString();
				    
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(WHILE);
				setState(319);
				((StatementContext)_localctx).parExpression = parExpression();
				setState(320);
				((StatementContext)_localctx).statement = statement();

				        StringBuilder s = new StringBuilder();
				        String label_out = "while_out" + _localctx.statement.hashCode() + "\n";
				        String label_in = "while" + _localctx.statement.hashCode() + "\n";
				        s.append(Cmd.label + label_in);
				        s.append(((StatementContext)_localctx).parExpression.bytecode);
				        s.append(Cmd.pop + Cmd.eax + "\n");
				        s.append(Cmd.jz + label_out);
				        s.append(((StatementContext)_localctx).statement.bytecode);
				        s.append(Cmd.jmp + label_in);
				        s.append(Cmd.label + label_out);
				        ((StatementContext)_localctx).bytecode =  s.toString();
				    
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(DO);
				setState(324);
				((StatementContext)_localctx).statement = statement();
				setState(325);
				match(WHILE);
				setState(326);
				((StatementContext)_localctx).parExpression = parExpression();
				setState(327);
				match(SEMI);

				        StringBuilder s = new StringBuilder();
				        String label = "do" + _localctx.statement.hashCode() + "\n";
				        s.append(Cmd.label + label);
				        s.append(((StatementContext)_localctx).statement.bytecode);
				        s.append(((StatementContext)_localctx).parExpression.bytecode);
				        s.append(Cmd.pop + Cmd.eax + "\n");
				        s.append(Cmd.jnz + label);
				        ((StatementContext)_localctx).bytecode =  s.toString();
				    
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(330);
				match(RETURN);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (IntegerLiteral - 21)) | (1L << (BooleanLiteral - 21)) | (1L << (NullLiteral - 21)) | (1L << (LPAREN - 21)) | (1L << (BANG - 21)) | (1L << (TILDE - 21)) | (1L << (INC - 21)) | (1L << (DEC - 21)) | (1L << (ADD - 21)) | (1L << (SUB - 21)) | (1L << (Identifier - 21)))) != 0)) {
					{
					setState(331);
					((StatementContext)_localctx).expression = expression(0);
					}
				}

				setState(334);
				match(SEMI);

				        StringBuilder s = new StringBuilder();
				        if (_localctx.expression != null) {
				             s.append(((StatementContext)_localctx).expression.bytecode);
				        }
				        s.append(Cmd.ret);
				        ((StatementContext)_localctx).bytecode =  s.toString();
				    
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				match(SEMI);
				((StatementContext)_localctx).bytecode =  "";
				}
				break;
			case IntegerLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 8);
				{
				setState(338);
				((StatementContext)_localctx).expression = expression(0);
				setState(339);
				match(SEMI);
				((StatementContext)_localctx).bytecode =  ((StatementContext)_localctx).expression.bytecode;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public String bytecode;
		public LocalVariableDeclarationContext localVariableDeclaration;
		public ExpressionListContext expressionList;
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forInit);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				((ForInitContext)_localctx).localVariableDeclaration = localVariableDeclaration();
				((ForInitContext)_localctx).bytecode =  ((ForInitContext)_localctx).localVariableDeclaration.bytecode;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				((ForInitContext)_localctx).expressionList = expressionList();
				((ForInitContext)_localctx).bytecode =  ((ForInitContext)_localctx).expressionList.bytecode;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public String bytecode;
		public ExpressionListContext expressionList;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((ForUpdateContext)_localctx).expressionList = expressionList();
			((ForUpdateContext)_localctx).bytecode =  ((ForUpdateContext)_localctx).expressionList.bytecode;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public String bytecode;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(LPAREN);
			setState(356);
			((ParExpressionContext)_localctx).expression = expression(0);
			setState(357);
			match(RPAREN);
			((ParExpressionContext)_localctx).bytecode =  ((ParExpressionContext)_localctx).expression.bytecode;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public String bytecode;
		public StatementContext statement;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(ELSE);
			setState(361);
			((ElseStatementContext)_localctx).statement = statement();
			((ElseStatementContext)_localctx).bytecode =  ((ElseStatementContext)_localctx).statement.bytecode;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public String bytecode;
		public int count;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			expression(0);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				expression(0);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        StringBuilder s = new StringBuilder();
			        for (ExpressionContext exc : _localctx.expression()) {
			             s.append(exc.bytecode);
			        }
			        ((ExpressionListContext)_localctx).bytecode =  s.toString();
			        ((ExpressionListContext)_localctx).count =  _localctx.expression().size();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String bytecode;
		public String name;
		public PrimaryContext primary;
		public ExpressionContext expression;
		public BinopContext binop;
		public UpdateBinopContext updateBinop;
		public Token Identifier;
		public ExpressionListContext expressionList;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public UpdateBinopContext updateBinop() {
			return getRuleContext(UpdateBinopContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case LPAREN:
			case Identifier:
				{
				setState(375);
				((ExpressionContext)_localctx).primary = primary();

				        ((ExpressionContext)_localctx).bytecode =  ((ExpressionContext)_localctx).primary.bytecode;
				        ((ExpressionContext)_localctx).name =  ((ExpressionContext)_localctx).primary.name;
				    
				}
				break;
			case ADD:
				{
				setState(378);
				match(ADD);
				setState(379);
				((ExpressionContext)_localctx).expression = expression(10);

				            ((ExpressionContext)_localctx).bytecode =  ((ExpressionContext)_localctx).expression.bytecode;
				            ((ExpressionContext)_localctx).name =  "";
				        
				}
				break;
			case SUB:
				{
				setState(382);
				match(SUB);
				setState(383);
				((ExpressionContext)_localctx).expression = expression(9);

				            StringBuilder s = new StringBuilder();
				            s.append(Cmd.push + 0 + "\n");
				            s.append(((ExpressionContext)_localctx).expression.bytecode);
				            s.append(Cmd.sub);
				            ((ExpressionContext)_localctx).bytecode =  s.toString();
				        
				}
				break;
			case INC:
				{
				setState(386);
				match(INC);
				setState(387);
				((ExpressionContext)_localctx).expression = expression(8);

				             StringBuilder s = new StringBuilder();
				             s.append(Cmd.inc + ((ExpressionContext)_localctx).expression.name + "\n");
				             s.append(Cmd.push + ((ExpressionContext)_localctx).expression.name + "\n");
				             ((ExpressionContext)_localctx).bytecode =  s.toString();
				             ((ExpressionContext)_localctx).name =  "";
				        
				}
				break;
			case DEC:
				{
				setState(390);
				match(DEC);
				setState(391);
				((ExpressionContext)_localctx).expression = expression(7);

				             StringBuilder s = new StringBuilder();
				             s.append(Cmd.dec + ((ExpressionContext)_localctx).expression.name + "\n");
				             s.append(Cmd.push + ((ExpressionContext)_localctx).expression.name + "\n");
				             ((ExpressionContext)_localctx).bytecode =  s.toString();
				             ((ExpressionContext)_localctx).name =  "";
				        
				}
				break;
			case BANG:
				{
				setState(394);
				match(BANG);
				setState(395);
				((ExpressionContext)_localctx).expression = expression(6);

				            StringBuilder s = new StringBuilder();
				            s.append(((ExpressionContext)_localctx).expression.bytecode);
				            s.append(Cmd.not);
				            ((ExpressionContext)_localctx).bytecode =  s.toString();

				        
				}
				break;
			case TILDE:
				{
				setState(398);
				match(TILDE);
				setState(399);
				((ExpressionContext)_localctx).expression = expression(5);

				            StringBuilder s = new StringBuilder();
				            s.append(((ExpressionContext)_localctx).expression.bytecode);
				            s.append(Cmd.neg);
				            ((ExpressionContext)_localctx).bytecode =  s.toString();

				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(443);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(405);
						((ExpressionContext)_localctx).binop = binop();
						setState(406);
						((ExpressionContext)_localctx).expression = expression(5);

						                  StringBuilder s = new StringBuilder();
						                  s.append(((ExpressionContext)_localctx.children.get(2)).bytecode);
						                  s.append(((ExpressionContext)_localctx.children.get(0)).bytecode);
						                  s.append(((ExpressionContext)_localctx).binop.bytecode);
						                  ((ExpressionContext)_localctx).bytecode =  s.toString();
						                  ((ExpressionContext)_localctx).name =  "";
						              
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(409);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(410);
						match(QUESTION);
						setState(411);
						((ExpressionContext)_localctx).expression = expression(0);
						setState(412);
						match(COLON);
						setState(413);
						((ExpressionContext)_localctx).expression = expression(4);

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
						                  ((ExpressionContext)_localctx).bytecode =  s.toString();
						                  ((ExpressionContext)_localctx).name =  "";
						              
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(416);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(417);
						match(ASSIGN);
						setState(418);
						((ExpressionContext)_localctx).expression = expression(2);

						                  StringBuilder s = new StringBuilder();
						                  String name = ((ExpressionContext)_localctx.children.get(0)).name;
						                  s.append(((ExpressionContext)_localctx.children.get(2)).bytecode);
						                  s.append(Cmd.pop + name + "\n");
						                  ((ExpressionContext)_localctx).bytecode =  s.toString();
						              
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(421);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(422);
						((ExpressionContext)_localctx).updateBinop = updateBinop();
						setState(423);
						((ExpressionContext)_localctx).expression = expression(1);

						                  StringBuilder s = new StringBuilder();
						                  String name = ((ExpressionContext)_localctx.children.get(0)).name;
						                  s.append(((ExpressionContext)_localctx.children.get(2)).bytecode);
						                  s.append(((ExpressionContext)_localctx.children.get(0)).bytecode);
						                  s.append(((ExpressionContext)_localctx).updateBinop.bytecode);
						                  s.append(Cmd.pop + name + "\n");
						                  ((ExpressionContext)_localctx).bytecode =  s.toString();

						              
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(426);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(427);
						match(DOT);
						setState(428);
						((ExpressionContext)_localctx).Identifier = match(Identifier);

						                  ((ExpressionContext)_localctx).bytecode =  ((ExpressionContext)_prevctx).bytecode;
						                  ((ExpressionContext)_localctx).name =  ((ExpressionContext)_prevctx).name + "." + ((ExpressionContext)_localctx).Identifier.getText();
						              
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(431);
						match(LPAREN);
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (IntegerLiteral - 21)) | (1L << (BooleanLiteral - 21)) | (1L << (NullLiteral - 21)) | (1L << (LPAREN - 21)) | (1L << (BANG - 21)) | (1L << (TILDE - 21)) | (1L << (INC - 21)) | (1L << (DEC - 21)) | (1L << (ADD - 21)) | (1L << (SUB - 21)) | (1L << (Identifier - 21)))) != 0)) {
							{
							setState(432);
							((ExpressionContext)_localctx).expressionList = expressionList();
							}
						}

						setState(435);
						match(RPAREN);

						                  StringBuilder s = new StringBuilder();
						                  if (_localctx.expressionList != null) {
						                      s.append(((ExpressionContext)_localctx).expressionList.bytecode);
						                  }
						                  String name = ((ExpressionContext)_prevctx).name;
						                  if (name.equals("System.out.println")) {
						                      name = "print";
						                  }
						                  s.append(Cmd.call + name + "\n");
						                  ((ExpressionContext)_localctx).bytecode =  s.toString();
						                  ((ExpressionContext)_localctx).name =  "";
						              
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(437);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(438);
						match(INC);

						                      StringBuilder s = new StringBuilder();
						                      s.append(Cmd.push + _prevctx.name + "\n");
						                      s.append(Cmd.inc + _prevctx.name + "\n");
						                      ((ExpressionContext)_localctx).bytecode =  s.toString();
						                  
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(440);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(441);
						match(DEC);

						                      StringBuilder s = new StringBuilder();
						                      s.append(Cmd.push + _prevctx.name + "\n");
						                      s.append(Cmd.dec + _prevctx.name + "\n");
						                      ((ExpressionContext)_localctx).bytecode =  s.toString();
						                      ((ExpressionContext)_localctx).name =  "";
						                  
						}
						break;
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinopContext extends ParserRuleContext {
		public String bytecode;
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_binop);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(ADD);
				((BinopContext)_localctx).bytecode =  Cmd.add;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(SUB);
				((BinopContext)_localctx).bytecode =  Cmd.sub;
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(MUL);
				((BinopContext)_localctx).bytecode =  Cmd.mul;
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				match(DIV);
				((BinopContext)_localctx).bytecode =  Cmd.div;
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				match(MOD);
				((BinopContext)_localctx).bytecode =  Cmd.mod;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(458);
				match(T__0);
				((BinopContext)_localctx).bytecode =  Cmd.lsh;
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				match(T__1);
				((BinopContext)_localctx).bytecode =  Cmd.rsh;
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 8);
				{
				setState(462);
				match(LE);
				((BinopContext)_localctx).bytecode =  Cmd.le;
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 9);
				{
				setState(464);
				match(GE);
				((BinopContext)_localctx).bytecode =  Cmd.ge;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 10);
				{
				setState(466);
				match(LT);
				((BinopContext)_localctx).bytecode =  Cmd.ls;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 11);
				{
				setState(468);
				match(GT);
				((BinopContext)_localctx).bytecode =  Cmd.gr;
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(470);
				match(EQUAL);
				((BinopContext)_localctx).bytecode =  Cmd.eq;
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(472);
				match(NOTEQUAL);
				((BinopContext)_localctx).bytecode =  Cmd.neq;
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 14);
				{
				setState(474);
				match(AND);
				((BinopContext)_localctx).bytecode =  Cmd.and;
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 15);
				{
				setState(476);
				match(OR);
				((BinopContext)_localctx).bytecode =  Cmd.or;
				}
				break;
			case BITAND:
				enterOuterAlt(_localctx, 16);
				{
				setState(478);
				match(BITAND);
				((BinopContext)_localctx).bytecode =  Cmd.and;
				}
				break;
			case BITOR:
				enterOuterAlt(_localctx, 17);
				{
				setState(480);
				match(BITOR);
				((BinopContext)_localctx).bytecode =  Cmd.or;
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 18);
				{
				setState(482);
				match(CARET);
				((BinopContext)_localctx).bytecode =  Cmd.xor;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateBinopContext extends ParserRuleContext {
		public String bytecode;
		public UpdateBinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateBinop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterUpdateBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitUpdateBinop(this);
		}
	}

	public final UpdateBinopContext updateBinop() throws RecognitionException {
		UpdateBinopContext _localctx = new UpdateBinopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_updateBinop);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(ADD_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.add;
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(SUB_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.sub;
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(MUL_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.mul;
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				match(DIV_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.div;
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				match(AND_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.and;
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(496);
				match(OR_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.or;
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 7);
				{
				setState(498);
				match(XOR_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.xor;
				}
				break;
			case RSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 8);
				{
				setState(500);
				match(RSHIFT_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.rsh;
				}
				break;
			case LSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(502);
				match(LSHIFT_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.lsh;
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 10);
				{
				setState(504);
				match(MOD_ASSIGN);
				((UpdateBinopContext)_localctx).bytecode =  Cmd.mod;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public String bytecode;
		public String name;
		public ExpressionContext expression;
		public LiteralContext literal;
		public Token Identifier;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primary);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(LPAREN);
				setState(509);
				((PrimaryContext)_localctx).expression = expression(0);
				setState(510);
				match(RPAREN);

				        ((PrimaryContext)_localctx).bytecode =  ((PrimaryContext)_localctx).expression.bytecode;
				        ((PrimaryContext)_localctx).name =  "";
				    
				}
				break;
			case IntegerLiteral:
			case BooleanLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				((PrimaryContext)_localctx).literal = literal();

				        ((PrimaryContext)_localctx).bytecode =  Cmd.push + ((PrimaryContext)_localctx).literal.value + "\n";
				        ((PrimaryContext)_localctx).name =  "";
				    
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				((PrimaryContext)_localctx).Identifier = match(Identifier);

				        ((PrimaryContext)_localctx).bytecode =  Cmd.push + ((PrimaryContext)_localctx).Identifier.getText() + "\n";
				        ((PrimaryContext)_localctx).name =  ((PrimaryContext)_localctx).Identifier.getText();
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u020b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2\16\2Q\13"+
		"\2\3\2\3\2\3\2\3\3\3\3\5\3X\n\3\3\3\3\3\3\3\5\3]\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\7\4d\n\4\f\4\16\4g\13\4\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\5"+
		"\5\5s\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b"+
		"\3\b\3\b\3\b\3\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\t\5\t"+
		"\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0097\n\n\3\13\3\13\5\13\u009b"+
		"\n\13\3\13\3\13\3\13\3\13\7\13\u00a1\n\13\f\13\16\13\u00a4\13\13\3\13"+
		"\3\13\5\13\u00a8\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00b4"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u00bb\n\16\f\16\16\16\u00be\13\16\3\17"+
		"\3\17\3\17\7\17\u00c3\n\17\f\17\16\17\u00c6\13\17\3\17\3\17\3\17\7\17"+
		"\u00cb\n\17\f\17\16\17\u00ce\13\17\5\17\u00d0\n\17\3\20\3\20\3\20\7\20"+
		"\u00d5\n\20\f\20\16\20\u00d8\13\20\3\21\3\21\3\22\3\22\5\22\u00de\n\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00e6\n\23\f\23\16\23\u00e9\13\23"+
		"\3\23\3\23\3\24\7\24\u00ee\n\24\f\24\16\24\u00f1\13\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\7\25\u00f9\n\25\f\25\16\25\u00fc\13\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0107\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u010f\n\27\3\30\3\30\3\30\3\30\3\31\7\31\u0116\n\31\f\31\16"+
		"\31\u0119\13\31\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u0121\n\32\f\32\16"+
		"\32\u0124\13\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012c\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0133\n\32\3\32\3\32\5\32\u0137\n\32\3\32\3\32\5"+
		"\32\u013b\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014f\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0159\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0161\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\7\37\u0172\n\37\f\37\16\37\u0175\13\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \5 \u0195\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01b4\n \3 \3 \3 \3 \3 \3"+
		" \3 \3 \7 \u01be\n \f \16 \u01c1\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\5!\u01e7\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01fd\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\5#\u0209\n#\3#\2\3>$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BD\2\4\4\2\20\22\24\24\4\2\5\5\16\16\2\u023e\2I\3"+
		"\2\2\2\4U\3\2\2\2\6`\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\fv\3\2\2\2\16x\3\2"+
		"\2\2\20\u008e\3\2\2\2\22\u0096\3\2\2\2\24\u009a\3\2\2\2\26\u00ab\3\2\2"+
		"\2\30\u00b0\3\2\2\2\32\u00b7\3\2\2\2\34\u00cf\3\2\2\2\36\u00d1\3\2\2\2"+
		" \u00d9\3\2\2\2\"\u00db\3\2\2\2$\u00e2\3\2\2\2&\u00ef\3\2\2\2(\u00f6\3"+
		"\2\2\2*\u0106\3\2\2\2,\u010e\3\2\2\2.\u0110\3\2\2\2\60\u0117\3\2\2\2\62"+
		"\u0158\3\2\2\2\64\u0160\3\2\2\2\66\u0162\3\2\2\28\u0165\3\2\2\2:\u016a"+
		"\3\2\2\2<\u016e\3\2\2\2>\u0194\3\2\2\2@\u01e6\3\2\2\2B\u01fc\3\2\2\2D"+
		"\u0208\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2"+
		"\2\2KI\3\2\2\2LN\5\b\5\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2"+
		"\2\2QO\3\2\2\2RS\7\2\2\3ST\b\2\1\2T\3\3\2\2\2UW\7\r\2\2VX\7\24\2\2WV\3"+
		"\2\2\2WX\3\2\2\2XY\3\2\2\2Y\\\5\6\4\2Z[\7\"\2\2[]\7\64\2\2\\Z\3\2\2\2"+
		"\\]\3\2\2\2]^\3\2\2\2^_\7 \2\2_\5\3\2\2\2`e\7E\2\2ab\7\"\2\2bd\7E\2\2"+
		"ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2\2\2hj\5\n\6"+
		"\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\5\16"+
		"\b\2op\b\5\1\2ps\3\2\2\2qs\7 \2\2rk\3\2\2\2rq\3\2\2\2s\t\3\2\2\2tu\t\2"+
		"\2\2u\13\3\2\2\2vw\7\n\2\2w\r\3\2\2\2xy\7\6\2\2yz\7E\2\2z~\7\34\2\2{}"+
		"\5\20\t\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\35\2\2\u0082\u0083\b\b\1\2\u0083\17"+
		"\3\2\2\2\u0084\u008f\7 \2\2\u0085\u0087\5\n\6\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\22\n\2\u008c\u008d\b\t\1\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0088\3\2\2\2\u008f\21\3\2\2"+
		"\2\u0090\u0091\5\24\13\2\u0091\u0092\b\n\1\2\u0092\u0097\3\2\2\2\u0093"+
		"\u0094\5\26\f\2\u0094\u0095\b\n\1\2\u0095\u0097\3\2\2\2\u0096\u0090\3"+
		"\2\2\2\u0096\u0093\3\2\2\2\u0097\23\3\2\2\2\u0098\u009b\5\34\17\2\u0099"+
		"\u009b\7\25\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009d\7E\2\2\u009d\u00a2\5\"\22\2\u009e\u009f\7\36\2\2\u009f"+
		"\u00a1\7\37\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\5(\25\2\u00a6\u00a8\7 \2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\13\1\2\u00aa\25\3\2\2\2\u00ab\u00ac"+
		"\5\34\17\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7 \2\2\u00ae\u00af\b\f\1\2"+
		"\u00af\27\3\2\2\2\u00b0\u00b3\5\32\16\2\u00b1\u00b2\7#\2\2\u00b2\u00b4"+
		"\5> \2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\b\r\1\2\u00b6\31\3\2\2\2\u00b7\u00bc\7E\2\2\u00b8\u00b9\7\36\2"+
		"\2\u00b9\u00bb\7\37\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\u00c4\5\36\20\2\u00c0\u00c1\7\36\2\2\u00c1\u00c3\7\37\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00d0\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cc\5 \21\2\u00c8"+
		"\u00c9\7\36\2\2\u00c9\u00cb\7\37\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00bf\3\2\2\2\u00cf\u00c7\3\2\2\2\u00d0\35\3\2\2"+
		"\2\u00d1\u00d6\7E\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d5\7E\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\37\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\t\3\2\2\u00da!\3\2\2\2\u00db"+
		"\u00dd\7\32\2\2\u00dc\u00de\5$\23\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\33\2\2\u00e0\u00e1\b\22\1\2\u00e1"+
		"#\3\2\2\2\u00e2\u00e7\5&\24\2\u00e3\u00e4\7!\2\2\u00e4\u00e6\5&\24\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\b\23\1\2\u00eb"+
		"%\3\2\2\2\u00ec\u00ee\5\f\7\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\b\24"+
		"\1\2\u00f5\'\3\2\2\2\u00f6\u00fa\7\34\2\2\u00f7\u00f9\5,\27\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\35\2\2\u00fe\u00ff\b"+
		"\25\1\2\u00ff)\3\2\2\2\u0100\u0101\7\27\2\2\u0101\u0107\b\26\1\2\u0102"+
		"\u0103\7\30\2\2\u0103\u0107\b\26\1\2\u0104\u0105\7\31\2\2\u0105\u0107"+
		"\b\26\1\2\u0106\u0100\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0107+\3\2\2\2\u0108\u0109\5.\30\2\u0109\u010a\b\27\1\2\u010a\u010f\3"+
		"\2\2\2\u010b\u010c\5\62\32\2\u010c\u010d\b\27\1\2\u010d\u010f\3\2\2\2"+
		"\u010e\u0108\3\2\2\2\u010e\u010b\3\2\2\2\u010f-\3\2\2\2\u0110\u0111\5"+
		"\60\31\2\u0111\u0112\7 \2\2\u0112\u0113\b\30\1\2\u0113/\3\2\2\2\u0114"+
		"\u0116\5\f\7\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\5\34\17\2\u011b\u011c\5\30\r\2\u011c\u011d\b\31\1\2\u011d\61\3"+
		"\2\2\2\u011e\u0122\7\34\2\2\u011f\u0121\5,\27\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\35\2\2\u0126\u0159\b\32\1\2\u0127"+
		"\u0128\7\f\2\2\u0128\u0129\58\35\2\u0129\u012b\5\62\32\2\u012a\u012c\5"+
		":\36\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\b\32\1\2\u012e\u0159\3\2\2\2\u012f\u0130\7\13\2\2\u0130\u0132\7"+
		"\32\2\2\u0131\u0133\5\64\33\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u0136\7 \2\2\u0135\u0137\5> \2\u0136\u0135"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\7 \2\2\u0139"+
		"\u013b\5\66\34\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3"+
		"\2\2\2\u013c\u013d\7\33\2\2\u013d\u013e\5\62\32\2\u013e\u013f\b\32\1\2"+
		"\u013f\u0159\3\2\2\2\u0140\u0141\7\26\2\2\u0141\u0142\58\35\2\u0142\u0143"+
		"\5\62\32\2\u0143\u0144\b\32\1\2\u0144\u0159\3\2\2\2\u0145\u0146\7\b\2"+
		"\2\u0146\u0147\5\62\32\2\u0147\u0148\7\26\2\2\u0148\u0149\58\35\2\u0149"+
		"\u014a\7 \2\2\u014a\u014b\b\32\1\2\u014b\u0159\3\2\2\2\u014c\u014e\7\23"+
		"\2\2\u014d\u014f\5> \2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\7 \2\2\u0151\u0159\b\32\1\2\u0152\u0153\7 \2\2\u0153"+
		"\u0159\b\32\1\2\u0154\u0155\5> \2\u0155\u0156\7 \2\2\u0156\u0157\b\32"+
		"\1\2\u0157\u0159\3\2\2\2\u0158\u011e\3\2\2\2\u0158\u0127\3\2\2\2\u0158"+
		"\u012f\3\2\2\2\u0158\u0140\3\2\2\2\u0158\u0145\3\2\2\2\u0158\u014c\3\2"+
		"\2\2\u0158\u0152\3\2\2\2\u0158\u0154\3\2\2\2\u0159\63\3\2\2\2\u015a\u015b"+
		"\5\60\31\2\u015b\u015c\b\33\1\2\u015c\u0161\3\2\2\2\u015d\u015e\5<\37"+
		"\2\u015e\u015f\b\33\1\2\u015f\u0161\3\2\2\2\u0160\u015a\3\2\2\2\u0160"+
		"\u015d\3\2\2\2\u0161\65\3\2\2\2\u0162\u0163\5<\37\2\u0163\u0164\b\34\1"+
		"\2\u0164\67\3\2\2\2\u0165\u0166\7\32\2\2\u0166\u0167\5> \2\u0167\u0168"+
		"\7\33\2\2\u0168\u0169\b\35\1\2\u01699\3\2\2\2\u016a\u016b\7\t\2\2\u016b"+
		"\u016c\5\62\32\2\u016c\u016d\b\36\1\2\u016d;\3\2\2\2\u016e\u0173\5> \2"+
		"\u016f\u0170\7!\2\2\u0170\u0172\5> \2\u0171\u016f\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0177\b\37\1\2\u0177=\3\2\2\2\u0178\u0179\b \1\2"+
		"\u0179\u017a\5D#\2\u017a\u017b\b \1\2\u017b\u0195\3\2\2\2\u017c\u017d"+
		"\7\62\2\2\u017d\u017e\5> \f\u017e\u017f\b \1\2\u017f\u0195\3\2\2\2\u0180"+
		"\u0181\7\63\2\2\u0181\u0182\5> \13\u0182\u0183\b \1\2\u0183\u0195\3\2"+
		"\2\2\u0184\u0185\7\60\2\2\u0185\u0186\5> \n\u0186\u0187\b \1\2\u0187\u0195"+
		"\3\2\2\2\u0188\u0189\7\61\2\2\u0189\u018a\5> \t\u018a\u018b\b \1\2\u018b"+
		"\u0195\3\2\2\2\u018c\u018d\7&\2\2\u018d\u018e\5> \b\u018e\u018f\b \1\2"+
		"\u018f\u0195\3\2\2\2\u0190\u0191\7\'\2\2\u0191\u0192\5> \7\u0192\u0193"+
		"\b \1\2\u0193\u0195\3\2\2\2\u0194\u0178\3\2\2\2\u0194\u017c\3\2\2\2\u0194"+
		"\u0180\3\2\2\2\u0194\u0184\3\2\2\2\u0194\u0188\3\2\2\2\u0194\u018c\3\2"+
		"\2\2\u0194\u0190\3\2\2\2\u0195\u01bf\3\2\2\2\u0196\u0197\f\6\2\2\u0197"+
		"\u0198\5@!\2\u0198\u0199\5> \7\u0199\u019a\b \1\2\u019a\u01be\3\2\2\2"+
		"\u019b\u019c\f\5\2\2\u019c\u019d\7(\2\2\u019d\u019e\5> \2\u019e\u019f"+
		"\7)\2\2\u019f\u01a0\5> \6\u01a0\u01a1\b \1\2\u01a1\u01be\3\2\2\2\u01a2"+
		"\u01a3\f\4\2\2\u01a3\u01a4\7#\2\2\u01a4\u01a5\5> \4\u01a5\u01a6\b \1\2"+
		"\u01a6\u01be\3\2\2\2\u01a7\u01a8\f\3\2\2\u01a8\u01a9\5B\"\2\u01a9\u01aa"+
		"\5> \3\u01aa\u01ab\b \1\2\u01ab\u01be\3\2\2\2\u01ac\u01ad\f\20\2\2\u01ad"+
		"\u01ae\7\"\2\2\u01ae\u01af\7E\2\2\u01af\u01be\b \1\2\u01b0\u01b1\f\17"+
		"\2\2\u01b1\u01b3\7\32\2\2\u01b2\u01b4\5<\37\2\u01b3\u01b2\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\33\2\2\u01b6\u01be\b"+
		" \1\2\u01b7\u01b8\f\16\2\2\u01b8\u01b9\7\60\2\2\u01b9\u01be\b \1\2\u01ba"+
		"\u01bb\f\r\2\2\u01bb\u01bc\7\61\2\2\u01bc\u01be\b \1\2\u01bd\u0196\3\2"+
		"\2\2\u01bd\u019b\3\2\2\2\u01bd\u01a2\3\2\2\2\u01bd\u01a7\3\2\2\2\u01bd"+
		"\u01ac\3\2\2\2\u01bd\u01b0\3\2\2\2\u01bd\u01b7\3\2\2\2\u01bd\u01ba\3\2"+
		"\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"?\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\62\2\2\u01c3\u01e7\b!\1\2"+
		"\u01c4\u01c5\7\63\2\2\u01c5\u01e7\b!\1\2\u01c6\u01c7\7\64\2\2\u01c7\u01e7"+
		"\b!\1\2\u01c8\u01c9\7\65\2\2\u01c9\u01e7\b!\1\2\u01ca\u01cb\79\2\2\u01cb"+
		"\u01e7\b!\1\2\u01cc\u01cd\7\3\2\2\u01cd\u01e7\b!\1\2\u01ce\u01cf\7\4\2"+
		"\2\u01cf\u01e7\b!\1\2\u01d0\u01d1\7+\2\2\u01d1\u01e7\b!\1\2\u01d2\u01d3"+
		"\7,\2\2\u01d3\u01e7\b!\1\2\u01d4\u01d5\7%\2\2\u01d5\u01e7\b!\1\2\u01d6"+
		"\u01d7\7$\2\2\u01d7\u01e7\b!\1\2\u01d8\u01d9\7*\2\2\u01d9\u01e7\b!\1\2"+
		"\u01da\u01db\7-\2\2\u01db\u01e7\b!\1\2\u01dc\u01dd\7.\2\2\u01dd\u01e7"+
		"\b!\1\2\u01de\u01df\7/\2\2\u01df\u01e7\b!\1\2\u01e0\u01e1\7\66\2\2\u01e1"+
		"\u01e7\b!\1\2\u01e2\u01e3\7\67\2\2\u01e3\u01e7\b!\1\2\u01e4\u01e5\78\2"+
		"\2\u01e5\u01e7\b!\1\2\u01e6\u01c2\3\2\2\2\u01e6\u01c4\3\2\2\2\u01e6\u01c6"+
		"\3\2\2\2\u01e6\u01c8\3\2\2\2\u01e6\u01ca\3\2\2\2\u01e6\u01cc\3\2\2\2\u01e6"+
		"\u01ce\3\2\2\2\u01e6\u01d0\3\2\2\2\u01e6\u01d2\3\2\2\2\u01e6\u01d4\3\2"+
		"\2\2\u01e6\u01d6\3\2\2\2\u01e6\u01d8\3\2\2\2\u01e6\u01da\3\2\2\2\u01e6"+
		"\u01dc\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e2\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e7A\3\2\2\2\u01e8\u01e9\7:\2\2\u01e9\u01fd"+
		"\b\"\1\2\u01ea\u01eb\7;\2\2\u01eb\u01fd\b\"\1\2\u01ec\u01ed\7<\2\2\u01ed"+
		"\u01fd\b\"\1\2\u01ee\u01ef\7=\2\2\u01ef\u01fd\b\"\1\2\u01f0\u01f1\7>\2"+
		"\2\u01f1\u01fd\b\"\1\2\u01f2\u01f3\7?\2\2\u01f3\u01fd\b\"\1\2\u01f4\u01f5"+
		"\7@\2\2\u01f5\u01fd\b\"\1\2\u01f6\u01f7\7C\2\2\u01f7\u01fd\b\"\1\2\u01f8"+
		"\u01f9\7B\2\2\u01f9\u01fd\b\"\1\2\u01fa\u01fb\7A\2\2\u01fb\u01fd\b\"\1"+
		"\2\u01fc\u01e8\3\2\2\2\u01fc\u01ea\3\2\2\2\u01fc\u01ec\3\2\2\2\u01fc\u01ee"+
		"\3\2\2\2\u01fc\u01f0\3\2\2\2\u01fc\u01f2\3\2\2\2\u01fc\u01f4\3\2\2\2\u01fc"+
		"\u01f6\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fdC\3\2\2\2"+
		"\u01fe\u01ff\7\32\2\2\u01ff\u0200\5> \2\u0200\u0201\7\33\2\2\u0201\u0202"+
		"\b#\1\2\u0202\u0209\3\2\2\2\u0203\u0204\5*\26\2\u0204\u0205\b#\1\2\u0205"+
		"\u0209\3\2\2\2\u0206\u0207\7E\2\2\u0207\u0209\b#\1\2\u0208\u01fe\3\2\2"+
		"\2\u0208\u0203\3\2\2\2\u0208\u0206\3\2\2\2\u0209E\3\2\2\2-IOW\\ekr~\u0088"+
		"\u008e\u0096\u009a\u00a2\u00a7\u00b3\u00bc\u00c4\u00cc\u00cf\u00d6\u00dd"+
		"\u00e7\u00ef\u00fa\u0106\u010e\u0117\u0122\u012b\u0132\u0136\u013a\u014e"+
		"\u0158\u0160\u0173\u0194\u01b3\u01bd\u01bf\u01e6\u01fc\u0208";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}