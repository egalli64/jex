/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GreenTicketTest {
    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 0", "2, 2, 2, 20", "1, 1, 2, 10" })
    void solutionExamples(int a, int b, int c, int expected) {
        assertThat(GreenTicket.solution(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 0", "2, 2, 2, 20", "1, 1, 2, 10" })
    void alternativeExamples(int a, int b, int c, int expected) {
        assertThat(GreenTicket.alternative(a, b, c)).isEqualTo(expected);
    }
}
