/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RepeatEndTest {
    @ParameterizedTest
    @CsvSource({ "Hello,3,llollollo", "Hello,2,lolo", "Hello,1,o" })
    void solutionExamples(String s, int n, String expected) {
        assertThat(RepeatEnd.solution(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,3,llollollo", "Hello,2,lolo", "Hello,1,o" })
    void unsupportedExamples(String s, int n, String expected) {
        assertThat(RepeatEnd.unsupported(s, n)).isEqualTo(expected);
    }
}
