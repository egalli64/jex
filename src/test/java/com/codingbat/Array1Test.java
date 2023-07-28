package com.codingbat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array1Test {
    @Test
    void unlucky1Example1() {
        int[] input = { 1, 3, 4, 5 };
        assertThat(Array1.unlucky1(input)).isTrue();
    }

    @Test
    void maxTripleExample1() {
        int[] input = { 1, 2, 3 };
        int expected = 3;
        assertThat(Array1.maxTriple(input)).isEqualTo(expected);
    }

    @Test
    void frontPieceExample1() {
        int[] input = { 1, 2, 3 };
        int[] expected = { 1, 2 };
        assertThat(Array1.frontPiece(input)).isEqualTo(expected);
    }

    @Test
    void make2Example1() {
        int[] first = { 4, 5 };
        int[] second = { 1, 2, 3 };
        int[] expected = { 4, 5 };
        assertThat(Array1.make2(first, second)).isEqualTo(expected);
    }

    @Test
    void front11Example1() {
        int[] first = { 1, 2, 3 };
        int[] second = { 7, 9, 8 };
        int[] expected = { 1, 7 };
        assertThat(Array1.front11(first, second)).isEqualTo(expected);
    }
}