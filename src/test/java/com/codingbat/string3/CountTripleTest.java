/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountTripleTest {
    @ParameterizedTest
    @CsvSource({ "abcXXXabc,1", "xxxabyyyycd,3", "a,0" })
    void solutionExamples(String s, int expected) {
        assertThat(CountTriple.solution(s)).isEqualTo(expected);
    }
}
