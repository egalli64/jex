/*
 * 1614. Maximum Nesting Depth of the Parentheses - https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MaximumNestingDepthOfParenthesesTest {
    private static final MaximumNestingDepthOfParentheses instance = new MaximumNestingDepthOfParentheses();

    @ParameterizedTest
    @CsvSource({ "(1+(2*3)+((8)/4))+1,3", "(1)+((2))+(((3))),3" })
    void examples(String input, int expected) {
        assertThat(instance.maxDepth(input)).isEqualTo(expected);
    }
}
