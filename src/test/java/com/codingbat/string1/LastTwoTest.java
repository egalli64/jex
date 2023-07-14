/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LastTwoTest {
    @ParameterizedTest
    @CsvSource({ "coding,codign", "cat,cta", "ab,ba" })
    void solutionExamples(String s, String expected) {
        assertThat(LastTwo.solution(s)).isEqualTo(expected);
    }
}
