package com.hackerrank.algorithms.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NimbleGameTest {
    @Test
    void nimbleGameSample1() {
        List<Integer> input = List.of(0, 2, 3, 0, 6);
        String expected = "First";
        String actual = NimbleGame.nimbleGame(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void nimbleGameSample2() {
        List<Integer> input = List.of(0, 0, 0, 0);
        String expected = "Second";
        String actual = NimbleGame.nimbleGame(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}