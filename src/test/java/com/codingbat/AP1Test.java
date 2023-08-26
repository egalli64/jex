package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AP1Test {
    @Test
    void commonTwoExample4() {
        String[] left = { "a", "a", "b", "b", "c" };
        String[] right = { "a", "b", "b", "b", "c" };
        int expected = 3;
        assertThat(AP1.commonTwo(left, right)).isEqualTo(expected);
    }
}