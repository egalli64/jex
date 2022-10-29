package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HalloweenSaleTest {
    @Test
    void howManyGamesExample() {
        int basePrice = 20;
        int discount = 3;
        int minimum = 6;
        int budget = 70;

        int actual = HalloweenSale.howManyGames(basePrice, discount, minimum, budget);
        int expected = 5;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void howManyGamesSample1() {
        int basePrice = 20;
        int discount = 3;
        int minimum = 6;
        int budget = 85;

        int actual = HalloweenSale.howManyGames(basePrice, discount, minimum, budget);
        int expected = 7;
        assertThat(actual).isEqualTo(expected);
    }
}