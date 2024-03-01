/*
 * 70. Climbing Stairs - https://leetcode.com/problems/climbing-stairs/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ClimbingStairsTest {
    private static final ClimbingStairs instance = new ClimbingStairs();

    @ParameterizedTest
    @CsvSource({ "2,2", "3,3" })
    void examples(int input, int expected) {
        assertThat(instance.climbStairs(input)).isEqualTo(expected);
    }
}
