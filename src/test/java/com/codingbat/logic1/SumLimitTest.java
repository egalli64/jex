/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
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
    void digitsBasics(int value, int expected) {
        assertThat(SumLimit.digits(value)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2, 3, 5", "8, 3, 8", "8, 1, 9" })
    void alternativeExamples(int a, int b, int expected) {
        assertThat(SumLimit.alternative(a, b)).isEqualTo(expected);
    }
}
