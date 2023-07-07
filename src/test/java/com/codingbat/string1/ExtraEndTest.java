/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExtraEndTest {
    @ParameterizedTest
    @CsvSource({ "Hello,lololo", "ab,ababab", "Hi,HiHiHi" })
    void solutionExamples(String input, String expected) {
        assertThat(ExtraEnd.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,lololo", "ab,ababab", "Hi,HiHiHi" })
    void solution11Examples(String input, String expected) {
        assertThat(ExtraEnd.solution11(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,lololo", "ab,ababab", "Hi,HiHiHi" })
    void builderExamples(String input, String expected) {
        assertThat(ExtraEnd.builder(input)).isEqualTo(expected);
    }
}
