/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ComboStringTest {
    @ParameterizedTest
    @CsvSource({ "Hello,hi,hiHellohi", "hi,Hello,hiHellohi", "aaa,b,baaab" })
    void comboStringExamples(String a, String b, String expected) {
        assertThat(ComboString.solution(a, b)).isEqualTo(expected);
    }
}
