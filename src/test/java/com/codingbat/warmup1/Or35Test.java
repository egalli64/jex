/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Or35Test {
    @ParameterizedTest
    @CsvSource({ "3,true", "10,true", "8,false" })
    void solutionExamples(int input, boolean expected) {
        assertThat(Or35.solution(input)).isEqualTo(expected);
    }
}
