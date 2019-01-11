package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;

public class MatchState {
    private int position = 0;
    private int handNumber = 0;
    /**
     * Bettings for each round where {@link List#indexOf(Object)} is the round.
     */
    private Int2ObjectArrayMap<List<Betting>> bettings = new Int2ObjectArrayMap<>();

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

    public void addBetting(int round, Betting betting) {
        List<Betting> bettings = this.bettings.get(round);
        if (Objects.isNull(bettings)) {
            bettings = new ArrayList<>();
        }
        bettings.add(betting);
        this.bettings.put(round, bettings);
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

    public Int2ObjectArrayMap<List<Betting>> getBettings() {
        return bettings;
    }

    public List<Betting> getBettings(int round) {
        return bettings.get(round);
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
                "\tposition = " + position + ",\n" +
                "\thandNumber = " + handNumber + ",\n" +
                "\tbettings = " + bettings + ",\n" +
                "\tholeCards = " + holeCards + ",\n" +
                "\tboardCards = " + boardCards + "\n" +
                '}';
    }
}
