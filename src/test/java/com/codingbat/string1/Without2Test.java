/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Without2Test {
    @ParameterizedTest
    @CsvSource({ "HelloHe,lloHe", "HelloHi,HelloHi", "Hi,''" })
    void solutionExamples(String s, String expected) {
        assertThat(Without2.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "HelloHe,lloHe", "HelloHi,HelloHi", "Hi,''" })
    void verboseExamples(String s, String expected) {
        assertThat(Without2.verbose(s)).isEqualTo(expected);
    }
}
