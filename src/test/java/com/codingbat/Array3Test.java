package com.codingbat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array3Test {
    @Test
    void canBalanceExample1() {
        int[] input = { 1, 1, 1, 2, 1 };
        assertThat(Array3.canBalance(input)).isTrue();
    }

    @Test
    void canBalanceExample2() {
        int[] input = { 2, 1, 1, 2, 1 };
        assertThat(Array3.canBalance(input)).isFalse();
    }

    @Test
    void canBalanceExample3() {
        int[] input = { 10, 10 };
        assertThat(Array3.canBalance(input)).isTrue();
    }

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
    void linearInExample1() {
        int[] outer = { 1, 2, 4, 6 };
        int[] inner = { 2, 4 };
        assertThat(Array3.linearIn(outer, inner)).isTrue();
    }

    @Test
    void maxMirrorExample1() {
        int[] input = { 1, 2, 3, 8, 9, 3, 2, 1 };
        int expected = 3;
        assertThat(Array3.maxMirror(input)).isEqualTo(expected);
    }

    @Test
    void fix45Example1() {
        int[] input = { 5, 4, 9, 4, 9, 5 };
        int[] expected = { 9, 4, 5, 4, 5, 9 };
        assertThat(Array3.fix45(input)).isEqualTo(expected);
    }

    @Test
    void fix45FiveOverlap() {
        int[] input = { 5, 4, 5, 4, 1 };
        int[] expected = { 1, 4, 5, 4, 5 };
        assertThat(Array3.fix45(input)).isEqualTo(expected);
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