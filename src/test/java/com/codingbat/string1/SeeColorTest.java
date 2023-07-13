/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SeeColorTest {
    @ParameterizedTest
    @CsvSource({ "redxx,red", "blueTimes,blue", "xxred,''" })
    void solutionExamples(String input, String expected) {
        assertThat(SeeColor.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "redxx,red", "blueTimes,blue", "xxred,''" })
    void linearCheckExamples(String input, String expected) {
        assertThat(SeeColor.linearCheck(input)).isEqualTo(expected);
    }
}
