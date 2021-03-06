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
		PC=1, LCOR=2, RCOR=3, LKEY=4, RKEY=5, LPAREN=6, RPAREN=7, COMA=8, EQ=9, 
		PLUS=10, MINUS=11, MULT=12, DIV=13, POW=14, TRANS=15, IMPRIME=16, WS=17, 
		ID=18, INT=19;
	public static final int
		RULE_sentencias = 0, RULE_imprime = 1, RULE_asignacion = 2, RULE_e = 3, 
		RULE_potencia = 4, RULE_arrayInitializer = 5, RULE_variableInitializerList = 6, 
		RULE_variableInitializer = 7, RULE_tipo = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencias", "imprime", "asignacion", "e", "potencia", "arrayInitializer", 
			"variableInitializerList", "variableInitializer", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PC", "LCOR", "RCOR", "LKEY", "RKEY", "LPAREN", "RPAREN", "COMA", 
			"EQ", "PLUS", "MINUS", "MULT", "DIV", "POW", "TRANS", "IMPRIME", "WS", 
			"ID", "INT"
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
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PC() { return getTokens(matrizParser.PC); }
		public TerminalNode PC(int i) {
			return getToken(matrizParser.PC, i);
		}
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public List<ImprimeContext> imprime() {
			return getRuleContexts(ImprimeContext.class);
		}
		public ImprimeContext imprime(int i) {
			return getRuleContext(ImprimeContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LKEY) | (1L << LPAREN) | (1L << TRANS) | (1L << IMPRIME) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(27);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(18);
					asignacion();
					setState(19);
					match(PC);
					}
					break;
				case 2:
					{
					setState(21);
					e(0);
					setState(22);
					match(PC);
					}
					break;
				case 3:
					{
					setState(24);
					imprime();
					setState(25);
					match(PC);
					}
					break;
				}
				}
				setState(31);
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

	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode IMPRIME() { return getToken(matrizParser.IMPRIME, 0); }
		public TerminalNode LPAREN() { return getToken(matrizParser.LPAREN, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(matrizParser.RPAREN, 0); }
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitImprime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitImprime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(IMPRIME);
			setState(33);
			match(LPAREN);
			setState(34);
			e(0);
			setState(35);
			match(RPAREN);
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
		public TerminalNode ID() { return getToken(matrizParser.ID, 0); }
		public TerminalNode EQ() { return getToken(matrizParser.EQ, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
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
		enterRule(_localctx, 4, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(ID);
			setState(38);
			match(EQ);
			setState(39);
			e(0);
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

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode DIV() { return getToken(matrizParser.DIV, 0); }
		public DivContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends EContext {
		public TerminalNode ID() { return getToken(matrizParser.ID, 0); }
		public VariableContext(EContext ctx) { copyFrom(ctx); }
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
	public static class MultContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode MULT() { return getToken(matrizParser.MULT, 0); }
		public MultContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenosContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(matrizParser.MINUS, 0); }
		public MenosContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitMenos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitMenos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotenciasContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode POW() { return getToken(matrizParser.POW, 0); }
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public PotenciasContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterPotencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitPotencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitPotencias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(matrizParser.PLUS, 0); }
		public PlusContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransContext extends EContext {
		public TerminalNode TRANS() { return getToken(matrizParser.TRANS, 0); }
		public TerminalNode LPAREN() { return getToken(matrizParser.LPAREN, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(matrizParser.RPAREN, 0); }
		public TransContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterTrans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitTrans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitTrans(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends EContext {
		public TerminalNode INT() { return getToken(matrizParser.INT, 0); }
		public IntContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends EContext {
		public TerminalNode LPAREN() { return getToken(matrizParser.LPAREN, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(matrizParser.RPAREN, 0); }
		public ParenContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class R1Context extends EContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public R1Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterR1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitR1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitR1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(42);
				match(LPAREN);
				setState(43);
				e(0);
				setState(44);
				match(RPAREN);
				}
				break;
			case TRANS:
				{
				_localctx = new TransContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(TRANS);
				setState(47);
				match(LPAREN);
				setState(48);
				e(0);
				setState(49);
				match(RPAREN);
				}
				break;
			case LKEY:
				{
				_localctx = new R1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				arrayInitializer();
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(56);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(57);
						match(MULT);
						setState(58);
						e(10);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(59);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(60);
						match(DIV);
						setState(61);
						e(9);
						}
						break;
					case 3:
						{
						_localctx = new MenosContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(62);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(63);
						match(MINUS);
						setState(64);
						e(8);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(65);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(66);
						match(PLUS);
						setState(67);
						e(7);
						}
						break;
					case 5:
						{
						_localctx = new PotenciasContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(68);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(69);
						match(POW);
						setState(70);
						potencia();
						}
						break;
					}
					} 
				}
				setState(75);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PotenciaContext extends ParserRuleContext {
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
	 
		public PotenciaContext() { }
		public void copyFrom(PotenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PotenciasMContext extends PotenciaContext {
		public TerminalNode LPAREN() { return getToken(matrizParser.LPAREN, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(matrizParser.RPAREN, 0); }
		public TerminalNode MINUS() { return getToken(matrizParser.MINUS, 0); }
		public PotenciasMContext(PotenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterPotenciasM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitPotenciasM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitPotenciasM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotenciaAContext extends PotenciaContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(matrizParser.MINUS, 0); }
		public PotenciaAContext(PotenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterPotenciaA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitPotenciaA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitPotenciaA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_potencia);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PotenciasMContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(LPAREN);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(77);
					match(MINUS);
					}
				}

				setState(80);
				e(0);
				setState(81);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new PotenciaAContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(83);
					match(MINUS);
					}
				}

				setState(86);
				e(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	 
		public ArrayInitializerContext() { }
		public void copyFrom(ArrayInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class R2Context extends ArrayInitializerContext {
		public TerminalNode LKEY() { return getToken(matrizParser.LKEY, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode RKEY() { return getToken(matrizParser.RKEY, 0); }
		public R2Context(ArrayInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterR2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitR2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitR2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayInitializer);
		try {
			_localctx = new R2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LKEY);
			setState(90);
			variableInitializerList();
			setState(91);
			match(RKEY);
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
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
	 
		public VariableInitializerListContext() { }
		public void copyFrom(VariableInitializerListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class R3Context extends VariableInitializerListContext {
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
		public R3Context(VariableInitializerListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterR3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitR3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitR3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableInitializerList);
		int _la;
		try {
			_localctx = new R3Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			variableInitializer();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(94);
				match(COMA);
				setState(95);
				variableInitializer();
				}
				}
				setState(100);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	 
		public VariableInitializerContext() { }
		public void copyFrom(VariableInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DamearryContext extends VariableInitializerContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public DamearryContext(VariableInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterDamearry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitDamearry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitDamearry(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DAMEintContext extends VariableInitializerContext {
		public TerminalNode INT() { return getToken(matrizParser.INT, 0); }
		public DAMEintContext(VariableInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterDAMEint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitDAMEint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitDAMEint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableInitializer);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LKEY:
				_localctx = new DamearryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				arrayInitializer();
				}
				break;
			case INT:
				_localctx = new DAMEintContext(_localctx);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(matrizParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matrizParserListener ) ((matrizParserListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matrizParserVisitor ) return ((matrizParserVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\59\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5J\n\5\f\5\16\5M\13\5\3\6\3\6\5\6Q\n\6\3\6\3\6\3\6\3\6\5\6W\n\6\3\6\5"+
		"\6Z\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bc\n\b\f\b\16\bf\13\b\3\t\3\t\5"+
		"\tj\n\t\3\n\3\n\3\n\2\3\b\13\2\4\6\b\n\f\16\20\22\2\2\2u\2\37\3\2\2\2"+
		"\4\"\3\2\2\2\6\'\3\2\2\2\b8\3\2\2\2\nY\3\2\2\2\f[\3\2\2\2\16_\3\2\2\2"+
		"\20i\3\2\2\2\22k\3\2\2\2\24\25\5\6\4\2\25\26\7\3\2\2\26\36\3\2\2\2\27"+
		"\30\5\b\5\2\30\31\7\3\2\2\31\36\3\2\2\2\32\33\5\4\3\2\33\34\7\3\2\2\34"+
		"\36\3\2\2\2\35\24\3\2\2\2\35\27\3\2\2\2\35\32\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"#\7\22\2\2#$\7\b\2\2$%\5"+
		"\b\5\2%&\7\t\2\2&\5\3\2\2\2\'(\7\24\2\2()\7\13\2\2)*\5\b\5\2*\7\3\2\2"+
		"\2+,\b\5\1\2,-\7\b\2\2-.\5\b\5\2./\7\t\2\2/9\3\2\2\2\60\61\7\21\2\2\61"+
		"\62\7\b\2\2\62\63\5\b\5\2\63\64\7\t\2\2\649\3\2\2\2\659\5\f\7\2\669\7"+
		"\24\2\2\679\7\25\2\28+\3\2\2\28\60\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67"+
		"\3\2\2\29K\3\2\2\2:;\f\13\2\2;<\7\16\2\2<J\5\b\5\f=>\f\n\2\2>?\7\17\2"+
		"\2?J\5\b\5\13@A\f\t\2\2AB\7\r\2\2BJ\5\b\5\nCD\f\b\2\2DE\7\f\2\2EJ\5\b"+
		"\5\tFG\f\f\2\2GH\7\20\2\2HJ\5\n\6\2I:\3\2\2\2I=\3\2\2\2I@\3\2\2\2IC\3"+
		"\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NP"+
		"\7\b\2\2OQ\7\r\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\b\5\2ST\7\t\2\2T"+
		"Z\3\2\2\2UW\7\r\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\5\b\5\2YN\3\2\2\2"+
		"YV\3\2\2\2Z\13\3\2\2\2[\\\7\6\2\2\\]\5\16\b\2]^\7\7\2\2^\r\3\2\2\2_d\5"+
		"\20\t\2`a\7\n\2\2ac\5\20\t\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e"+
		"\17\3\2\2\2fd\3\2\2\2gj\5\f\7\2hj\7\25\2\2ig\3\2\2\2ih\3\2\2\2j\21\3\2"+
		"\2\2kl\7\24\2\2l\23\3\2\2\2\f\35\378IKPVYdi";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}