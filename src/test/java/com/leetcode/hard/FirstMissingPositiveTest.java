/*
 * 41. First Missing Positive - https://leetcode.com/problems/first-missing-positive/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FirstMissingPositiveTest {
    private static final FirstMissingPositive instance = new FirstMissingPositive();

    @Test
    void test1() {
        assertThat(instance.firstMissingPositive(new int[] { 1, 2, 0 })).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(instance.firstMissingPositive(new int[] { 1 })).isEqualTo(2);
    }
}
