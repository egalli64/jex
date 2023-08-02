/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BlueTicketTest {
    @ParameterizedTest
    @CsvSource({ "9, 1, 0, 10", "9, 2, 0, 0", "6, 1, 4, 10" })
    void solutionExamples(int a, int b, int c, int expected) {
        assertThat(BlueTicket.solution(a, b, c)).isEqualTo(expected);
    }
}
