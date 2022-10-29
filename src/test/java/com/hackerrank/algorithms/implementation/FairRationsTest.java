package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FairRationsTest {
    @Test
    void fairRationsSample0() {
        List<Integer> input = List.of(2, 3, 4, 5, 6);
        String actual = FairRations.fairRations(input);
        String expected = "4";
        assertThat(actual).isEqualTo(expected);
    }
}