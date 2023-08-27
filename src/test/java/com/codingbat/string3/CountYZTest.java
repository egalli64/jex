/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountYZTest {
    @ParameterizedTest
    @CsvSource({ "fez day,2", "day fez,2", "day fyyyz,2" })
    void countYZExamples(String input, int expected) {
        assertThat(CountYZ.solution(input)).isEqualTo(expected);
    }
}
