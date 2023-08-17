/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountHiTest {
    @ParameterizedTest
    @CsvSource({ "abc hi ho,1", "ABChi hi,2", "hihi,2" })
    void solutionExamples(String input, int expected) {
        assertThat(CountHi.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc hi ho,1", "ABChi hi,2", "hihi,2" })
    void verboseExamples(String input, int expected) {
        assertThat(CountHi.verbose(input)).isEqualTo(expected);
    }
}
