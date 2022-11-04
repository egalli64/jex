package com.hackerrank.algorithms.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntroductionToNimGameTest {
    @Test
    void nimGameSample1() {
        List<Integer> piles = List.of(1, 1);
        String actual = IntroductionToNimGame.nimGame(piles);
        String expected = "Second";
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void nimGameSample2() {
        List<Integer> piles = List.of(2, 1, 4);
        String actual = IntroductionToNimGame.nimGame(piles);
        String expected = "First";
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}