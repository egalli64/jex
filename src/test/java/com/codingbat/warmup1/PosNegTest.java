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
}
