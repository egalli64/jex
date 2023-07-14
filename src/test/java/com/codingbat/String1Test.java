package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class String1Test {
    @ParameterizedTest
    @CsvSource({ "xHi,Hi", "Hxi,Hi", "Hi,Hi" })
    void withoutX2Examples(String s, String expected) {
        assertThat(String1.withoutX2(s)).isEqualTo(expected);
    }
}