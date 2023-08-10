/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringXTest {
    @ParameterizedTest
    @CsvSource({ "xxHxix,xHix", "abxxxcd,abcd", "xabxxxcdx,xabcdx" })
    void solutionExamples(String input, String expected) {
        assertThat(StringX.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xxHxix,xHix", "abxxxcd,abcd", "xabxxxcdx,xabcdx" })
    void alternativeExamples(String input, String expected) {
        assertThat(StringX.alternative(input)).isEqualTo(expected);
    }
}
