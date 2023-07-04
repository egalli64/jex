package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StartOzTest {
    @ParameterizedTest
    @CsvSource({ "ozymandias,oz", "bzoo,z", "oxx,o" })
    void startOzExamples(String input, String expected) {
        assertThat(StartOz.solution(input)).isEqualTo(expected);
    }
}
