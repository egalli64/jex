/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RedTicketTest {
    @ParameterizedTest
    @CsvSource({ "2, 2, 2, 10", "2, 2, 1, 0", "0, 0, 0, 5" })
    void solutionExamples(int a, int b, int c, int expected) {
        assertThat(RedTicket.solution(a, b, c)).isEqualTo(expected);
    }
}
