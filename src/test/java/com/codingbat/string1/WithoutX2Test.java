/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WithoutX2Test {
    @ParameterizedTest
    @CsvSource({ "xHi,Hi", "Hxi,Hi", "Hi,Hi" })
    void solutionExamples(String s, String expected) {
        assertThat(WithoutX2.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xHi,Hi", "Hxi,Hi", "Hi,Hi" })
    void verboseExamples(String s, String expected) {
        assertThat(WithoutX2.verbose(s)).isEqualTo(expected);
    }
}
