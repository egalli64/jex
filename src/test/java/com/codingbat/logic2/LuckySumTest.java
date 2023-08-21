/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LuckySumTest {
    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 6", "1, 2, 13, 3", "1, 13, 3, 1" })
    void solutionExamples(int first, int second, int third, int expected) {
        assertThat(LuckySum.solution(first, second, third)).isEqualTo(expected);
    }
}
