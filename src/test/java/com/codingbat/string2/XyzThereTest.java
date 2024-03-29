/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class XyzThereTest {
    @ParameterizedTest
    @CsvSource({ "abcxyz,true", "abc.xyz,false", "xyz.abc,true" })
    void solutionExamples(String input, boolean expected) {
        assertThat(XyzThere.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcxyz,true", "abc.xyz,false", "xyz.abc,true" })
    void byIndexOfExamples(String input, boolean expected) {
        assertThat(XyzThere.byIndexOf(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcxyz,true", "abc.xyz,false", "xyz.abc,true" })
    void matchExamples(String input, boolean expected) {
        assertThat(XyzThere.match(input)).isEqualTo(expected);
    }
}
