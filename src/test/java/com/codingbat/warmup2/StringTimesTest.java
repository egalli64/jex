/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringTimesTest {
    @ParameterizedTest
    @CsvSource({ "2,HiHi", "3,HiHiHi", "1,Hi" })
    void unsupportedExamples(int input, String expected) {
        assertThat(StringTimes.unsupported("Hi", input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2,HiHi", "3,HiHiHi", "1,Hi" })
    void solutionExamples(int input, String expected) {
        assertThat(StringTimes.solution("Hi", input)).isEqualTo(expected);
    }
}
