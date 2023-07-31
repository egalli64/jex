/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CaughtSpeedingTest {
    @ParameterizedTest
    @CsvSource({ "60,false,0", "65,false,1", "65,true,0" })
    void solutionExamples(int speed, boolean isBirthday, int expected) {
        assertThat(CaughtSpeeding.solution(speed, isBirthday)).isEqualTo(expected);
    }
}
