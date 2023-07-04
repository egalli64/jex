/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IntMaxTest {
    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 3", "1, 3, 2, 3", "3, 2, 1, 3" })
    void directExamples(int a, int b, int c, int expected) {
        assertThat(IntMax.direct(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 3", "1, 3, 2, 3", "3, 2, 1, 3" })
    void mathMaxExamples(int a, int b, int c, int expected) {
        assertThat(IntMax.mathMax(a, b, c)).isEqualTo(expected);
    }
}
