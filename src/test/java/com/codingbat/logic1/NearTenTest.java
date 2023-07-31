/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NearTenTest {
    @ParameterizedTest
    @CsvSource({ "12,true", "17,false", "19,true" })
    void solutionExamples(int input, boolean expected) {
        assertThat(NearTen.solution(input)).isEqualTo(expected);
    }
}
