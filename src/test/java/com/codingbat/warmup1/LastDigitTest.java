/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LastDigitTest {
    @ParameterizedTest
    @CsvSource({ "7, 17, true", "6, 17, false", "3, 113, true" })
    void lastDigitExamples(int a, int b, boolean expected) {
        assertThat(LastDigit.solution(a, b)).isEqualTo(expected);
    }
}
