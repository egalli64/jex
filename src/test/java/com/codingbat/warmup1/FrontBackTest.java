/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrontBackTest {
    @ParameterizedTest
    @CsvSource({ "code,eodc", "a,a", "ab,ba" })
    void solutionExamples(String input, String expected) {
        assertThat(FrontBack.solution(input)).isEqualTo(expected);
    }
}
