/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MaxBlockTest {
    @ParameterizedTest
    @CsvSource({ "hoopla,2", "abbCCCddBBBxx,3", "'',0" })
    void solutionExamples(String s, int expected) {
        assertThat(MaxBlock.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hoopla,2", "abbCCCddBBBxx,3", "'',0" })
    void alternativeExamples(String s, int expected) {
        assertThat(MaxBlock.alternative(s)).isEqualTo(expected);
    }
}
