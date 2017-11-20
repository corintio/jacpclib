// Generated from ACPC2017.g4 by ANTLR 4.7
package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACPC2017Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CARD=1, INT=2, FOLD=3, CALL=4, RAISE=5, COLON=6, HLINE=7, SLASH=8, MATCHSTATE=9;
	public static final int
		RULE_position = 0, RULE_hand_number = 1, RULE_raise_value = 2, RULE_action_fold = 3, 
		RULE_action_call = 4, RULE_action_raise_value = 5, RULE_action_raise = 6, 
		RULE_round_x_betting = 7, RULE_betting = 8, RULE_player_card = 9, RULE_playerx_cards = 10, 
		RULE_round_card = 11, RULE_roundx_board_cards = 12, RULE_hole_cards = 13, 
		RULE_board_cards = 14, RULE_cards = 15, RULE_match_state = 16, RULE_server_response = 17;
	public static final String[] ruleNames = {
		"position", "hand_number", "raise_value", "action_fold", "action_call", 
		"action_raise_value", "action_raise", "round_x_betting", "betting", "player_card", 
		"playerx_cards", "round_card", "roundx_board_cards", "hole_cards", "board_cards", 
		"cards", "match_state", "server_response"
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
			setState(36);
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
			setState(38);
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
			setState(40);
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

	public static class Action_foldContext extends ParserRuleContext {
		public TerminalNode FOLD() { return getToken(ACPC2017Parser.FOLD, 0); }
		public Action_foldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_fold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterAction_fold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitAction_fold(this);
		}
	}

	public final Action_foldContext action_fold() throws RecognitionException {
		Action_foldContext _localctx = new Action_foldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_action_fold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(FOLD);
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

	public static class Action_callContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(ACPC2017Parser.CALL, 0); }
		public Action_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterAction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitAction_call(this);
		}
	}

	public final Action_callContext action_call() throws RecognitionException {
		Action_callContext _localctx = new Action_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(CALL);
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

	public static class Action_raise_valueContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(ACPC2017Parser.RAISE, 0); }
		public Raise_valueContext raise_value() {
			return getRuleContext(Raise_valueContext.class,0);
		}
		public Action_raise_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_raise_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterAction_raise_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitAction_raise_value(this);
		}
	}

	public final Action_raise_valueContext action_raise_value() throws RecognitionException {
		Action_raise_valueContext _localctx = new Action_raise_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_action_raise_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(RAISE);
			setState(47);
			raise_value();
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

	public static class Action_raiseContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(ACPC2017Parser.RAISE, 0); }
		public Action_raiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_raise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterAction_raise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitAction_raise(this);
		}
	}

	public final Action_raiseContext action_raise() throws RecognitionException {
		Action_raiseContext _localctx = new Action_raiseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_action_raise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(RAISE);
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
		public List<Action_foldContext> action_fold() {
			return getRuleContexts(Action_foldContext.class);
		}
		public Action_foldContext action_fold(int i) {
			return getRuleContext(Action_foldContext.class,i);
		}
		public List<Action_callContext> action_call() {
			return getRuleContexts(Action_callContext.class);
		}
		public Action_callContext action_call(int i) {
			return getRuleContext(Action_callContext.class,i);
		}
		public List<Action_raise_valueContext> action_raise_value() {
			return getRuleContexts(Action_raise_valueContext.class);
		}
		public Action_raise_valueContext action_raise_value(int i) {
			return getRuleContext(Action_raise_valueContext.class,i);
		}
		public List<Action_raiseContext> action_raise() {
			return getRuleContexts(Action_raiseContext.class);
		}
		public Action_raiseContext action_raise(int i) {
			return getRuleContext(Action_raiseContext.class,i);
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
		enterRule(_localctx, 14, RULE_round_x_betting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(51);
					action_fold();
					}
					break;
				case 2:
					{
					setState(52);
					action_call();
					}
					break;
				case 3:
					{
					setState(53);
					action_raise_value();
					}
					break;
				case 4:
					{
					setState(54);
					action_raise();
					}
					break;
				}
				}
				setState(57); 
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
		enterRule(_localctx, 16, RULE_betting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			round_x_betting();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(60);
				match(SLASH);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOLD) | (1L << CALL) | (1L << RAISE))) != 0)) {
					{
					setState(61);
					round_x_betting();
					}
				}

				}
				}
				setState(68);
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

	public static class Player_cardContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(ACPC2017Parser.CARD, 0); }
		public Player_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterPlayer_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitPlayer_card(this);
		}
	}

	public final Player_cardContext player_card() throws RecognitionException {
		Player_cardContext _localctx = new Player_cardContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_player_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CARD);
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
		public List<Player_cardContext> player_card() {
			return getRuleContexts(Player_cardContext.class);
		}
		public Player_cardContext player_card(int i) {
			return getRuleContext(Player_cardContext.class,i);
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
		enterRule(_localctx, 20, RULE_playerx_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				player_card();
				}
				}
				setState(74); 
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

	public static class Round_cardContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(ACPC2017Parser.CARD, 0); }
		public Round_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).enterRound_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPC2017Listener ) ((ACPC2017Listener)listener).exitRound_card(this);
		}
	}

	public final Round_cardContext round_card() throws RecognitionException {
		Round_cardContext _localctx = new Round_cardContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_round_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CARD);
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
		public List<Round_cardContext> round_card() {
			return getRuleContexts(Round_cardContext.class);
		}
		public Round_cardContext round_card(int i) {
			return getRuleContext(Round_cardContext.class,i);
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
		enterRule(_localctx, 24, RULE_roundx_board_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARD) {
				{
				{
				setState(78);
				round_card();
				}
				}
				setState(83);
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
		enterRule(_localctx, 26, RULE_hole_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARD) {
				{
				setState(84);
				playerx_cards();
				}
			}

			setState(87);
			match(HLINE);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARD) {
				{
				setState(88);
				playerx_cards();
				}
			}

			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HLINE) {
				{
				setState(91);
				match(HLINE);
				setState(92);
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
		enterRule(_localctx, 28, RULE_board_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(95);
				match(SLASH);
				setState(96);
				roundx_board_cards();
				}
				}
				setState(101);
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
		enterRule(_localctx, 30, RULE_cards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			hole_cards();
			setState(103);
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
		enterRule(_localctx, 32, RULE_match_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(MATCHSTATE);
			setState(106);
			position();
			setState(107);
			match(COLON);
			setState(108);
			hand_number();
			setState(109);
			match(COLON);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOLD) | (1L << CALL) | (1L << RAISE))) != 0)) {
				{
				setState(110);
				betting();
				}
			}

			setState(113);
			match(COLON);
			setState(114);
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
		enterRule(_localctx, 34, RULE_server_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match_state();
			setState(117);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\6\t:\n\t\r\t\16\t;\3\n\3\n\3\n\5\nA\n\n\7\nC\n\n\f\n\16\n"+
		"F\13\n\3\13\3\13\3\f\6\fK\n\f\r\f\16\fL\3\r\3\r\3\16\7\16R\n\16\f\16\16"+
		"\16U\13\16\3\17\5\17X\n\17\3\17\3\17\5\17\\\n\17\3\17\3\17\5\17`\n\17"+
		"\3\20\3\20\7\20d\n\20\f\20\16\20g\13\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22r\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\2\2\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\2t\2&\3\2\2\2\4(\3\2\2\2"+
		"\6*\3\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f\60\3\2\2\2\16\63\3\2\2\2\209\3\2\2"+
		"\2\22=\3\2\2\2\24G\3\2\2\2\26J\3\2\2\2\30N\3\2\2\2\32S\3\2\2\2\34W\3\2"+
		"\2\2\36e\3\2\2\2 h\3\2\2\2\"k\3\2\2\2$v\3\2\2\2&\'\7\4\2\2\'\3\3\2\2\2"+
		"()\7\4\2\2)\5\3\2\2\2*+\7\4\2\2+\7\3\2\2\2,-\7\5\2\2-\t\3\2\2\2./\7\6"+
		"\2\2/\13\3\2\2\2\60\61\7\7\2\2\61\62\5\6\4\2\62\r\3\2\2\2\63\64\7\7\2"+
		"\2\64\17\3\2\2\2\65:\5\b\5\2\66:\5\n\6\2\67:\5\f\7\28:\5\16\b\29\65\3"+
		"\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<\21\3\2\2\2=D\5\20\t\2>@\7\n\2\2?A\5\20\t\2@?\3\2\2\2@A\3\2\2\2AC\3\2"+
		"\2\2B>\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\23\3\2\2\2FD\3\2\2\2GH\7"+
		"\3\2\2H\25\3\2\2\2IK\5\24\13\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2"+
		"M\27\3\2\2\2NO\7\3\2\2O\31\3\2\2\2PR\5\30\r\2QP\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2T\33\3\2\2\2US\3\2\2\2VX\5\26\f\2WV\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2Y[\7\t\2\2Z\\\5\26\f\2[Z\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2]^\7\t"+
		"\2\2^`\5\26\f\2_]\3\2\2\2_`\3\2\2\2`\35\3\2\2\2ab\7\n\2\2bd\5\32\16\2"+
		"ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\37\3\2\2\2ge\3\2\2\2hi\5\34"+
		"\17\2ij\5\36\20\2j!\3\2\2\2kl\7\13\2\2lm\5\2\2\2mn\7\b\2\2no\5\4\3\2o"+
		"q\7\b\2\2pr\5\22\n\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\b\2\2tu\5 \21\2"+
		"u#\3\2\2\2vw\5\"\22\2wx\7\2\2\3x%\3\2\2\2\r9;@DLSW[_eq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}