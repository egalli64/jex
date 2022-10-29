package com.codingbat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Recursion2Test {
    @Test
    void groupSumExample1() {
        int[] values = {2, 4, 8};
        int target = 10;
        assertThat(Recursion2.groupSum(0, values, target)).isTrue();
    }

    @Test
    void groupSumExample2() {
        int[] values = {2, 4, 8};
        int target = 14;
        assertThat(Recursion2.groupSum(0, values, target)).isTrue();
    }

    @Test
    void groupSumExample3() {
        int[] values = {2, 4, 8};
        int target = 9;
        assertThat(Recursion2.groupSum(0, values, target)).isFalse();
    }

    @Test
    void groupSumNegative() {
        int[] values = {-2, 5, 8};
        int target = 6;
        assertThat(Recursion2.groupSum(0, values, target)).isTrue();
    }

    @Test
    void groupSum5Example1() {
        int[] values = {2, 5, 10, 4};
        int target = 19;
        assertThat(Recursion2.groupSum5(0, values, target)).isTrue();
    }

    @Test
    void groupSum5Example2() {
        int[] values = {2, 5, 10, 4};
        int target = 17;
        assertThat(Recursion2.groupSum5(0, values, target)).isTrue();
    }

    @Test
    void groupSum5Example3() {
        int[] values = {2, 5, 10, 4};
        int target = 12;
        assertThat(Recursion2.groupSum5(0, values, target)).isFalse();
    }

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
    void groupSum6Example1() {
        int[] values = {5, 6, 2};
        int target = 8;
        assertThat(Recursion2.groupSum6(0, values, target)).isTrue();
    }

    @Test
    void groupNoAdjExample1() {
        int[] values = {2, 5, 10, 4};
        int target = 12;
        assertThat(Recursion2.groupNoAdj(0, values, target)).isTrue();
    }

    @Test
    void groupSumClumpExample1() {
        int[] values = {2, 4, 8};
        int target = 10;
        assertThat(Recursion2.groupSumClump(0, values, target)).isTrue();
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