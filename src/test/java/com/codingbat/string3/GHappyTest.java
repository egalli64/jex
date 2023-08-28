/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GHappyTest {
    @ParameterizedTest
    @CsvSource({ "xxggxx,true", "xxgxx,false", "xxggyygxx,false" })
    void solutionExamples(String input, boolean expected) {
        assertThat(GHappy.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xxggxx,true", "xxgxx,false", "xxggyygxx,false" })
    void matchExamples(String input, boolean expected) {
        assertThat(GHappy.match(input)).isEqualTo(expected);
    }
}
