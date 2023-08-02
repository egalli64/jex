package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumLimitTest {
    @ParameterizedTest
    @CsvSource({ "2, 3, 5", "8, 3, 8", "8, 1, 9" })
    void solutionExamples(int a, int b, int expected) {
        assertThat(SumLimit.solution(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2, 1", "82, 2", "811, 3" })
    void digits(int value, int expected) {
        assertThat(SumLimit.digits(value)).isEqualTo(expected);
    }
}
