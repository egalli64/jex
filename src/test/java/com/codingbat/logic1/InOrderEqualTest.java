/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InOrderEqualTest {
    @ParameterizedTest
    @CsvSource({ "2, 5, 11, false, true", "5, 7, 6, false, false", "5, 5, 7, true, true" })
    void solutionExamples(int a, int b, int c, boolean flag, boolean expected) {
        assertThat(InOrderEqual.solution(a, b, c, flag)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2, 5, 11, false, true", "5, 7, 6, false, false", "5, 5, 7, true, true" })
    void verboseExamples(int a, int b, int c, boolean flag, boolean expected) {
        assertThat(InOrderEqual.verbose(a, b, c, flag)).isEqualTo(expected);
    }
}
