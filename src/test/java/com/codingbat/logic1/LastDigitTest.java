/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LastDigitTest {
    @ParameterizedTest
    @CsvSource({ "23, 19, 13, true", "23, 19, 12, false", "23, 19, 3, true" })
    void solutionExamples(int a, int b, int c, boolean expected) {
        assertThat(LastDigit.solution(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "23, 19, 13, true", "23, 19, 12, false", "23, 19, 3, true" })
    void compactExamples(int a, int b, int c, boolean expected) {
        assertThat(LastDigit.compact(a, b, c)).isEqualTo(expected);
    }
}
