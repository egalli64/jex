package com.codingbat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array3Test {
    @Test
    void seriesUpExample1() {
        int input = 3;
        int[] expected = { 1, 1, 2, 1, 2, 3 };
        assertThat(Array3.seriesUp(input)).containsExactly(expected);
    }

    @Test
    void seriesUpExample2() {
        int input = 4;
        int[] expected = { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4 };
        assertThat(Array3.seriesUp(input)).containsExactly(expected);
    }

    @Test
    void seriesUpExample3() {
        int input = 2;
        int[] expected = { 1, 1, 2 };
        assertThat(Array3.seriesUp(input)).containsExactly(expected);
    }

    @Test
    void maxMirrorExample1() {
        int[] input = { 1, 2, 3, 8, 9, 3, 2, 1 };
        int expected = 3;
        assertThat(Array3.maxMirror(input)).isEqualTo(expected);
    }

    @Test
    void squareUpExample1() {
        int input = 3;
        int[] expected = { 0, 0, 1, 0, 2, 1, 3, 2, 1 };
        assertThat(Array3.squareUp(input)).containsExactly(expected);
    }

    @Test
    void countClumpsExample1() {
        int[] input = { 1, 2, 2, 3, 4, 4 };
        int expected = 2;
        assertThat(Array3.countClumps(input)).isEqualTo(expected);
    }
}