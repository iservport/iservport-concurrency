package com.iservport.concurrency.domain.data;

public enum CardSuit {

    S("SPADE", CardColour.B), C("CLOVER", CardColour.B), H("HEART", CardColour.R), D("DIAMOND", CardColour.R);

    private String suitName;

    private CardColour colour;

    CardSuit(String suitName, CardColour colour) {
        this.suitName = suitName;
        this.colour = colour;
    }

    public String getSuitName() {
        return suitName;
    }

    public CardColour getColour() {
        return colour;
    }
}
