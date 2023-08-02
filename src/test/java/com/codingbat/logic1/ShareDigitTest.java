/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ShareDigitTest {
    @ParameterizedTest
    @CsvSource({ "12, 23, true", "12, 43, false", "12, 44, false" })
    void solutionExamples(int first, int second, boolean expected) {
        assertThat(ShareDigit.solution(first, second)).isEqualTo(expected);
    }
}
