package com.hackerrank.algorithms.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MisereNimTest {
    @Test
    void misereNimSample1() {
        List<Integer> input = List.of(1, 1);
        String actual = MisereNim.misereNim(input);
        String expected = "First";
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void misereNimSample2() {
        List<Integer> input = List.of(2, 1, 3);
        String actual = MisereNim.misereNim(input);
        String expected = "Second";
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void misereNimSample3() {
        List<Integer> input = List.of(9, 8, 4, 4, 4, 7);
        String actual = MisereNim.misereNim(input);
        String expected = "First";
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}