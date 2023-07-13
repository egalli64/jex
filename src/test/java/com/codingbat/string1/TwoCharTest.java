/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TwoCharTest {
    @ParameterizedTest
    @CsvSource({ "java,0,ja", "java,2,va", "java,3,ja" })
    void solutionExamples(String s, int n, String expected) {
        assertThat(TwoChar.solution(s, n)).isEqualTo(expected);
    }
}
