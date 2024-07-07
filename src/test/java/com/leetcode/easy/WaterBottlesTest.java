/*
 * 1518. Water Bottles - https://leetcode.com/problems/water-bottles/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WaterBottlesTest {
    private static final WaterBottles instance = new WaterBottles();

    @ParameterizedTest
    @CsvSource({ "9,3,13", "15,4,19" })
    void examples(int n, int lot, int expected) {
        assertThat(instance.numWaterBottles(n, lot)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "9,3,13", "15,4,19" })
    void examplesFaster(int n, int lot, int expected) {
        assertThat(instance.faster(n, lot)).isEqualTo(expected);
    }
}
