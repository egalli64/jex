/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WithoutStringTest {
    @ParameterizedTest
    @CsvSource({ "Hello there,llo,He there", "Hello there,e,Hllo thr", "Hello there,x,Hello there" })
    void solutionExamples(String base, String remove, String expected) {
        assertThat(WithoutString.solution(base, remove)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello there,llo,He there", "Hello there,e,Hllo thr", "Hello there,x,Hello there" })
    void byPatternExamples(String base, String remove, String expected) {
        assertThat(WithoutString.byPattern(base, remove)).isEqualTo(expected);
    }
}
