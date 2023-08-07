/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WithoutXTest {
    @ParameterizedTest
    @CsvSource({ "xHix,Hi", "xHi,Hi", "Hxix,Hxi" })
    void solutionExamples(String s, String expected) {
        assertThat(WithoutX.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "'',''", "x,''", "xx,''", "ax,a", "xa,a" })
    void solutionLimit(String s, String expected) {
        assertThat(WithoutX.solution(s)).isEqualTo(expected);
    }
}
