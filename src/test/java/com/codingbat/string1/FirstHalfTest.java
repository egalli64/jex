/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FirstHalfTest {
    @ParameterizedTest
    @CsvSource({ "WooHoo,Woo", "HelloThere,Hello", "abcdef,abc" })
    void firstHalfExamples(String input, String expected) {
        assertThat(FirstHalf.solution(input)).isEqualTo(expected);
    }
}
