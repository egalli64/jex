/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumNumbersTest {
    @ParameterizedTest
    @CsvSource({ "abc123xyz,123", "aa11b33,44", "7 11,18" })
    void solutionExamples(String s, int expected) {
        assertThat(SumNumbers.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc123xyz,123", "aa11b33,44", "7 11,18" })
    void alternativeExamples(String s, int expected) {
        assertThat(SumNumbers.alternative(s)).isEqualTo(expected);
    }
}
