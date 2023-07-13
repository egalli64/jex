/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LastCharsTest {
    @ParameterizedTest
    @CsvSource({ "last,chars,ls", "yo,java,ya", "hi,'',h@" })
    void solutionExamples(String left, String right, String expected) {
        assertThat(LastChars.solution(left, right)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "last,chars,ls", "yo,java,ya", "hi,'',h@" })
    void oneLinerExamples(String left, String right, String expected) {
        assertThat(LastChars.oneLiner(left, right)).isEqualTo(expected);
    }
}
