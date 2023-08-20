/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WordEndsTest {
    @ParameterizedTest
    @CsvSource({ "abcXY123XYijk,XY,c13i", "XY123XY,XY,13", "XY1XY,XY,11" })
    void wordEndsExamples(String s, String w, String expected) {
        assertThat(WordEnds.solution(s, w)).isEqualTo(expected);
    }
}
