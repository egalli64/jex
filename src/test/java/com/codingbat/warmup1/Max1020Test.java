/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Max1020Test {
    @ParameterizedTest
    @CsvSource({ "11, 19, 19", "19, 11, 19", "11, 9, 11" })
    void solutionExamples(int a, int b, int expected) {
        assertThat(Max1020.solution(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "10, true", "20, true", "9, false", "21, false" })
    void isIn1020Examples(int value, boolean expected) {
        assertThat(Max1020.isIn1020(value)).isEqualTo(expected);
    }
}
