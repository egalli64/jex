/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CloseFarTest {
    @ParameterizedTest
    @CsvSource({ "1, 2, 10, true", "1, 2, 3, false", "4, 1, 3, true" })
    void solutionExamples(int first, int second, int third, boolean expected) {
        assertThat(CloseFar.solution(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 10, true", "1, 2, 3, false", "4, 1, 3, true" })
    void exclusiveExamples(int first, int second, int third, boolean expected) {
        assertThat(CloseFar.exclusive(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, true", "1, 3, false", "4, 3, true" })
    void closeExamples(int value, int target, boolean expected) {
        assertThat(CloseFar.isClose(value, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 10, false", "1, 3, 0, false", "4, 10, 1, true" })
    void farExamples(int value, int first, int second, boolean expected) {
        assertThat(CloseFar.isFar(value, first, second)).isEqualTo(expected);
    }
}
