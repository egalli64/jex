/*
    Exercism Java track

    Source: exercism.org/tracks/java/exercises/connect
    My solutions: https://github.com/egalli64/jex

    Connect: Compute the result for a game of Hex / Polygon.
 */
package org.exercism.track.hex;

/**
 * PLAYER_O goes from top to bottom
 * <p>
 * PLAYER_X goes from left to right
 */
public enum Winner {
    PLAYER_O, PLAYER_X, NONE;

    /**
     * Utility to convert a string to Winner
     *
     * @param s a single char, X or O
     * @return the associated Winner
     */
    public static Winner from(String s) {
        return switch (s) {
            case "O" -> PLAYER_O;
            case "X" -> PLAYER_X;
            default -> NONE;
        };
    }
}