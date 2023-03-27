/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

/**
 * Pawn colors
 */
public enum Color {
    RED, BLUE, NONE;

    /**
     * Factory method
     *
     * @param c the character representing a color: R or B
     * @return the associated color, or NONE
     */
    public static Color from(char c) {
        return switch (c) {
            case 'R' -> RED;
            case 'B' -> BLUE;
            default -> NONE;
        };
    }

    public char toChar() {
        return switch (this.ordinal()) {
            case 0 -> 'R';
            case 1 -> 'B';
            default -> ' ';
        };
    }
}
