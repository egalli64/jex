package com.hackerrank.algorithms.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CountingSort1Test {

    @Test
    void countingSortExample() {
        List<Integer> input = List.of(1, 1, 3, 2, 1);
        Integer[] expectedHeader = {0, 3, 1, 1};
        List<Integer> actual = CountingSort1.countingSort(input);
        Assertions.assertThat(actual).hasSize(100);
        Assertions.assertThat(actual).startsWith(expectedHeader);
    }
}