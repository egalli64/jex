/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzString2Test {
    @ParameterizedTest
    @CsvSource({ "1,1!", "2,2!", "3,Fizz!" })
    void solutionExamples(int input, String expected) {
        assertThat(FizzString2.solution(input)).isEqualTo(expected);
    }
}
