package com.davidbaldin.ai.libs.acpc.model.procotol.acpc;

import static com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Card.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Bet;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Card;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.MatchState;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.ServerResponse;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;

@RunWith(Theories.class)
public class ACPCParserTest {

    private static String EOF = "";

    public static @DataPoints
    Pair<String, TestTupl>[] candidates = new Pair[]{
            Pair.of("MATCHSTATE:0:0::TdAs|", new TestTupl().hole(_TD, _AS)),
            Pair.of("MATCHSTATE:0:0:rrc/:TdAs|/2c8c3h",
                    new TestTupl().position(0).hand(0).hole(_TD, _AS)
                            .cards(1, _2C, _8C, _3H)),
            Pair.of("MATCHSTATE:0:0:rrc/r:TdAs|/2c8c3h",
                    new TestTupl().position(0).hand(0).hole(_TD, _AS)
                            .cards(1, _2C, _8C, _3H)),
            Pair.of("MATCHSTATE:0:0:rrc/rc/:TdAs|/2c8c3h/9c",
                    new TestTupl().position(0).hand(0)
                            .hole(_TD, _AS)
                            .cards(2, _2C, _8C, _3H)
                            .cards(3, _9C)),
            Pair.of("MATCHSTATE:0:0:rrc/rc/c:TdAs|/2c8c3h/9c",
                    new TestTupl().position(0)
                            .hand(0)
                            .hole(_TD, _AS)
                            .cards(2, _2C, _8C, _3H)
                            .cards(3, _9C)),
            Pair.of("MATCHSTATE:0:0:rrc/rc/cr:TdAs|/2c8c3h/9c",
                    new TestTupl().position(0).hand(0)
                            .hole(_TD, _AS)
                            .cards(2, _2C, _8C, _3H)
                            .cards(3, _9C)),
            Pair.of("MATCHSTATE:0:0:rrc/rc/crc/:TdAs|/2c8c3h/9c/Kh",
                    new TestTupl().position(0).hand(0)
                            .hole(_TD, _AS)
                            .cards(2, _2C, _8C, _3H)
                            .cards(3, _9C)
                            .cards(4, _KH)),
            Pair.of("MATCHSTATE:0:0:rrc/rc/crc/c:TdAs|/2c8c3h/9c/Kh",
                    new TestTupl().position(0).hand(0)
                            .hole(_TD, _AS)
                            .cards(2, _2C, _8C, _3H)
                            .cards(3, _9C)
                            .cards(4, _KH)),
            Pair.of("MATCHSTATE:0:0:rrc/rc/crc/cr:TdAs|/2c8c3h/9c/Kh",
                    new TestTupl().position(0).hand(0)
                            .hole(_TD, _AS)
                            .cards(2, _2C, _8C, _3H)
                            .cards(3, _9C)
                            .cards(4, _KH)),
            Pair.of("MATCHSTATE:0:0:rrc/rc/crc/crc:TdAs|8hTc/2c8c3h/9c/Kh",
                    new TestTupl().position(0).hand(0)
                            .hole(_TD, _AS)
                            .cards(1, _8H, _TC)
                            .cards(2, _2C, _8C, _3H)
                            .cards(3, _9C)
                            .cards(4, _KH)),
            Pair.of("MATCHSTATE:1:1::|Qd7c", new TestTupl().position(1).hand(1).hole(_QD, _7C)),
            Pair.of("MATCHSTATE:1:1:rrc/rc/rf:|Qd7c/2h8h5c/Th", new TestTupl().position(1).hand(1)
                    .hole(_QD, _7C)
                    .cards(2, _2H, _8H, _5C)
                    .cards(3, _TH)),
            Pair.of("MATCHSTATE:0:2::9d7s|", new TestTupl().position(0).hand(2).hole(_9D, _7S)),
            Pair.of("MATCHSTATE:0:2:rc/cc/crf:9d7s|/5d2cJc/3d", new TestTupl().position(0).hand(2).hole(_9D, _7S)
                    .cards(2, _5D, _2C, _JC)
                    .cards(2, _3D)),
            Pair.of("MATCHSTATE:0:30::9s8h|", new TestTupl().position(0).hand(30).hole(_9S, _8H)),
            Pair.of("MATCHSTATE:0:30:cc/r250c/r500c/:9s8h|/8c8d5c/6s/2d", new TestTupl().position(0).hand(30)
                    .hole(_9S, _8H)
                    .cards(2, _8C, _8D, _5C)
                    .cards(3, _6S)
                    .cards(4, _2D)),
            Pair.of("MATCHSTATE:0:30:cc/r250c/r500c/r1250:9s8h|/8c8d5c/6s/2d",
                    new TestTupl().position(0).hand(30)
                            .hole(_9S, _8H)
                            .cards(2, _8C, _8D, _5C)
                            .cards(3, _6S)
                            .cards(4, _2D)),
            Pair.of("MATCHSTATE:0:30:cc/r250c/r500c/r1250c:9s8h|9c6h/8c8d5c/6s/2d",
                    new TestTupl()
                            .position(0)
                            .hand(30)
                            .hole(_9S, _8H)
                            .cards(1, _9C, _6H)
                            .cards(2, _8C, _8D, _5C)
                            .cards(3, _6S)
                            .cards(4, _2D)),
            Pair.of("MATCHSTATE:1:31::|JdTc", new TestTupl().position(1).hand(31).hole(_JD, _TC)),
            Pair.of("MATCHSTATE:1:31:r300r900c/r1800r3600r9000c/r20000c/:KsJs|JdTc/6dJc9c/Kh/Qc",
                    new TestTupl()
                            .position(1)
                            .hand(31)
                            .hole(_KS, _JS)
                            .cards(1, _JD, _TC)
                            .cards(2, _6D, _JC, _9C)
                            .cards(3, _KH)
                            .cards(4, _QC)),
            Pair.of("MATCHSTATE:2:55::||AsTs", new TestTupl().position(2).hand(55).hole(_AS, _TS)),
            Pair.of("MATCHSTATE:2:55:rcc/rfc/rc/rf:||AsTs/4cJh8h/Kd/8c", new TestTupl().position(2).hand(55).hole(_AS, _TS)
                    .cards(2, _4C, _JH, _8H)
                    .cards(3, _KD)
                    .cards(4, _8C)),
            Pair.of("MATCHSTATE:0:90::Ad6h||", new TestTupl().position(0).hand(90).hole(_AD, _6H)),
            Pair.of("MATCHSTATE:0:90:crfc/rc/rc/rc:Ad6h||Td2h/TsKd7h/Kh/6d",
                    new TestTupl().position(0).hand(90).hole(_AD, _6H)
                            .cards(1, _TD, _2H)
                            .cards(2, _TS, _KD, _7H)
                            .cards(3, _KH)
                            .cards(4, _6D))};

    @Theory
    public void testDecoding(Pair<String, TestTupl> testTupl) {
        ACPCParser parser = new ACPCParser();
        ServerResponse response = parser.parseServerResponse(testTupl.getLeft());
        System.out.println(testTupl.getLeft());
        System.out.println(" => ");
        System.out.println(response.getMatchState());
        TestTupl testData = testTupl.getRight();
        assertPosition(testData, response.getMatchState());
        assertHandNumber(testData, response.getMatchState());
        assertHole(testData, response.getMatchState());
        assertRoundCards(testData, response.getMatchState());
        assertRoundBets(testData, response.getMatchState());
    }

    private void assertPosition(TestTupl testData, MatchState matchState) {
        Assert.assertEquals(testData.position, matchState.getPosition());
    }

    private void assertHandNumber(TestTupl testData, MatchState matchState) {
        Assert.assertEquals(testData.hand, matchState.getHandNumber());
    }

    private void assertHole(TestTupl testData, MatchState matchState) {
        Assert.assertEquals("Stack '" + testData.holeCards + "' does not match stack '" + matchState.getHoleCards() + "'",
                testData.holeCards.size(), matchState.getHoleCards().size());
        matchState.getHoleCards().forEach(
                holeCard -> Assert.assertTrue(testData.holeCards + " did not contain " + holeCard, testData.holeCards.contains(holeCard)));
    }

    private void assertRoundCards(TestTupl testData, MatchState matchState) {
        for (int round = 0; round < matchState.getBoardCards().size(); round++) {
            int testCardsRoundSize = Optional.ofNullable(testData.cardsPerRound.get(round)).map(List::size).orElse(0);
            int actualCardsRoundSize = Optional.ofNullable(matchState.getBoardCards(round)).map(List::size).orElse(0);
            Assert.assertEquals(
                    "Expected cards of round '" + round + "' don't match expected number of '" + testCardsRoundSize + "' with '"
                            + testData.cardsPerRound
                            .get(round)
                            + "'. \n"
                            + "Actual number of round cards is '" + actualCardsRoundSize + "' with '" + matchState.getBoardCards(round)
                            + "'",
                    testCardsRoundSize, actualCardsRoundSize);
            if (actualCardsRoundSize == 0) {
                continue;
            }
            for (Card holeCard : testData.cardsPerRound.get(round)) {
                Assert.assertTrue(testData.holeCards + " did not contain " + holeCard,
                        matchState.getBoardCards(round).contains(holeCard));
            }
        }

    }

    private void assertRoundBets(TestTupl testData, MatchState matchState) {

    }

    private static class TestTupl {

        int position;
        int hand;
        Int2ObjectArrayMap<List<Card>> cardsPerRound = new Int2ObjectArrayMap<>();
        Int2ObjectArrayMap<List<Bet>> betsPerRound = new Int2ObjectArrayMap<>();
        List<Card> holeCards = new ArrayList<>();

        private int currentCardRound = 0;
        private int currentActionRound = 0;

        public TestTupl cards(Integer round, Card... cards) {
            cardsPerRound.put(round, Arrays.asList(cards));
            return this;
        }

        public TestTupl bets(Integer round, Bet... bets) {
            betsPerRound.put(round, Arrays.asList(bets));
            return this;
        }

        public TestTupl hole(Card... cards) {
            Optional.ofNullable(cards).filter(Objects::nonNull).ifPresent(_cards -> {
                holeCards.addAll(Arrays.asList(_cards));
            });
            return this;
        }

        public TestTupl position(int position) {
            this.position = position;
            return this;
        }

        public TestTupl hand(int hand) {
            this.hand = hand;
            return this;
        }
    }
}
