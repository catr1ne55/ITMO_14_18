// Generated from Expr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ROMAN=3;
	public static final int
		RULE_eval = 0, RULE_sum = 1, RULE_term = 2;
	public static final String[] ruleNames = {
		"eval", "sum", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ROMAN"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public int value;
		public SumContext sum;
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			((EvalContext)_localctx).sum = sum(0);
			((EvalContext)_localctx).value =  ((EvalContext)_localctx).sum.value;
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

	public static class SumContext extends ParserRuleContext {
		public int num;
		public int value;
		public TermContext term;
		public SumContext other;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public SumContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SumContext(ParserRuleContext parent, int invokingState, int num) {
			super(parent, invokingState);
			this.num = num;
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSum(this);
		}
	}

	public final SumContext sum(int num) throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState(), num);
		enterRule(_localctx, 2, RULE_sum);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				((SumContext)_localctx).term = term();
				setState(11);
				match(T__0);
				setState(12);
				((SumContext)_localctx).other = sum(_localctx.num + ((SumContext)_localctx).term.value);
				 ((SumContext)_localctx).value =  ((SumContext)_localctx).other.value; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				((SumContext)_localctx).term = term();
				 ((SumContext)_localctx).value =  _localctx.num + ((SumContext)_localctx).term.value; 
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

	public static class TermContext extends ParserRuleContext {
		public int value;
		public Token ROMAN;
		public TerminalNode ROMAN() { return getToken(ExprParser.ROMAN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((TermContext)_localctx).ROMAN = match(ROMAN);

				((TermContext)_localctx).value =  Converter.romeToArab((((TermContext)_localctx).ROMAN!=null?((TermContext)_localctx).ROMAN.getText():null));
				
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\32\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\25\n"+
		"\3\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\30\2\b\3\2\2\2\4\24\3\2\2\2\6\26"+
		"\3\2\2\2\b\t\5\4\3\2\t\n\b\2\1\2\n\3\3\2\2\2\13\25\3\2\2\2\f\r\5\6\4\2"+
		"\r\16\7\3\2\2\16\17\5\4\3\2\17\20\b\3\1\2\20\25\3\2\2\2\21\22\5\6\4\2"+
		"\22\23\b\3\1\2\23\25\3\2\2\2\24\13\3\2\2\2\24\f\3\2\2\2\24\21\3\2\2\2"+
		"\25\5\3\2\2\2\26\27\7\5\2\2\27\30\b\4\1\2\30\7\3\2\2\2\3\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}