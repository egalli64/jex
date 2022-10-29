package com.codewars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareDigitTest {
    @Test
    void squareDigitsStackPlain() {
        int actual = new SquareDigit().squareDigitsStack(123);
        int expected = 149;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test
    void squareDigitsStackGiven1() {
        int actual = new SquareDigit().squareDigitsStack(9119);
        int expected = 811181;
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void squareDigitsStackGiven2() {
        int actual = new SquareDigit().squareDigitsStack(0);
        int expected = 0;
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void squareDigitsPlain() {
        int actual = new SquareDigit().squareDigits(123);
        int expected = 149;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test
    void squareDigitsGiven1() {
        int actual = new SquareDigit().squareDigits(9119);
        int expected = 811181;
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void squareDigitsGiven2() {
        int actual = new SquareDigit().squareDigits(0);
        int expected = 0;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}