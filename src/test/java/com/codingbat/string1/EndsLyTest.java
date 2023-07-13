/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EndsLyTest {
    @ParameterizedTest
    @CsvSource({ "oddly,true", "y,false", "oddy,false" })
    void solutionExamples(String s, Boolean expected) {
        assertThat(EndsLy.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "oddly,true", "y,false", "oddy,false" })
    void endsWithExamples(String s, Boolean expected) {
        assertThat(EndsLy.endsWith(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "oddly,true", "y,false", "oddy,false" })
    void startsWithExamples(String s, Boolean expected) {
        assertThat(EndsLy.startsWith(s)).isEqualTo(expected);
    }
}
