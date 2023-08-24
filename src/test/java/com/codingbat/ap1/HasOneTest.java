/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HasOneTest {
    @ParameterizedTest
    @CsvSource({ "10,true", "22,false", "220,false" })
    void solutionExamples(int number, boolean expected) {
        assertThat(HasOne.solution(number)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "10,true", "22,false", "220,false" })
    void alternativeExamples(int number, boolean expected) {
        assertThat(HasOne.alternative(number)).isEqualTo(expected);
    }
}
