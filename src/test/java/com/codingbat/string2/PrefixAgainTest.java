/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PrefixAgainTest {
    @ParameterizedTest
    @CsvSource({ "abXYabc,1,true", "abXYabc,2,true", "abXYabc,3,false" })
    void solutionExamples(String s, int n, boolean expected) {
        assertThat(PrefixAgain.solution(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abXYabc,1,true", "abXYabc,2,true", "abXYabc,3,false" })
    void byContainsExamples(String s, int n, boolean expected) {
        assertThat(PrefixAgain.byContains(s, n)).isEqualTo(expected);
    }
}
