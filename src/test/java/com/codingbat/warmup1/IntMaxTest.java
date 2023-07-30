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
    void solutionExamples(int a, int b, int c, int expected) {
        assertThat(IntMax.solution(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 3", "1, 3, 2, 3", "3, 2, 1, 3" })
    void compactExamples(int a, int b, int c, int expected) {
        assertThat(IntMax.compact(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 3", "1, 3, 2, 3", "3, 2, 1, 3" })
    void verboseExamples(int a, int b, int c, int expected) {
        assertThat(IntMax.verbose(a, b, c)).isEqualTo(expected);
    }
}
