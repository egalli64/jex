package com.hackerrank.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SeparateTheNumbersTest {
    @ParameterizedTest
    @CsvSource({"1234", "91011", "99100", "101103", "010203", "13", "1"})
    void separateNumbersSample0(String input) {
        SeparateTheNumbers.separateNumbers(input);
    }

    @ParameterizedTest
    @CsvSource({"1234,1", "91011,9", "99100,99", "101103,-1", "010203,-1", "13,-1", "1,-1"})
    void starterSample0(String input, int expected) {
        long actual = SeparateTheNumbers.starter(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void starterLongestPositive() {
        String input = "10000000000000001000000000000001";
        long expected = 1000_0000_0000_0000L;
        long actual = SeparateTheNumbers.starter(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void starterLongestNegative() {
        String input = "99999999999999990000000000000000";
        long expected = -1L;
        long actual = SeparateTheNumbers.starter(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}