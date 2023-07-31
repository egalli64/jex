/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TeenSumTest {
    @ParameterizedTest
    @CsvSource({ "3,4,7", "10,13,19", "13,2,19" })
    void solutionxamples(int a, int b, int expected) {
        assertThat(TeenSum.solution(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "3,false", "20,false", "13,true", "19,true" })
    void teenSumExamples(int x, boolean expected) {
        assertThat(TeenSum.isTeen(x)).isEqualTo(expected);
    }
}
