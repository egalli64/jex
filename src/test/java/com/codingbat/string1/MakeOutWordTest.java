/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MakeOutWordTest {
    @ParameterizedTest
    @CsvSource({ "<<>>,Yay,<<Yay>>", "<<>>,WooHoo,<<WooHoo>>", "[[]],word,[[word]]" })
    void solutionExamples(String template, String word, String expected) {
        assertThat(MakeOutWord.solution(template, word)).isEqualTo(expected);
    }
}
