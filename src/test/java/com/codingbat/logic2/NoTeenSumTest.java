/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NoTeenSumTest {
    @ParameterizedTest
    @CsvSource({ "1,2,3,6", "2,13,1,3", "2,1,14,3" })
    void solutionExamples(int first, int second, int third, int expected) {
        assertThat(NoTeenSum.solution(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1,1", "13,0", "14,0" })
    void fixTeenExamples(int value, int expected) {
        assertThat(NoTeenSum.fixTeen(value)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1,1", "13,0", "14,0" })
    void fixTeenVerboseExamples(int value, int expected) {
        assertThat(NoTeenSum.fixTeenVerbose(value)).isEqualTo(expected);
    }
}
