/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpecialElevenTest {
    @ParameterizedTest
    @CsvSource({ "22,true", "23,true", "24,false" })
    void solutionExamples(int input, boolean expected) {
        assertThat(SpecialEleven.solution(input)).isEqualTo(expected);
    }
}
