/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StartWordTest {
    @ParameterizedTest
    @CsvSource({ "hippo,hi,hi", "hippo,xip,hip", "hippo,i,h" })
    void startWordExamples(String s, String check, String expected) {
        assertThat(StartWord.solution(s, check)).isEqualTo(expected);
    }
}
