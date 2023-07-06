/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EveryNthTest {
    @ParameterizedTest
    @CsvSource({ "Miracle,2,Mrce", "abcdefg,2,aceg", "abcdefg,3,adg" })
    void everyNthExamples(String s, int n, String expected) {
        assertThat(EveryNth.solution(s, n)).isEqualTo(expected);
    }
}
