/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MaxMod5Test {
    @ParameterizedTest
    @CsvSource({ "2,3,3", "6,2,6", "3,2,3" })
    void solutionExamples(int a, int b, int expected) {
        assertThat(MaxMod5.solution(a, b)).isEqualTo(expected);
    }
}
