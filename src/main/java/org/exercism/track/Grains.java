/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import java.math.BigInteger;

/**
 * Grains: exercism.org/tracks/java/exercises/grains
 * <p>
 * Calculate the number of grains of wheat on a chessboard given that the number on each square doubles.
 */
class Grains {
    /**
     * Expected number of grains on a square
     * <p>
     * square 1 is 2^0, 2 is 2^1, ... 64 is 2^63
     *
     * @param square in 1..64
     * @return number of grains
     * @throws IllegalArgumentException when bad square passed in
     */
    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return switch (square) {
            case 1 -> BigInteger.ONE;
            case 2 -> BigInteger.TWO;
            default -> BigInteger.ONE.shiftLeft(square - 1);
        };
    }

    /**
     * Number of grains on board
     * <p>
     * Sum them up, and you get 2^26 - 1
     *
     * @return total number
     */
    BigInteger grainsOnBoard() {
        return BigInteger.ONE.shiftLeft(64).subtract(BigInteger.ONE);
    }
}
