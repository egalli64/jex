/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BackAroundTest {
    @ParameterizedTest
    @CsvSource({ "cat,tcatt", "Hello,oHelloo", "a,aaa" })
    void backAroundExamples(String input, String expected) {
        assertThat(BackAround.solution(input)).isEqualTo(expected);
    }
}
