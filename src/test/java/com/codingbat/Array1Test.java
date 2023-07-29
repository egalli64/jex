package com.codingbat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array1Test {
    @Test
    void front11Example1() {
        int[] first = { 1, 2, 3 };
        int[] second = { 7, 9, 8 };
        int[] expected = { 1, 7 };
        assertThat(Array1.front11(first, second)).isEqualTo(expected);
    }
}