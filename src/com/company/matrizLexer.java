// Generated from C:/Users/rmama/IdeaProjects/matriz/src/com/company\matrizLexer.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matrizLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PC=1, LCOR=2, RCOR=3, LKEY=4, RKEY=5, LPAREN=6, RPAREN=7, COMA=8, EQ=9, 
		PLUS=10, MINUS=11, MULT=12, DIV=13, POW=14, TRANS=15, IMPRIME=16, WS=17, 
		ID=18, INT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PC", "LCOR", "RCOR", "LKEY", "RKEY", "LPAREN", "RPAREN", "COMA", "EQ", 
			"PLUS", "MINUS", "MULT", "DIV", "POW", "TRANS", "IMPRIME", "WS", "ID", 
			"INT", "DIGIT", "LETTER"
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


	public matrizLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "matrizLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20V\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21b\n\21\3\22\3\22\3\22\3\22\3\23\3\23\7\23j\n\23\f\23\16\23m\13\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\7\26u\n\26\f\26\16\26x\13\26\2\2\27\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\2+\2\3\2\6\5\2\13\f\17\17\"\"\3\2\62;\3\2c|\5\2C\\"+
		"aac|\2z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2"+
		"\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3"+
		"\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33E\3\2\2\2\35G\3\2\2\2\37"+
		"U\3\2\2\2!a\3\2\2\2#c\3\2\2\2%g\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+r\3\2\2\2"+
		"-.\7=\2\2.\4\3\2\2\2/\60\7]\2\2\60\6\3\2\2\2\61\62\7_\2\2\62\b\3\2\2\2"+
		"\63\64\7}\2\2\64\n\3\2\2\2\65\66\7\177\2\2\66\f\3\2\2\2\678\7*\2\28\16"+
		"\3\2\2\29:\7+\2\2:\20\3\2\2\2;<\7.\2\2<\22\3\2\2\2=>\7?\2\2>\24\3\2\2"+
		"\2?@\7-\2\2@\26\3\2\2\2AB\7/\2\2B\30\3\2\2\2CD\7,\2\2D\32\3\2\2\2EF\7"+
		"\61\2\2F\34\3\2\2\2GH\7`\2\2H\36\3\2\2\2IV\7V\2\2JK\7v\2\2KL\7t\2\2LM"+
		"\7c\2\2MN\7p\2\2NO\7u\2\2OP\7r\2\2PQ\7w\2\2QR\7g\2\2RS\7u\2\2ST\7v\2\2"+
		"TV\7c\2\2UI\3\2\2\2UJ\3\2\2\2V \3\2\2\2WX\7r\2\2XY\7t\2\2YZ\7k\2\2Z[\7"+
		"p\2\2[b\7v\2\2\\]\7R\2\2]^\7T\2\2^_\7K\2\2_`\7P\2\2`b\7V\2\2aW\3\2\2\2"+
		"a\\\3\2\2\2b\"\3\2\2\2cd\t\2\2\2de\3\2\2\2ef\b\22\2\2f$\3\2\2\2gk\5+\26"+
		"\2hj\5+\26\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l&\3\2\2\2mk\3\2\2"+
		"\2no\5)\25\2o(\3\2\2\2pq\t\3\2\2q*\3\2\2\2rv\t\4\2\2su\t\5\2\2ts\3\2\2"+
		"\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w,\3\2\2\2xv\3\2\2\2\7\2Uakv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}