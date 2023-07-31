/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Less20Test {
    @ParameterizedTest
    @CsvSource({ "18,true", "19,true", "20,false" })
    void solutionExamples(int input, boolean expected) {
        assertThat(Less20.solution(input)).isEqualTo(expected);
    }
}
