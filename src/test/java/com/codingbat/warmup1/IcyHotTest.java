/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IcyHotTest {

    @ParameterizedTest
    @CsvSource({ "120, -1, true", "-1, 120, true", "2, 120, false" })
    void icyHotExamples(int first, int second, boolean expected) {
        assertThat(IcyHot.solution(first, second)).isEqualTo(expected);
    }
}
