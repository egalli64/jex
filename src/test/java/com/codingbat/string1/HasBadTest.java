/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HasBadTest {
    @ParameterizedTest
    @CsvSource({ "badxx,true", "xbadxx,true", "xxbadxx,false" })
    void solutionExamples(String s, boolean expected) {
        assertThat(HasBad.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "badxx,true", "xbadxx,true", "xxbadxx,false" })
    void oneLinerExamples(String s, boolean expected) {
        assertThat(HasBad.oneLiner(s)).isEqualTo(expected);
    }
}
