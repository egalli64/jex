/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class In1020Test {

    @ParameterizedTest
    @CsvSource({ "12, 99, true", "21, 12, true", "8, 99, false" })
    void solutionExamples(int first, int second, boolean expected) {
        assertThat(In1020.solution(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "12, true", "21, false", "8, false", "99, false" })
    void isInRangeExamples(int value, boolean expected) {
        assertThat(In1020.isInRange(value)).isEqualTo(expected);
    }

}
