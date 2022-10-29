package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ModifiedKaprekarNumbersTest {
    @Test
    void isKaprekar1() {
        int input = 1;
        boolean actual = ModifiedKaprekarNumbers.isKaprekar(input);
        assertThat(actual).isTrue();
    }

    @Test
    void isKaprekar5() {
        int input = 5;
        boolean actual = ModifiedKaprekarNumbers.isKaprekar(input);
        assertThat(actual).isFalse();
    }

    @Test
    void isKaprekar99() {
        int input = 99;
        boolean actual = ModifiedKaprekarNumbers.isKaprekar(input);
        assertThat(actual).isTrue();
    }
}