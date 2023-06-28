/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Diff21Test {
    @ParameterizedTest
    @CsvSource({ "19,2", "10,11", "21,0" })
    void plainExamples(int input, int expected) {
        assertThat(Diff21.plain(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "19,2", "10,11", "21,0" })
    void verboseAbsExamples(int input, int expected) {
        assertThat(Diff21.verboseAbs(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "19,2", "10,11", "21,0" })
    void verboseExamples(int input, int expected) {
        assertThat(Diff21.verbose(input)).isEqualTo(expected);
    }
}
