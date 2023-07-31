/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SquirrelPlayTest {
    @ParameterizedTest
    @CsvSource({ "70,false,true", "95,false,false", "95,true,true" })
    void solutionExamples(int temp, boolean summer, boolean expected) {
        assertThat(SquirrelPlay.solution(temp, summer)).isEqualTo(expected);
    }
}
