/*
 * 1399. Count Largest Group - https://leetcode.com/problems/count-largest-group/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountLargestGroupTest {
    private static final CountLargestGroup instance = new CountLargestGroup();

    @ParameterizedTest
    @CsvSource({ "13,4", "2,2" })
    void examples(int top, int expected) {
        assertThat(instance.countLargestGroup(top)).isEqualTo(expected);
    }
}
