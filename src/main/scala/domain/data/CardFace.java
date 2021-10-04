package com.iservport.concurrency.domain.data;

public enum CardFace {

    _A,
    _2,
    _3,
    _4,
    _5,
    _6,
    _7,
    _8,
    _9,
    _10,
    _J(false),
    _Q(false),
    _K(false);

    private boolean numeric;

    CardFace() {
        this.numeric = true;
    }

    CardFace(boolean numeric) {
        this.numeric = numeric;
    }

    public boolean isNumeric() {
        return numeric;
    }
}
