/*
 * 32. Longest Valid Parentheses - https://leetcode.com/problems/longest-valid-parentheses/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LongestValidParenthesesTest {
    private static final LongestValidParentheses instance = new LongestValidParentheses();

    @ParameterizedTest
    @CsvSource({ "((),2", ")()()),4", "'',0", "(),2" })
    void examples(String input, int expected) {
        int actual = instance.longestValidParentheses(input);
        assertThat(actual).isEqualTo(expected);
    }
}
