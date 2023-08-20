/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StarOutTest {
    @ParameterizedTest
    @CsvSource({ "ab*cd,ad", "ab**cd,ad", "sm*eilly,silly" })
    void solutionExamples(String s, String expected) {
        assertThat(StarOut.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "ab*cd,ad", "ab**cd,ad", "sm*eilly,silly" })
    void byReplaceAllExamples(String s, String expected) {
        assertThat(StarOut.byReplaceAll(s)).isEqualTo(expected);
    }
}
