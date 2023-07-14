/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinCatTest {
    @ParameterizedTest
    @CsvSource({ "Hello,Hi,loHi", "Hello,java,ellojava", "java,Hello,javaello" })
    void solutionExamples(String s, String t, String expected) {
        assertThat(MinCat.solution(s, t)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,Hi,loHi", "Hello,java,ellojava", "java,Hello,javaello" })
    void verboseExamples(String s, String t, String expected) {
        assertThat(MinCat.verbose(s, t)).isEqualTo(expected);
    }
}
