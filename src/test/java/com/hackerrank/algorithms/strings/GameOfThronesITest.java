package com.hackerrank.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GameOfThronesITest {
    @ParameterizedTest
    @CsvSource({"aaabbbb,YES", "cdefghmnopqrstuvw,NO", "cdcdcdcdeeeef,YES"})
    void gameOfThronesSamples(String input, String expected) {
        String actual = GameOfThronesI.gameOfThrones(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}