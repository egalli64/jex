/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PosNegTest {
    @ParameterizedTest
    @CsvSource({ "1, -1, false, true", "-1, 1, false, true", "-4, -5, true, true" })
    void plainExamples(int first, int second, boolean flag, boolean expected) {
        assertThat(PosNeg.plain(first, second, flag)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, -1, false, true", "-1, 1, false, true", "-4, -5, true, true" })
    void oneLinerExamples(int first, int second, boolean flag, boolean expected) {
        assertThat(PosNeg.oneLiner(first, second, flag)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, -1, false, true", "-1, 1, false, true", "-4, -5, true, true" })
    void posNegExExamples(int first, int second, boolean flag, boolean expected) {
        assertThat(PosNeg.obscure(first, second, flag)).isEqualTo(expected);
    }
}
