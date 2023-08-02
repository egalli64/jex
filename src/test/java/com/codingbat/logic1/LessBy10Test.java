/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LessBy10Test {
    @ParameterizedTest
    @CsvSource({ "1, 7, 11, true", "1, 7, 10, false", "11, 1, 7, true" })
    void solutionExamples(int a, int b, int c, boolean expected) {
        assertThat(LessBy10.solution(a, b, c)).isEqualTo(expected);
    }
    
    @ParameterizedTest
    @CsvSource({ "1, 11, true", "1, 7, false", "11, 1, true" })
    void distancedExamples(int left, int right, boolean expected) {
        assertThat(LessBy10.distanced(left, right)).isEqualTo(expected);
    }
}
