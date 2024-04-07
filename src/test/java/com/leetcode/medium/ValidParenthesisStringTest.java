/*
 * 678. Valid Parenthesis String - https://leetcode.com/problems/valid-parenthesis-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidParenthesisStringTest {
    private static final ValidParenthesisString instance = new ValidParenthesisString();

    @ParameterizedTest
    @CsvSource({ "(),true", "(*),true", "(*)),true" })
    void examples(String input, boolean expected) {
        boolean actual = instance.checkValidString(input);
        assertThat(actual).isEqualTo(expected);
    }
}
