/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MiddleTwoTest {
    @ParameterizedTest
    @CsvSource({ "string,ri", "code,od", "Practice,ct" })
    void solutionExamples(String input, String expected) {
        assertThat(MiddleTwo.solution(input)).isEqualTo(expected);
    }
}
