package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NotStringTest {
    @ParameterizedTest
    @CsvSource({ "candy,not candy", "x,not x", "not bad,not bad" })
    void checkByStartWithExamples(String input, String expected) {
        assertThat(NotString.checkByStartWith(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "candy,not candy", "x,not x", "not bad,not bad" })
    void compactExamples(String input, String expected) {
        assertThat(NotString.compact(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "candy,not candy", "x,not x", "not bad,not bad" })
    void checkBySubstringExamples(String input, String expected) {
        assertThat(NotString.checkBySubstring(input)).isEqualTo(expected);
    }
}
