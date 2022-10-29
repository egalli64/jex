package com.hackerrank.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class JimAndTheOrdersTest {
    @Test
    void jimOrdersExample() {
        List<List<Integer>> input = List.of(List.of(8, 3), List.of(5, 6), //
                List.of(6, 2), List.of(2, 3), List.of(4, 3));
        List<Integer> expected = List.of(4, 5, 3, 1, 2);
        List<Integer> actual = JimAndTheOrders.jimOrders(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void jimOrdersExampleStream() {
        List<List<Integer>> input = List.of(List.of(8, 3), List.of(5, 6), //
                List.of(6, 2), List.of(2, 3), List.of(4, 3));
        List<Integer> expected = List.of(4, 5, 3, 1, 2);
        List<Integer> actual = JimAndTheOrders.jimOrdersStream(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}