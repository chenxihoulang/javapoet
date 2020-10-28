package com.chw.javapoet;

public enum Roshambo {
    ROCK("fist") {
        @java.lang.Override
        public java.lang.String toString() {
            return "avalanche!";
        }
    },

    SCISSORS("peace"),

    PAPER("flat");

    private final java.lang.String handsign;

    Roshambo(java.lang.String handsign) {
        this.handsign = handsign;
    }

    @Override
    public String toString() {
        return "Roshambo{" +
                "handsign='" + handsign + '\'' +
                '}';
    }
}