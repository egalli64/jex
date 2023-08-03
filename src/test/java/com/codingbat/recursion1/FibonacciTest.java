/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciTest {
    @ParameterizedTest
    @CsvSource({ "0,0", "1,1", "2,1" })
    void fibonacciExamples(int input, int expected) {
        assertThat(Fibonacci.fibonacci(input)).isEqualTo(expected);
    }
}
