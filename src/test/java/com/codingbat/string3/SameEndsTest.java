/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SameEndsTest {
    @ParameterizedTest
    @CsvSource({ "abXYab,ab", "xx,x", "xxx,x" })
    void solutionExamples(String input, String expected) {
        assertThat(SameEnds.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abXYab,ab", "xx,x", "xxx,x" })
    void alternativeExamples(String input, String expected) {
        assertThat(SameEnds.alternative(input)).isEqualTo(expected);
    }
}
