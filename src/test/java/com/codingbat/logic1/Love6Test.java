/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Love6Test {
    @ParameterizedTest
    @CsvSource({ "6,4,true", "4,5,false", "1,5,true" })
    void solutionExamples(int first, int second, boolean expected) {
        assertThat(Love6.solution(first, second)).isEqualTo(expected);
    }
}
