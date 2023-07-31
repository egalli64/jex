/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TwoAsOneTest {
    @ParameterizedTest
    @CsvSource({ "1, 2, 3, true", "3, 1, 2, true", "3, 2, 2, false" })
    void solutionExamples(int a, int b, int c, boolean expected) {
        assertThat(TwoAsOne.solution(a, b, c)).isEqualTo(expected);
    }
}
