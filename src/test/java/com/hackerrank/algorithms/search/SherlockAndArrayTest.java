package com.hackerrank.algorithms.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SherlockAndArrayTest {
    @Test
    void balancedSumsSample0() {
        List<Integer> input = List.of(1, 2, 3);
        String expected = "NO";
        String actual = SherlockAndArray.balancedSums(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void balancedSumsSample1() {
        List<Integer> input = List.of(1, 2, 3, 3);
        String expected = "YES";
        String actual = SherlockAndArray.balancedSums(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}