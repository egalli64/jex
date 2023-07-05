/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class In3050Test {
    @ParameterizedTest
    @CsvSource({ "30, 31, true", "30, 41, false", "40, 50, true" })
    void solutionExamples(int a, int b, boolean expected) {
        assertThat(In3050.solution(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "30, true", "31, true", "40, true", "50, false" })
    void in3040Examples(int value, boolean expected) {
        assertThat(In3050.in3040(value)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "30, false", "31, false", "40, true", "50, true" })
    void in4050Examples(int value, boolean expected) {
        assertThat(In3050.in4050(value)).isEqualTo(expected);
    }
}
