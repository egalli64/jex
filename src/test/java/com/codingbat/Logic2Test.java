package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Logic2Test {
    @ParameterizedTest
    @CsvSource({ "4, 1, 9, 4", "4, 1, 10, -1", "4, 1, 7, 2" })
    void makeChocolateExamples(int small, int big, int target, int expected) {
        assertThat(Logic2.makeChocolate(small, big, target)).isEqualTo(expected);
    }
}