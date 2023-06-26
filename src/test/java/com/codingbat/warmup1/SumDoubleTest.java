/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * sumDouble - codingbat.com/prob/p181646
 * 
 * My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumDoubleTest {
    @ParameterizedTest
    @CsvSource({ "1,2,3", "3,2,5", "2,2,8" })
    void plainExamples(int a, int b, int expected) {
        assertThat(SumDouble.plain(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1,2,3", "3,2,5", "2,2,8" })
    void verboseExamples(int a, int b, int expected) {
        assertThat(SumDouble.plain(a, b)).isEqualTo(expected);
    }
}
