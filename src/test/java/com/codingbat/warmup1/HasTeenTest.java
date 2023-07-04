/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HasTeenTest {
    @ParameterizedTest
    @CsvSource({ "13,20,10,true", "20,19,10,true", "20,10,13,true" })
    void solutionExamples(int first, int second, int third, boolean expected) {
        assertThat(HasTeen.solution(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "10,false", "13,true", "19,true", "20,false" })
    void solutionExamples(int value, boolean expected) {
        assertThat(HasTeen.isTeen(value)).isEqualTo(expected);
    }
}
