/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumDigitsTest {
    @ParameterizedTest
    @CsvSource({ "aa1bc2d3,6", "aa11b33,8", "Chocolate,0" })
    void solutionExamples(String s, int expected) {
        assertThat(SumDigits.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aa1bc2d3,6", "aa11b33,8", "Chocolate,0" })
    void alternativeExamples(String s, int expected) {
        assertThat(SumDigits.alternative(s)).isEqualTo(expected);
    }
}
