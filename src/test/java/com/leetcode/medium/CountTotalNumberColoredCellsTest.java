/*
 * 1780. Check if Number is a Sum of Powers of Three - https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountTotalNumberColoredCellsTest {
    private static final CountTotalNumberColoredCells instance = new CountTotalNumberColoredCells();

    @ParameterizedTest
    @CsvSource({ "1,1", "2,5", "3,13", "10_000, 199_980_001" })
    void examples(int input, long expected) {
        assertThat(instance.coloredCells(input)).isEqualTo(expected);
    }
}
