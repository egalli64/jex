package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ServiceLaneTest {
    @Test
    void serviceLaneExample() {
        List<List<Integer>> cases = List.of(List.of(0, 1), List.of(1, 3));
        List<Integer> width = List.of(2, 3, 2, 1);
        List<Integer> actual = ServiceLane.serviceLane(cases, width);
        List<Integer> expected = List.of(2, 1);
        assertThat(actual).hasSameSizeAs(expected).hasSameElementsAs(expected);
    }

    @Test
    void serviceLaneSample0() {
        List<List<Integer>> cases = List.of(List.of(0, 3), List.of(4, 6), List.of(6, 7), List.of(3, 5), List.of(0, 7));
        List<Integer> width = List.of(2, 3, 1, 2, 3, 2, 3, 3);
        List<Integer> actual = ServiceLane.serviceLane(cases, width);
        List<Integer> expected = List.of(1, 2, 3, 2, 1);
        assertThat(actual).hasSameSizeAs(expected).hasSameElementsAs(expected);
    }

}