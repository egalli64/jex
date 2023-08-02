package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Logic1Test {
    @ParameterizedTest
    @CsvSource({ "2, 3, 5", "8, 3, 8", "8, 1, 9" })
    void sumLimitExamples(int a, int b, int expected) {
        assertThat(Logic1.sumLimit(a, b)).isEqualTo(expected);
    }
}