package com.codingbat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Functional2Test {
    @Test
    void square56Example1() {
        List<Integer> input = new ArrayList<>(List.of(3, 1, 4));
        List<Integer> expected = List.of(19, 11);

        Assertions.assertThat(Functional2.square56(input)).containsExactlyElementsOf(expected);
    }
}