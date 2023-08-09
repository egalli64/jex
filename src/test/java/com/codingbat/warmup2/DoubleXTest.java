/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DoubleXTest {
    @ParameterizedTest
    @CsvSource({ "axxbb,true", "axaxax,false", "xxxxx,true" })
    void solutionExamples(String input, boolean expected) {
        assertThat(DoubleX.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "axxbb,true", "axaxax,false", "xxxxx,true" })
    void verboseExamples(String input, boolean expected) {
        assertThat(DoubleX.verbose(input)).isEqualTo(expected);
    }
}
