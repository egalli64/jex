/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExtraFrontTest {
    @ParameterizedTest
    @CsvSource({ "Hello,HeHeHe", "ab,ababab", "H,HHH" })
    void solutionExamples(String input, String expected) {
        assertThat(ExtraFront.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,HeHeHe", "ab,ababab", "H,HHH" })
    void verboseExamples(String input, String expected) {
        assertThat(ExtraFront.verbose(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,HeHeHe", "ab,ababab", "H,HHH" })
    void solutionJ11Examples(String input, String expected) {
        assertThat(ExtraFront.solutionJ11(input)).isEqualTo(expected);
    }
}
