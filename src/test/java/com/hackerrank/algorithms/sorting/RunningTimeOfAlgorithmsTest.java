package com.hackerrank.algorithms.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RunningTimeOfAlgorithmsTest {
    @Test
    void runningTimeSample() {
        List<Integer> input = Arrays.asList(2, 1, 3, 1, 2);
        int expected = 4;
        int actual = RunningTimeOfAlgorithms.runningTime(input);

        assertThat(actual).isEqualTo(expected);
    }
}