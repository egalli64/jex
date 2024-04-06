/*
 * 1249. Minimum Remove to Make Valid Parentheses - https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinimumRemoveToMakeValidParenthesesTest {
    private static final MinimumRemoveToMakeValidParentheses instance = new MinimumRemoveToMakeValidParentheses();

    @ParameterizedTest
    @CsvSource({ "lee(t(c)o)de),lee(t(c)o)de", "a)b(c)d,ab(c)d", "))((,''" })
    void examples(String input, String expected) {
        String actual = instance.minRemoveToMakeValid(input);
        assertThat(actual).isEqualTo(expected);
    }
}
