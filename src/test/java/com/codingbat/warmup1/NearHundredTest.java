package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NearHundredTest {
    @ParameterizedTest
    @CsvSource({ "93,true", "90,true", "89,false" })
    void plainExamples(int input, boolean expected) {
        assertThat(NearHundred.plain(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "93,true", "90,true", "89,false" })
    void isInRangeExamples(int input, boolean expected) {
        assertThat(NearHundred.isInRange(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "93,true", "90,true", "89,false" })
    void isCloseExamples(int input, boolean expected) {
        assertThat(NearHundred.isClose(input)).isEqualTo(expected);
    }
}
