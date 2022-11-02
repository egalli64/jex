package com.hackerrank.algorithms.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TowerBreakersTest {
    @ParameterizedTest
    @CsvSource({"2,2,2", "1,4,1"})
    void towerBreakersSamples(int n, int height, int expected) {
        int actual = TowerBreakers.towerBreakers(n, height);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}