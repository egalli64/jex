package com.hackerrank.algorithms.implementation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ManasaAndStonesTest {
    @Test
    void stonesSample0() {
        int n = 3;
        int a = 1;
        int b = 2;
        List<Integer> expected = List.of(2, 3, 4);
        List<Integer> actual = ManasaAndStones.stones(n, a, b);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void sortingStonesSample0() {
        int n = 3;
        int a = 1;
        int b = 2;
        List<Integer> expected = List.of(2, 3, 4);
        List<Integer> actual = ManasaAndStones.sortingStones(n, a, b);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test
    void recursiveStonesSample0() {
        int n = 3;
        int a = 1;
        int b = 2;
        List<Integer> expected = List.of(2, 3, 4);
        List<Integer> actual = ManasaAndStones.recursiveStones(n, a, b);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}