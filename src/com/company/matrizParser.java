// Generated from C:/Users/rmama/IdeaProjects/matriz/src/com/company\matrizParser.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matrizParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COR1=1, COR2=2, KEY1=3, KEY2=4, LPAREN=5, RPAREN=6, COMA=7, EQ=8, PLUS=9, 
		MINUS=10, MULT=11, DIV=12, POW=13, WS=14, ID=15, INT=16;
	public static final int
		RULE_sentencias = 0, RULE_expression = 1, RULE_multiplyingExpression = 2, 
		RULE_powExpression = 3, RULE_signedAtom = 4, RULE_atom = 5, RULE_asignacion = 6, 
		RULE_arrayInitializer = 7, RULE_variableInitializerList = 8, RULE_variableInitializer = 9, 
		RULE_variable = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencias", "expression", "multiplyingExpression", "powExpression", 
			"signedAtom", "atom", "asignacion", "arrayInitializer", "variableInitializerList", 
			"variableInitializer", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "'='", "'+'", 
			"'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COR1", "COR2", "KEY1", "KEY2", "LPAREN", "RPAREN", "COMA", "EQ", 
			"PLUS", "MINUS", "MULT", "DIV", "POW", "WS", "ID", "INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "matrizParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public matrizParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SentenciasContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentencias);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COR1:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				asignacion();
				}
				break;
			case KEY1:
			case LPAREN:
			case PLUS:
			case MINUS:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(matrizParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(matrizParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(matrizParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(matrizParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			multiplyingExpression();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(28);
				multiplyingExpression();
				}
				}
				setState(33);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<PowExpressionContext> powExpression() {
			return getRuleContexts(PowExpressionContext.class);
		}
		public PowExpressionContext powExpression(int i) {
			return getRuleContext(PowExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(matrizParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(matrizParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(matrizParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(matrizParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitMultiplyingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			powExpression();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				powExpression();
				}
				}
				setState(41);
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

	public static class PowExpressionContext extends ParserRuleContext {
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(matrizParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(matrizParser.POW, i);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_powExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			signedAtom();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(43);
				match(POW);
				setState(44);
				signedAtom();
				}
				}
				setState(49);
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

	public static class SignedAtomContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(matrizParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(matrizParser.MINUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterSignedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitSignedAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitSignedAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_signedAtom);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(PLUS);
				setState(51);
				signedAtom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(MINUS);
				setState(53);
				signedAtom();
				}
				break;
			case KEY1:
			case LPAREN:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(matrizParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(matrizParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(matrizParser.RPAREN, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(INT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(LPAREN);
				setState(59);
				expression();
				setState(60);
				match(RPAREN);
				}
				break;
			case KEY1:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				arrayInitializer();
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

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> COR1() { return getTokens(matrizParser.COR1); }
		public TerminalNode COR1(int i) {
			return getToken(matrizParser.COR1, i);
		}
		public List<TerminalNode> COR2() { return getTokens(matrizParser.COR2); }
		public TerminalNode COR2(int i) {
			return getToken(matrizParser.COR2, i);
		}
		public TerminalNode ID() { return getToken(matrizParser.ID, 0); }
		public TerminalNode EQ() { return getToken(matrizParser.EQ, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(65);
				variable();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(COR1);
			setState(72);
			match(COR2);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COR1) {
				{
				{
				setState(73);
				match(COR1);
				setState(74);
				match(COR2);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(ID);
			setState(81);
			match(EQ);
			setState(82);
			arrayInitializer();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode KEY1() { return getToken(matrizParser.KEY1, 0); }
		public TerminalNode KEY2() { return getToken(matrizParser.KEY2, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMA() { return getToken(matrizParser.COMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(KEY1);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY1 || _la==INT) {
				{
				setState(85);
				variableInitializerList();
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(88);
				match(COMA);
				}
			}

			setState(91);
			match(KEY2);
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

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(matrizParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(matrizParser.COMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			variableInitializer();
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(COMA);
					setState(95);
					variableInitializer();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public TerminalNode INT() { return getToken(matrizParser.INT, 0); }
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableInitializer);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				arrayInitializer();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(INT);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(matrizParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\5\2\33\n\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4\3\4"+
		"\3\4\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\b\7\bE"+
		"\n\b\f\b\16\bH\13\b\3\b\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\5\tY\n\t\3\t\5\t\\\n\t\3\t\3\t\3\n\3\n\3\n\7\nc\n\n\f\n"+
		"\16\nf\13\n\3\13\3\13\5\13j\n\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22"+
		"\24\26\2\4\3\2\13\f\3\2\r\16\2p\2\32\3\2\2\2\4\34\3\2\2\2\6$\3\2\2\2\b"+
		",\3\2\2\2\n9\3\2\2\2\fA\3\2\2\2\16F\3\2\2\2\20V\3\2\2\2\22_\3\2\2\2\24"+
		"i\3\2\2\2\26k\3\2\2\2\30\33\5\16\b\2\31\33\5\4\3\2\32\30\3\2\2\2\32\31"+
		"\3\2\2\2\33\3\3\2\2\2\34!\5\6\4\2\35\36\t\2\2\2\36 \5\6\4\2\37\35\3\2"+
		"\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2\2\2$)\5\b\5\2"+
		"%&\t\3\2\2&(\5\b\5\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7\3\2"+
		"\2\2+)\3\2\2\2,\61\5\n\6\2-.\7\17\2\2.\60\5\n\6\2/-\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\t\3\2\2\2\63\61\3\2\2\2\64\65\7\13\2"+
		"\2\65:\5\n\6\2\66\67\7\f\2\2\67:\5\n\6\28:\5\f\7\29\64\3\2\2\29\66\3\2"+
		"\2\298\3\2\2\2:\13\3\2\2\2;B\7\22\2\2<=\7\7\2\2=>\5\4\3\2>?\7\b\2\2?B"+
		"\3\2\2\2@B\5\20\t\2A;\3\2\2\2A<\3\2\2\2A@\3\2\2\2B\r\3\2\2\2CE\5\26\f"+
		"\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\3\2"+
		"\2JO\7\4\2\2KL\7\3\2\2LN\7\4\2\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2PR\3\2\2\2QO\3\2\2\2RS\7\21\2\2ST\7\n\2\2TU\5\20\t\2U\17\3\2\2\2VX\7"+
		"\5\2\2WY\5\22\n\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\7\t\2\2[Z\3\2\2\2["+
		"\\\3\2\2\2\\]\3\2\2\2]^\7\6\2\2^\21\3\2\2\2_d\5\24\13\2`a\7\t\2\2ac\5"+
		"\24\13\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\23\3\2\2\2fd\3\2\2\2"+
		"gj\5\20\t\2hj\7\22\2\2ig\3\2\2\2ih\3\2\2\2j\25\3\2\2\2kl\7\21\2\2l\27"+
		"\3\2\2\2\16\32!)\619AFOX[di";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}