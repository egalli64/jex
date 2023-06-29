/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Makes10Test {
    @ParameterizedTest
    @CsvSource({ "9,10,true", "9,9,false", "1,9,true" })
    void plain(int a, int b, boolean expected) {
        assertThat(Makes10.plain(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "9,10,true", "9,9,false", "1,9,true" })
    void verbose(int a, int b, boolean expected) {
        assertThat(Makes10.verbose(a, b)).isEqualTo(expected);
    }
}
