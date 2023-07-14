/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DeFrontTest {
    @ParameterizedTest
    @CsvSource({ "Hello,llo", "java,va", "away,aay" })
    void verboseExamples(String s, String expected) {
        assertThat(DeFront.verbose(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,llo", "java,va", "away,aay" })
    void solutionExamples(String s, String expected) {
        assertThat(DeFront.solution(s)).isEqualTo(expected);
    }
}
