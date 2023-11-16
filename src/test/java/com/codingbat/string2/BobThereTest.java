/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BobThereTest {
    @ParameterizedTest
    @CsvSource({ "abcbob,true", "b9b,true", "bac,false" })
    void solutionExamples(String input, boolean expected) {
        assertThat(BobThere.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcbob,true", "b9b,true", "bac,false" })
    void stringMatchesExamples(String input, boolean expected) {
        assertThat(BobThere.stringMatches(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcbob,true", "b9b,true", "bac,false" })
    void patternMatchesExamples(String input, boolean expected) {
        assertThat(BobThere.patternMatches(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcbob,true", "b9b,true", "bac,false" })
    void patternMatcherFindExamples(String input, boolean expected) {
        assertThat(BobThere.patternMatcherFind(input)).isEqualTo(expected);
    }
}
