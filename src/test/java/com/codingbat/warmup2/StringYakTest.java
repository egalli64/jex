/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringYakTest {
    @ParameterizedTest
    @CsvSource({ "yakpak,pak", "pakyak,pak", "yak123ya,123ya" })
    void stringYakExamples(String input, String expected) {
        assertThat(StringYak.solution(input)).isEqualTo(expected);
    }
}
