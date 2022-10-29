package com.hackerrank.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AnagramTest {
    @ParameterizedTest
    @CsvSource({"aaabbb,3", "ab,1", "abc,-1", "mnop,2", "xyyx,0", "xaxbbbxx,1"})
    void anagramSamples(String input, int expected) {
        int actual = Anagram.anagram(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}