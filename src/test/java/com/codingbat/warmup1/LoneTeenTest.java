/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LoneTeenTest {
    @ParameterizedTest
    @CsvSource({ "13, 99, true", "21, 19, true", "13, 13, false" })
    void solutionExamples(int first, int second, boolean expected) {
        assertThat(LoneTeen.solution(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "13, 99, true", "21, 19, true", "13, 13, false" })
    void verboseExamples(int first, int second, boolean expected) {
        assertThat(LoneTeen.verbose(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "10,false", "13,true", "19,true", "20,false" })
    void isTeenExamples(int value, boolean expected) {
        assertThat(LoneTeen.isTeen(value)).isEqualTo(expected);
    }
}
