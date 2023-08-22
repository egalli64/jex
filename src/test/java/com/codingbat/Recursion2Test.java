package com.codingbat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Recursion2Test {
    @Test
    void splitOdd10Example1() {
        int[] values = {5, 5, 5};
        assertThat(Recursion2.splitOdd10(values)).isTrue();
    }

    @Test
    void splitOdd10Example2() {
        int[] values = {5, 5, 6};
        assertThat(Recursion2.splitOdd10(values)).isFalse();
    }

    @Test
    void splitOdd10Example3() {
        int[] values = {5, 5, 6, 1};
        assertThat(Recursion2.splitOdd10(values)).isTrue();
    }

    @Test
    void splitArrayExample1() {
        int[] values = {2, 2};
        assertThat(Recursion2.splitArray(values)).isTrue();
    }

    @Test
    void split53Example1() {
        int[] values = {1, 1};
        assertThat(Recursion2.split53(values)).isTrue();
    }
}