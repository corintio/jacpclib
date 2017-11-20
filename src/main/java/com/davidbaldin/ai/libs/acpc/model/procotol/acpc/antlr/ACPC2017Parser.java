// Generated from ACPC2017.g4 by ANTLR 4.7
package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACPC2017Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CARD=1, INT=2, FOLD=3, CALL=4, RAISE=5, COLON=6, HLINE=7, SLASH=8, MATCHSTATE=9;
	public static final int
		RULE_position = 0, RULE_hand_number = 1, RULE_raise_value = 2, RULE_round_x_betting = 3, 
		RULE_betting = 4, RULE_playerx_cards = 5, RULE_roundx_board_cards = 6, 
		RULE_hole_cards = 7, RULE_board_cards = 8, RULE_cards = 9, RULE_match_state = 10, 
		RULE_server_response = 11;
	public static final String[] ruleNames = {
		"position", "hand_number", "raise_value", "round_x_betting", "betting", 
		"playerx_cards", "roundx_board_cards", "hole_cards", "board_cards", "cards", 
		"match_state", "server_response"
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

	@Override
	public String getGrammarFileName() { return "ACPC2017.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ACPC2017Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PositionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ACPC2017Parser.INT, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitPosition(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(INT);
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

	public static class Hand_numberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ACPC2017Parser.INT, 0); }
		public Hand_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hand_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterHand_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitHand_number(this);
		}
	}

	public final Hand_numberContext hand_number() throws RecognitionException {
		Hand_numberContext _localctx = new Hand_numberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hand_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(INT);
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

	public static class Raise_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ACPC2017Parser.INT, 0); }
		public Raise_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterRaise_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitRaise_value(this);
		}
	}

	public final Raise_valueContext raise_value() throws RecognitionException {
		Raise_valueContext _localctx = new Raise_valueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_raise_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(INT);
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

	public static class Round_x_bettingContext extends ParserRuleContext {
		public List<TerminalNode> FOLD() { return getTokens(ACPC2017Parser.FOLD); }
		public TerminalNode FOLD(int i) {
			return getToken(ACPC2017Parser.FOLD, i);
		}
		public List<TerminalNode> CALL() { return getTokens(ACPC2017Parser.CALL); }
		public TerminalNode CALL(int i) {
			return getToken(ACPC2017Parser.CALL, i);
		}
		public List<TerminalNode> RAISE() { return getTokens(ACPC2017Parser.RAISE); }
		public TerminalNode RAISE(int i) {
			return getToken(ACPC2017Parser.RAISE, i);
		}
		public List<Raise_valueContext> raise_value() {
			return getRuleContexts(Raise_valueContext.class);
		}
		public Raise_valueContext raise_value(int i) {
			return getRuleContext(Raise_valueContext.class,i);
		}
		public Round_x_bettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_x_betting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterRound_x_betting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitRound_x_betting(this);
		}
	}

	public final Round_x_bettingContext round_x_betting() throws RecognitionException {
		Round_x_bettingContext _localctx = new Round_x_bettingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_round_x_betting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOLD:
					{
					setState(30);
					match(FOLD);
					}
					break;
				case CALL:
					{
					setState(31);
					match(CALL);
					}
					break;
				case RAISE:
					{
					setState(32);
					match(RAISE);
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT) {
						{
						setState(33);
						raise_value();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOLD) | (1L << CALL) | (1L << RAISE))) != 0) );
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

	public static class BettingContext extends ParserRuleContext {
		public List<Round_x_bettingContext> round_x_betting() {
			return getRuleContexts(Round_x_bettingContext.class);
		}
		public Round_x_bettingContext round_x_betting(int i) {
			return getRuleContext(Round_x_bettingContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(ACPC2017Parser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ACPC2017Parser.SLASH, i);
		}
		public BettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_betting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterBetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitBetting(this);
		}
	}

	public final BettingContext betting() throws RecognitionException {
		BettingContext _localctx = new BettingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_betting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			round_x_betting();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(41);
				match(SLASH);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOLD) | (1L << CALL) | (1L << RAISE))) != 0)) {
					{
					setState(42);
					round_x_betting();
					}
				}

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

	public static class Playerx_cardsContext extends ParserRuleContext {
		public List<TerminalNode> CARD() { return getTokens(ACPC2017Parser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(ACPC2017Parser.CARD, i);
		}
		public Playerx_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerx_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterPlayerx_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitPlayerx_cards(this);
		}
	}

	public final Playerx_cardsContext playerx_cards() throws RecognitionException {
		Playerx_cardsContext _localctx = new Playerx_cardsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_playerx_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(CARD);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CARD );
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

	public static class Roundx_board_cardsContext extends ParserRuleContext {
		public List<TerminalNode> CARD() { return getTokens(ACPC2017Parser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(ACPC2017Parser.CARD, i);
		}
		public Roundx_board_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roundx_board_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterRoundx_board_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitRoundx_board_cards(this);
		}
	}

	public final Roundx_board_cardsContext roundx_board_cards() throws RecognitionException {
		Roundx_board_cardsContext _localctx = new Roundx_board_cardsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_roundx_board_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARD) {
				{
				{
				setState(55);
				match(CARD);
				}
				}
				setState(60);
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

	public static class Hole_cardsContext extends ParserRuleContext {
		public List<TerminalNode> HLINE() { return getTokens(ACPC2017Parser.HLINE); }
		public TerminalNode HLINE(int i) {
			return getToken(ACPC2017Parser.HLINE, i);
		}
		public List<Playerx_cardsContext> playerx_cards() {
			return getRuleContexts(Playerx_cardsContext.class);
		}
		public Playerx_cardsContext playerx_cards(int i) {
			return getRuleContext(Playerx_cardsContext.class,i);
		}
		public Hole_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hole_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterHole_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitHole_cards(this);
		}
	}

	public final Hole_cardsContext hole_cards() throws RecognitionException {
		Hole_cardsContext _localctx = new Hole_cardsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hole_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARD) {
				{
				setState(61);
				playerx_cards();
				}
			}

			setState(64);
			match(HLINE);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARD) {
				{
				setState(65);
				playerx_cards();
				}
			}

			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HLINE) {
				{
				setState(68);
				match(HLINE);
				setState(69);
				playerx_cards();
				}
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

	public static class Board_cardsContext extends ParserRuleContext {
		public List<TerminalNode> SLASH() { return getTokens(ACPC2017Parser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ACPC2017Parser.SLASH, i);
		}
		public List<Roundx_board_cardsContext> roundx_board_cards() {
			return getRuleContexts(Roundx_board_cardsContext.class);
		}
		public Roundx_board_cardsContext roundx_board_cards(int i) {
			return getRuleContext(Roundx_board_cardsContext.class,i);
		}
		public Board_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterBoard_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitBoard_cards(this);
		}
	}

	public final Board_cardsContext board_cards() throws RecognitionException {
		Board_cardsContext _localctx = new Board_cardsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_board_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(72);
				match(SLASH);
				setState(73);
				roundx_board_cards();
				}
				}
				setState(78);
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

	public static class CardsContext extends ParserRuleContext {
		public Hole_cardsContext hole_cards() {
			return getRuleContext(Hole_cardsContext.class,0);
		}
		public Board_cardsContext board_cards() {
			return getRuleContext(Board_cardsContext.class,0);
		}
		public CardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterCards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitCards(this);
		}
	}

	public final CardsContext cards() throws RecognitionException {
		CardsContext _localctx = new CardsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			hole_cards();
			setState(80);
			board_cards();
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

	public static class Match_stateContext extends ParserRuleContext {
		public TerminalNode MATCHSTATE() { return getToken(ACPC2017Parser.MATCHSTATE, 0); }
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(ACPC2017Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ACPC2017Parser.COLON, i);
		}
		public Hand_numberContext hand_number() {
			return getRuleContext(Hand_numberContext.class,0);
		}
		public CardsContext cards() {
			return getRuleContext(CardsContext.class,0);
		}
		public BettingContext betting() {
			return getRuleContext(BettingContext.class,0);
		}
		public Match_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterMatch_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitMatch_state(this);
		}
	}

	public final Match_stateContext match_state() throws RecognitionException {
		Match_stateContext _localctx = new Match_stateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_match_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(MATCHSTATE);
			setState(83);
			position();
			setState(84);
			match(COLON);
			setState(85);
			hand_number();
			setState(86);
			match(COLON);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOLD) | (1L << CALL) | (1L << RAISE))) != 0)) {
				{
				setState(87);
				betting();
				}
			}

			setState(90);
			match(COLON);
			setState(91);
			cards();
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

	public static class Server_responseContext extends ParserRuleContext {
		public Match_stateContext match_state() {
			return getRuleContext(Match_stateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ACPC2017Parser.EOF, 0); }
		public Server_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterServer_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitServer_response(this);
		}
	}

	public final Server_responseContext server_response() throws RecognitionException {
		Server_responseContext _localctx = new Server_responseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_server_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match_state();
			setState(94);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5%\n\5\6\5\'"+
		"\n\5\r\5\16\5(\3\6\3\6\3\6\5\6.\n\6\7\6\60\n\6\f\6\16\6\63\13\6\3\7\6"+
		"\7\66\n\7\r\7\16\7\67\3\b\7\b;\n\b\f\b\16\b>\13\b\3\t\5\tA\n\t\3\t\3\t"+
		"\5\tE\n\t\3\t\3\t\5\tI\n\t\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f[\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2c\2\32\3\2\2\2\4\34\3\2\2\2\6\36\3"+
		"\2\2\2\b&\3\2\2\2\n*\3\2\2\2\f\65\3\2\2\2\16<\3\2\2\2\20@\3\2\2\2\22N"+
		"\3\2\2\2\24Q\3\2\2\2\26T\3\2\2\2\30_\3\2\2\2\32\33\7\4\2\2\33\3\3\2\2"+
		"\2\34\35\7\4\2\2\35\5\3\2\2\2\36\37\7\4\2\2\37\7\3\2\2\2 \'\7\5\2\2!\'"+
		"\7\6\2\2\"$\7\7\2\2#%\5\6\4\2$#\3\2\2\2$%\3\2\2\2%\'\3\2\2\2& \3\2\2\2"+
		"&!\3\2\2\2&\"\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\t\3\2\2\2*\61\5"+
		"\b\5\2+-\7\n\2\2,.\5\b\5\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/+\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\13\3\2\2\2\63\61\3\2\2\2\64\66"+
		"\7\3\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\r\3\2"+
		"\2\29;\7\3\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\17\3\2\2\2><\3"+
		"\2\2\2?A\5\f\7\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\7\t\2\2CE\5\f\7\2DC\3"+
		"\2\2\2DE\3\2\2\2EH\3\2\2\2FG\7\t\2\2GI\5\f\7\2HF\3\2\2\2HI\3\2\2\2I\21"+
		"\3\2\2\2JK\7\n\2\2KM\5\16\b\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"O\23\3\2\2\2PN\3\2\2\2QR\5\20\t\2RS\5\22\n\2S\25\3\2\2\2TU\7\13\2\2UV"+
		"\5\2\2\2VW\7\b\2\2WX\5\4\3\2XZ\7\b\2\2Y[\5\n\6\2ZY\3\2\2\2Z[\3\2\2\2["+
		"\\\3\2\2\2\\]\7\b\2\2]^\5\24\13\2^\27\3\2\2\2_`\5\26\f\2`a\7\2\2\3a\31"+
		"\3\2\2\2\16$&(-\61\67<@DHNZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}