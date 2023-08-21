/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RoundSumTest {
    @ParameterizedTest
    @CsvSource({ "16,17,18,60", "12,13,14,30", "6,4,4,10" })
    void solutionExamples(int first, int second, int third, int expected) {
        assertThat(RoundSum.solution(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "17,20", "12,10", "4,0" })
    void solutionExamples(int value, int expected) {
        assertThat(RoundSum.round10(value)).isEqualTo(expected);
    }
}
