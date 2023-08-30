/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class OneTwoTest {
    @ParameterizedTest
    @CsvSource({ "abc,bca", "tca,cat", "tcagdo,catdog" })
    void solutionExamples(String s, String expected) {
        assertThat(OneTwo.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc,bca", "tca,cat", "tcagdo,catdog" })
    void alternativeExamples(String s, String expected) {
        assertThat(OneTwo.alternative(s)).isEqualTo(expected);
    }
}
