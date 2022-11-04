package com.hackerrank.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BeautifulPairsTest {
    @Test
    void beautifulPairsSample0() {
        List<Integer> left = List.of(1, 2, 3, 4);
        List<Integer> right = List.of(1, 2, 3, 3);
        int expected = 4;
        int actual = BeautifulPairs.beautifulPairs(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void beautifulPairsSample1() {
        List<Integer> left = List.of(3, 5, 7, 11, 5, 8);
        List<Integer> right = List.of(5, 7, 11, 10, 5, 8);
        int expected = 6;
        int actual = BeautifulPairs.beautifulPairs(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}