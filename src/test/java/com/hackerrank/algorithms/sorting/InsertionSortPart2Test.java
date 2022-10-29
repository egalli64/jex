package com.hackerrank.algorithms.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InsertionSortPart2Test {
    @Test
    void insertionSort2() {
        List<Integer> data = Arrays.asList(3, 4, 7, 5, 6, 2, 1);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7);

        InsertionSortPart2.insertionSort2(data.size(), data);
        assertThat(data).isEqualTo(expected);
    }
}