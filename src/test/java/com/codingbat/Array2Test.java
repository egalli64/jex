package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Array2Test {
    @Test
    void fizzBuzzExample1() {
        int begin = 1;
        int end = 6;
        String[] expected = { "1", "2", "Fizz", "4", "Buzz" };
        assertThat(Array2.fizzBuzz(begin, end)).isEqualTo(expected);
    }

}