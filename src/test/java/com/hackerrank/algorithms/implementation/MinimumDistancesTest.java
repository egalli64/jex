package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumDistancesTest {
    @Test
    void minimumDistancesSimple() {
        List<Integer> input = List.of(3, 2, 1, 2, 3);
        int actual = MinimumDistances.minimumDistances(input);
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void minimumDistancesSample() {
        List<Integer> input = List.of(7, 1, 3, 4, 1, 7);
        int actual = MinimumDistances.minimumDistances(input);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void minimumDistancesNoCouple() {
        List<Integer> input = List.of(7, 1, 3, 4, 5, 6);
        int actual = MinimumDistances.minimumDistances(input);
        int expected = -1;
        assertThat(actual).isEqualTo(expected);
    }
}