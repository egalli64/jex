/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringSplosionTest {
    @ParameterizedTest
    @CsvSource({ "Code,CCoCodCode", "abc,aababc", "ab,aab" })
    void stringSplosionExamples(String input, String expected) {
        assertThat(StringSplosion.solution(input)).isEqualTo(expected);
    }
}
