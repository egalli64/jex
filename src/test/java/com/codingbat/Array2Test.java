package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Array2Test {
    @Test
    void withoutTenExample1() {
        int[] input = { 1, 10, 10, 2 };
        int[] expected = { 1, 2, 0, 0 };
        assertThat(Array2.withoutTen(input)).isEqualTo(expected);
    }

    @Test
    void zeroMaxExample1() {
        int[] input = { 0, 5, 0, 3 };
        int[] expected = { 5, 5, 3, 3 };
        assertThat(Array2.zeroMax(input)).isEqualTo(expected);
    }

    @Test
    void evenOddExample1() {
        int[] input = { 1, 0, 1, 0, 0, 1, 1 };
        int[] expected = { 0, 0, 0, 1, 1, 1, 1 };
        assertThat(Array2.evenOdd(input)).isEqualTo(expected);
    }

    @Test
    void fizzBuzzExample1() {
        int begin = 1;
        int end = 6;
        String[] expected = { "1", "2", "Fizz", "4", "Buzz" };
        assertThat(Array2.fizzBuzz(begin, end)).isEqualTo(expected);
    }

}