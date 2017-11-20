package com.davidbaldin.ai.libs.acpc.model.procotol.acpc;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Betting;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Card;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.ServerResponse;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.*;
import java.util.stream.Stream;

@RunWith(Theories.class)
public class ACPCParserTest {

    private static String EOF = "";

    public static
    @DataPoints
    Pair<String, TestTupl>[] candidates = new Pair[]{Pair.of("MATCHSTATE:0:0::TdAs|", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:r:TdAs|", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rr:TdAs|", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/:TdAs|/2c8c3h", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/r:TdAs|/2c8c3h", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/rc/:TdAs|/2c8c3h/9c", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/rc/c:TdAs|/2c8c3h/9c", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/rc/cr:TdAs|/2c8c3h/9c", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/rc/crc/:TdAs|/2c8c3h/9c/Kh", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/rc/crc/c:TdAs|/2c8c3h/9c/Kh", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/rc/crc/cr:TdAs|/2c8c3h/9c/Kh", new TestTupl()),
            Pair.of("MATCHSTATE:0:0:rrc/rc/crc/crc:TdAs|8hTc/2c8c3h/9c/Kh", new TestTupl()),
            Pair.of("MATCHSTATE:1:1::|Qd7c", new TestTupl()),
            Pair.of("MATCHSTATE:1:1:r:|Qd7c", new TestTupl()),
            Pair.of("MATCHSTATE:1:1:rr:|Qd7c", new TestTupl()),
            Pair.of("MATCHSTATE:1:1:rrc/:|Qd7c/2h8h5c", new TestTupl()),
            Pair.of("MATCHSTATE:1:1:rrc/r:|Qd7c/2h8h5c", new TestTupl()),
            Pair.of("MATCHSTATE:1:1:rrc/rc/:|Qd7c/2h8h5c/Th", new TestTupl()),
            Pair.of("MATCHSTATE:1:1:rrc/rc/r:|Qd7c/2h8h5c/Th", new TestTupl()),
            Pair.of("MATCHSTATE:1:1:rrc/rc/rf:|Qd7c/2h8h5c/Th", new TestTupl()),
            Pair.of("MATCHSTATE:0:2::9d7s|", new TestTupl()),
            Pair.of("MATCHSTATE:0:2:r:9d7s|", new TestTupl()),
            Pair.of("MATCHSTATE:0:2:rc/:9d7s|/5d2cJc", new TestTupl()),
            Pair.of("MATCHSTATE:0:2:rc/c:9d7s|/5d2cJc", new TestTupl()),
            Pair.of("MATCHSTATE:0:2:rc/cc/:9d7s|/5d2cJc/3d", new TestTupl()),
            Pair.of("MATCHSTATE:0:2:rc/cc/c:9d7s|/5d2cJc/3d", new TestTupl()),
            Pair.of("MATCHSTATE:0:2:rc/cc/cr:9d7s|/5d2cJc/3d", new TestTupl()),
            Pair.of("MATCHSTATE:0:2:rc/cc/crf:9d7s|/5d2cJc/3d", new TestTupl()),
            Pair.of("MATCHSTATE:0:30::9s8h|", new TestTupl()),
            Pair.of("MATCHSTATE:0:30:c:9s8h|", new TestTupl()),
            Pair.of("MATCHSTATE:0:30:cc/:9s8h|/8c8d5c", new TestTupl()),
            Pair.of("MATCHSTATE:0:30:cc/r250:9s8h|/8c8d5c", new TestTupl()),
            Pair.of("MATCHSTATE:0:30:cc/r250c/:9s8h|/8c8d5c/6s", new TestTupl()),
            Pair.of("MATCHSTATE:0:30:cc/r250c/r500:9s8h|/8c8d5c/6s", new TestTupl()),
            Pair.of("MATCHSTATE:0:30:cc/r250c/r500c/:9s8h|/8c8d5c/6s/2d", new TestTupl()),
            Pair.of("MATCHSTATE:0:30:cc/r250c/r500c/r1250:9s8h|/8c8d5c/6s/2d", new TestTupl()),
            Pair.of("MATCHSTATE:0:30:cc/r250c/r500c/r1250c:9s8h|9c6h/8c8d5c/6s/2d", new TestTupl()),
            Pair.of("MATCHSTATE:1:31::|JdTc", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300:|JdTc", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300r900:|JdTc", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300r900c/:|JdTc/6dJc9c", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300r900c/r1800:|JdTc/6dJc9c", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300r900c/r1800r3600:|JdTc/6dJc9c", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300r900c/r1800r3600r9000:|JdTc/6dJc9c", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300r900c/r1800r3600r9000c/:|JdTc/6dJc9c/Kh", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300r900c/r1800r3600r9000c/r20000:|JdTc/6dJc9c/Kh", new TestTupl()),
            Pair.of("MATCHSTATE:1:31:r300r900c/r1800r3600r9000c/r20000c/:KsJs|JdTc/6dJc9c/Kh/Qc", new TestTupl()),
            Pair.of("MATCHSTATE:2:55::||AsTs", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:r:||AsTs", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rc:||AsTs", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rcc/:||AsTs/4cJh8h", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rcc/r:||AsTs/4cJh8h", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rcc/rf:||AsTs/4cJh8h", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rcc/rfc/:||AsTs/4cJh8h/Kd", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rcc/rfc/r:||AsTs/4cJh8h/Kd", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rcc/rfc/rc/:||AsTs/4cJh8h/Kd/8c", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rcc/rfc/rc/r:||AsTs/4cJh8h/Kd/8c", new TestTupl()),
            Pair.of("MATCHSTATE:2:55:rcc/rfc/rc/rf:||AsTs/4cJh8h/Kd/8c", new TestTupl()),
            Pair.of("MATCHSTATE:0:90::Ad6h||", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:c:Ad6h||", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:cr:Ad6h||", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:crf:Ad6h||", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:crfc/:Ad6h||/TsKd7h", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:crfc/r:Ad6h||/TsKd7h", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:crfc/rc/:Ad6h||/TsKd7h/Kh", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:crfc/rc/r:Ad6h||/TsKd7h/Kh", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:crfc/rc/rc/:Ad6h||/TsKd7h/Kh/6d", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:crfc/rc/rc/r:Ad6h||/TsKd7h/Kh/6d", new TestTupl()),
            Pair.of("MATCHSTATE:0:90:crfc/rc/rc/rc:Ad6h||Td2h/TsKd7h/Kh/6d", new TestTupl())};

    @Theory
    public void testDecoding(Pair<String, TestTupl> testTupl) {
        ACPCParser parser = new ACPCParser();
        System.out.println(testTupl.getLeft());
        ServerResponse response = parser.parseServerResponse(testTupl.getLeft());
        System.out.println(response);
    }

    private static class TestTupl {

        int position;
        int hand;
        List<Pair<Integer, Card>> cardsPerRound = new ArrayList<>();
        List<Pair<Integer, Betting>> betsPerRound = new ArrayList<>();
        List<Card> holeCards = new ArrayList<>();

        private int currentCardRound = 0;
        private int currentActionRound = 0;


        public TestTupl cards(Integer round, Card... cards) {
            Optional.ofNullable(cards).ifPresent(_cards -> {
                Stream.of(_cards).forEach(card -> cardsPerRound.add(Pair.of(round, card)));
            });
            return this;
        }

        public TestTupl bets(Integer round, Betting... bettings) {
            Optional.ofNullable(bettings).ifPresent(_bettings -> {
                Stream.of(_bettings).forEach(betting -> betsPerRound.add(Pair.of(round, betting)));
            });
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
