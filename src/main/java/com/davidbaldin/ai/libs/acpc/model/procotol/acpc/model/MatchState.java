package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.IntIterator;

public class MatchState {

    private int position = 0;
    private int handNumber = 0;
    /**
     * Bets for each round where {@link List#indexOf(Object)} is the round.
     */
    private Int2ObjectArrayMap<List<Bet>> bets = new Int2ObjectArrayMap<>();

    /**
     * A hole card, or down card, is a card dealt face down that only the player himself can see.
     * <p>
     * Unlike community cards, or community cards, which are dealt face down to all players.
     */
    private List<Card> holeCards = new ArrayList<>();

    private Int2ObjectArrayMap<List<Card>> boardCards = new Int2ObjectArrayMap<>();

    public int getHandNumber() {
        return handNumber;
    }

    public void setHandNumber(int handNumber) {
        this.handNumber = handNumber;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void addBetting(int round, Bet bet) {
        List<Bet> bets = this.bets.get(round);
        if (Objects.isNull(bets)) {
            bets = new ArrayList<>();
        }
        bets.add(bet);
        this.bets.put(round, bets);
    }

    public void addHoleCard(Card card) {
        this.holeCards.add(card);
    }

    public void addBoardCard(int round, Card card) {
        List<Card> cards = this.boardCards.get(round);
        if (Objects.isNull(cards)) {
            cards = new ArrayList<>();
        }
        cards.add(card);
        this.boardCards.put(round, cards);
    }

    public Int2ObjectArrayMap<List<Bet>> getBets() {
        return bets;
    }

    public List<Bet> getBets(int round) {
        return bets.get(round);
    }

    public Int2ObjectArrayMap<List<Card>> getBoardCards() {
        return boardCards;
    }

    public List<Card> getBoardCards(int round) {
        return boardCards.get(round);
    }

    public List<Card> getHoleCards() {
        return holeCards;
    }

    @Override
    public String toString() {


        return "MatchState{\n" +
                "\tposition: " + position + ",\n" +
                "\thandNumber: " + handNumber + ",\n" +
                "\tbets: " + getBetsAsString() + ",\n" +
                "\thole: " + holeCards + ",\n" +
                "\tboard: " + getBoardAsString() + "\n" +
                '}';
    }


    private String getBoardAsString() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        pw.print("{");
        if (boardCards != null && !boardCards.isEmpty()) {
            IntIterator rountIter = boardCards.keySet().iterator();
            Integer round = null;
            while (rountIter.hasNext() && (round = rountIter.next()) != null) {
                pw.print("\n\t\t" + round + ":");
                List<Card> cardsPerRound = this.boardCards.get(round);
                pw.print("[");
                if (cardsPerRound != null && !cardsPerRound.isEmpty()) {
                    pw.print(StringUtils.join(cardsPerRound, ", "));
                }
                pw.print("]");
                if (rountIter.hasNext()) {
                    pw.print(",");
                }
            }
        }
        pw.print("}");

        return sw.toString();
    }

    private String getBetsAsString() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        pw.print("{");
        if (bets != null && !bets.isEmpty()) {
            IntIterator roundIter = bets.keySet().iterator();
            Integer round = null;
            while (roundIter.hasNext() && (round = roundIter.next()) != null) {
                pw.print("\n\t\t" + round + ":");
                List<Bet> betsPerRound = this.bets.get(round);
                pw.print("[");
                if (betsPerRound != null && !betsPerRound.isEmpty()) {
                    Bet bet;
                    Iterator<Bet> iter = betsPerRound.iterator();
                    while (iter.hasNext() && (bet = iter.next()) != null) {
                        Long value = bet.getValue();
                        if (value != null) {
                            pw.print("{");
                        }
                        pw.print(bet.getType());
                        if (value != null) {
                            pw.print(", ");
                            pw.print(value);
                            pw.print("}");
                        }
                        if (iter.hasNext()) {
                            pw.print(", ");
                        }
                    }
                }
                pw.print("]");
                if (roundIter.hasNext()) {
                    pw.print(",");
                }
            }
        }
        pw.print("}");

        return sw.toString();
    }
}
