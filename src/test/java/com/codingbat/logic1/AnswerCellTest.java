/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AnswerCellTest {
    @ParameterizedTest
    @CsvSource({ "false, false, false, true", "false, false, true, false", "true, false, false, false" })
    void solutionExamples(boolean am, boolean mom, boolean sleep, boolean expected) {
        assertThat(AnswerCell.solution(am, mom, sleep)).isEqualTo(expected);
    }
}
