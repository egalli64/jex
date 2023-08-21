/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EvenlySpacedTest {
    @ParameterizedTest
    @CsvSource({ "2,4,6,true", "4,6,2,true", "4,6,3,false" })
    void solutionExamples(int first, int second, int third, boolean expected) {
        assertThat(EvenlySpaced.solution(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2,4,6,true", "4,6,2,true", "4,6,3,false" })
    void verboseExamples(int first, int second, int third, boolean expected) {
        assertThat(EvenlySpaced.verbose(first, second, third)).isEqualTo(expected);
    }
}
