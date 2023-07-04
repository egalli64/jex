/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DelDelTest {
    @ParameterizedTest
    @CsvSource({ "adelbc,abc", "adelHello,aHello", "adedbc,adedbc" })
    void solutionExamples(String input, String expected) {
        assertThat(DelDel.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "adelbc,abc", "adelHello,aHello", "adedbc,adedbc" })
    void subExamples(String input, String expected) {
        assertThat(DelDel.sub(input)).isEqualTo(expected);
    }
}
