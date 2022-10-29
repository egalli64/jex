package com.hackerrank.algorithms.bit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LonelyIntegerTest {
    @Test
    void lonelyIntegerExample() {
        List<Integer> input = List.of(1, 2, 3, 4, 3, 2, 1);
        int expected = 4;
        int actual = LonelyInteger.lonelyInteger(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void lonelyIntegerExampleXor() {
        List<Integer> input = List.of(1, 2, 3, 4, 3, 2, 1);
        int expected = 4;
        int actual = LonelyInteger.lonelyIntegerXor(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}