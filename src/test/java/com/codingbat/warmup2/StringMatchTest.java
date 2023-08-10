/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringMatchTest {
    @ParameterizedTest
    @CsvSource({ "xxcaazz,xxbaaz,3", "abc,abc,2", "abc,axc,0" })
    void solutionExamples(String left, String right, int expected) {
        assertThat(StringMatch.solution(left, right)).isEqualTo(expected);
    }
}
