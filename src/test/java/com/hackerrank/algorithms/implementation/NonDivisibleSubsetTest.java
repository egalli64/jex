package com.hackerrank.algorithms.implementation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NonDivisibleSubsetTest {
    @Test
    void nonDivisibleSubsetExample() {
        int divisor = 4;
        List<Integer> input = List.of(19, 10, 12, 10, 24, 25, 22);
        int actual = NonDivisibleSubset.nonDivisibleSubset(divisor, input);
        int expected = 3;
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void nonDivisibleSubsetSample() {
        int divisor = 3;
        List<Integer> input = List.of(1, 7, 2, 4);
        int actual = NonDivisibleSubset.nonDivisibleSubset(divisor, input);
        int expected = 3;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}