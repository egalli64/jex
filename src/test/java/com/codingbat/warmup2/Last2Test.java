/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Last2Test {
    @ParameterizedTest
    @CsvSource({ "hixxhi,1", "xaxxaxaxx,1", "axxxaaxx,2" })
    void solutionExamples(String input, int expected) {
        assertThat(Last2.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hixxhi,1", "xaxxaxaxx,1", "axxxaaxx,2" })
    void solutionForExamples(String input, int expected) {
        assertThat(Last2.solutionFor(input)).isEqualTo(expected);
    }
}
