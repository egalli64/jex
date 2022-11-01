package com.hackerrank.algorithms.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GameOfStonesTest {
    @ParameterizedTest
    @CsvSource({"1,Second", "2,First", "10,First"})
    void gameOfStones(int input, String expected) {
        String actual = GameOfStones.gameOfStones(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}