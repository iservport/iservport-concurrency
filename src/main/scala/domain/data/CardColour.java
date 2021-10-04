package com.iservport.concurrency.domain.data;

public enum CardColour {

    R("RED"), B("BLACK");

    private String colourName;

    CardColour(String colourName) {
        this.colourName = colourName;
    }

    public String getColorName() {
        return colourName;
    }
}
