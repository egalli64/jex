package com.codingbat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array3Test {
    @Test
    void countClumpsExample1() {
        int[] input = { 1, 2, 2, 3, 4, 4 };
        int expected = 2;
        assertThat(Array3.countClumps(input)).isEqualTo(expected);
    }
}