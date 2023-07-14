/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrontAgainTest {
    @ParameterizedTest
    @CsvSource({ "edited,true", "edit,false", "ed,true" })
    void solutionExamples(String s, boolean expected) {
        assertThat(FrontAgain.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "edited,true", "edit,false", "ed,true" })
    void subCompareExamples(String s, boolean expected) {
        assertThat(FrontAgain.subCompare(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "edited,true", "edit,false", "ed,true" })
    void oneLinerExamples(String s, boolean expected) {
        assertThat(FrontAgain.oneLiner(s)).isEqualTo(expected);
    }
}
