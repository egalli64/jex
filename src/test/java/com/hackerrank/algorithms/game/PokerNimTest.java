package com.hackerrank.algorithms.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PokerNimTest {
    @Test
    void pokerNimSample1() {
        int maxAdd = 5;
        List<Integer> piles = List.of(1, 2);
        String expected = "First";
        String actual = PokerNim.pokerNim(maxAdd, piles);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void pokerNimSample2() {
        int maxAdd = 5;
        List<Integer> piles = List.of(2, 1, 3);
        String expected = "Second";
        String actual = PokerNim.pokerNim(maxAdd, piles);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}