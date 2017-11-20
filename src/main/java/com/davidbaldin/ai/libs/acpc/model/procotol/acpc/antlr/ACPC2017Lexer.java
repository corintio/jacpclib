// Generated from ACPC2017.g4 by ANTLR 4.7
package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACPC2017Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CARD=1, INT=2, FOLD=3, CALL=4, RAISE=5, COLON=6, HLINE=7, SLASH=8, MATCHSTATE=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "RANK", "SUIT", "CARD", "INT", "FOLD", "CALL", "RAISE", "COLON", 
		"HLINE", "SLASH", "MATCHSTATE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'f'", "'c'", "'r'", "':'", "'|'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CARD", "INT", "FOLD", "CALL", "RAISE", "COLON", "HLINE", "SLASH", 
		"MATCHSTATE"
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


	public ACPC2017Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ACPC2017.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13B\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\6\6&\n\6\r"+
		"\6\16\6\'\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\2\2\16\3\2\5\2\7\2\t\3\13\4"+
		"\r\5\17\6\21\7\23\b\25\t\27\n\31\13\3\2\5\3\2\62;\7\2\64;CCLMSSVV\5\2"+
		"efjjuu\2?\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5"+
		"\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13%\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2"+
		"\21-\3\2\2\2\23/\3\2\2\2\25\61\3\2\2\2\27\63\3\2\2\2\31\65\3\2\2\2\33"+
		"\34\t\2\2\2\34\4\3\2\2\2\35\36\t\3\2\2\36\6\3\2\2\2\37 \t\4\2\2 \b\3\2"+
		"\2\2!\"\5\5\3\2\"#\5\7\4\2#\n\3\2\2\2$&\5\3\2\2%$\3\2\2\2&\'\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(\f\3\2\2\2)*\7h\2\2*\16\3\2\2\2+,\7e\2\2,\20\3\2"+
		"\2\2-.\7t\2\2.\22\3\2\2\2/\60\7<\2\2\60\24\3\2\2\2\61\62\7~\2\2\62\26"+
		"\3\2\2\2\63\64\7\61\2\2\64\30\3\2\2\2\65\66\7O\2\2\66\67\7C\2\2\678\7"+
		"V\2\289\7E\2\29:\7J\2\2:;\7U\2\2;<\7V\2\2<=\7C\2\2=>\7V\2\2>?\7G\2\2?"+
		"@\3\2\2\2@A\5\23\n\2A\32\3\2\2\2\4\2\'\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}