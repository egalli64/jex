package com.hackerrank.algorithms.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CountingSort2Test {
    @Test
    void countingSortExample() {
        List<Integer> input = List.of(1, 1, 3, 2, 1);
        List<Integer> expected = List.of(1, 1, 1, 2, 3);
        List<Integer> actual = CountingSort2.countingSort(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}