package com.hackerrank.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BeautifulBinaryStringTest {
    @ParameterizedTest
    @CsvSource({"0101010,2", "01100,0", "0100101010,3"})
    void beautifulBinaryStringSamples(String input, int expected) {
        int actual = BeautifulBinaryString.beautifulBinaryString(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}