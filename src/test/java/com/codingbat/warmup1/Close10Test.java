/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Close10Test {
    @ParameterizedTest
    @CsvSource({ "8,13,8", "13,8,8", "13,7,0" })
    void close10Examples(int first, int second, int expected) {
        assertThat(Close10.solution(first, second)).isEqualTo(expected);
    }
}
