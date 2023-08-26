package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AP1Test {
    @Test
    void mergeTwoExample1() {
        String[] left = { "a", "c", "z" };
        String[] right = { "b", "f", "z" };
        int n = 3;
        String[] expected = { "a", "b", "c" };
        assertThat(AP1.mergeTwo(left, right, n)).isEqualTo(expected);
    }

    @Test
    void commonTwoExample4() {
        String[] left = { "a", "a", "b", "b", "c" };
        String[] right = { "a", "b", "b", "b", "c" };
        int expected = 3;
        assertThat(AP1.commonTwo(left, right)).isEqualTo(expected);
    }
}