/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InOrderTest {
    @ParameterizedTest
    @CsvSource({ "1, 2, 4, false, true", "1, 2, 1, false, false", "1, 1, 2, true, true" })
    void solutionExamples(int a, int b, int c, boolean flag, boolean expected) {
        assertThat(InOrder.solution(a, b, c, flag)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 4, false, true", "1, 2, 1, false, false", "1, 1, 2, true, true" })
    void compactExamples(int a, int b, int c, boolean flag, boolean expected) {
        assertThat(InOrder.compact(a, b, c, flag)).isEqualTo(expected);
    }
}
