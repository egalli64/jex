/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TeaPartyTest {
    @ParameterizedTest
    @CsvSource({ "6,8,1", "3,8,0", "20,6,2" })
    void solutionExamples(int tea, int candy, int expected) {
        assertThat(TeaParty.solution(tea, candy)).isEqualTo(expected);
    }
}
