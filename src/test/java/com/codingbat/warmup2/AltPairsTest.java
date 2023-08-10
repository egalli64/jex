/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AltPairsTest {
    @ParameterizedTest
    @CsvSource({ "kitten,kien", "Chocolate,Chole", "CodingHorror,Congrr" })
    void solutionExamples(String input, String expected) {
        assertThat(AltPairs.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "kitten,kien", "Chocolate,Chole", "CodingHorror,Congrr" })
    void changeStepExamples(String input, String expected) {
        assertThat(AltPairs.changeStep(input)).isEqualTo(expected);
    }
}
