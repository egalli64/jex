/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BlackjackTest {
    @ParameterizedTest
    @CsvSource({ "19,21,21", "21,19,21", "19,22,19" })
    void solutionExamples(int first, int second, int expected) {
        assertThat(Blackjack.solution(first, second)).isEqualTo(expected);
    }
}
