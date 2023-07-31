/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzStringTest {
    @ParameterizedTest
    @CsvSource({ "fig,Fizz", "dib,Buzz", "fib,FizzBuzz" })
    void solutionExamples(String input, String expected) {
        assertThat(FizzString.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "fig,Fizz", "dib,Buzz", "fib,FizzBuzz" })
    void compactExamples(String input, String expected) {
        assertThat(FizzString.compact(input)).isEqualTo(expected);
    }
}
