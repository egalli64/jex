/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DividesSelfTest {
    @ParameterizedTest
    @CsvSource({ "128,true", "12,true", "120,false" })
    void dividesSelfExamples(int number, boolean expected) {
        assertThat(DividesSelf.solution(number)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "128,true", "12,true", "120,false" })
    void alternativeExamples(int number, boolean expected) {
        assertThat(DividesSelf.alternative(number)).isEqualTo(expected);
    }
}
