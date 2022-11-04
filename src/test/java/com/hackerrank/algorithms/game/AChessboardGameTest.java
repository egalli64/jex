package com.hackerrank.algorithms.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AChessboardGameTest {
    @ParameterizedTest
    @CsvSource({"5,2,Second", "5,3,First", "8,8,First"})
    void chessboardGame(int x, int y, String expected) {
        String actual = AChessboardGame.chessboardGame(x, y);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}