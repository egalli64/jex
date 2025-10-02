/*
 * 3100. Water Bottles II - https://leetcode.com/problems/water-bottles-ii/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class WaterBottlesIITest {
    private static final WaterBottlesII instance = new WaterBottlesII();

    @ParameterizedTest
    @CsvSource({"13,6,15", "10,3,13"})
    void examples(int nBottles, int nExchange, int expected) {
        var actual = instance.maxBottlesDrunk(nBottles, nExchange);
        assertThat(actual).isEqualTo(expected);
    }
}