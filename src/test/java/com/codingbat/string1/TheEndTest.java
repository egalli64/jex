/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TheEndTest {
    @ParameterizedTest
    @CsvSource({ "Hello,true,H", "Hello,false,o", "oh,true,o" })
    void solutionExamples(String s, boolean front, String expected) {
        assertThat(TheEnd.solution(s, front)).isEqualTo(expected);
    }
}
