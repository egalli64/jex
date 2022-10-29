package com.hackerrank.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PriyankaAndToysTest {
    @Test
    void toysSample() {
        List<Integer> input = Arrays.asList(1, 2, 3, 21, 7, 12, 14, 21);
        int actual = PriyankaAndToys.toys(input);
        Assertions.assertThat(actual).isEqualTo(4);
    }
}