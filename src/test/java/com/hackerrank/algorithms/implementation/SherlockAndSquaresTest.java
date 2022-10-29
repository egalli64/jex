package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SherlockAndSquaresTest {

    @Test
    void squaresSmallCouple() {
        int left = 3;
        int right = 9;
        int expected = 2;

        int actual = SherlockAndSquares.squares(left, right);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void squaresSmallTrio() {
        int left = 35;
        int right = 70;
        int expected = 3;

        int actual = SherlockAndSquares.squares(left, right);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void squaresEmpty() {
        int left = 17;
        int right = 24;
        int expected = 0;

        int actual = SherlockAndSquares.squares(left, right);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void squaresCoupleOfDozens() {
        int left = 100;
        int right = 1_000;
        int expected = 22;

        int actual = SherlockAndSquares.squares(left, right);
        assertThat(actual).isEqualTo(expected);
    }
}