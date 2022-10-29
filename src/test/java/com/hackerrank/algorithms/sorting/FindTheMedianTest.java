package com.hackerrank.algorithms.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FindTheMedianTest {
    @Test
    void findMedianSample() {
        List<Integer> input = Arrays.asList(0, 1, 2, 4, 6, 5, 3);
        int expected = 3;
        int actual = FindTheMedian.findMedian(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}