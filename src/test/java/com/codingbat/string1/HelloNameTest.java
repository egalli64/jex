/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HelloNameTest {
    @ParameterizedTest
    @CsvSource({ "Bob,Hello Bob!", "Alice,Hello Alice!", "X,Hello X!" })
    void solutionExamples(String input, String expected) {
        assertThat(HelloName.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Bob,Hello Bob!", "Alice,Hello Alice!", "X,Hello X!" })
    void builderExamples(String input, String expected) {
        assertThat(HelloName.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Bob,Hello Bob!", "Alice,Hello Alice!", "X,Hello X!" })
    void builderCompactExamples(String input, String expected) {
        assertThat(HelloName.solution(input)).isEqualTo(expected);
    }
}
