/*
 * 20. Valid Parentheses - https://leetcode.com/problems/valid-parentheses/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidParenthesesTest {
    private static final ValidParentheses instance = new ValidParentheses();

    @ParameterizedTest
    @CsvSource({ "(),true", "()[]{},true", "(],false" })
    void examples(String input, boolean expected) {
        boolean actual = instance.isValid(input);
        assertThat(actual).isEqualTo(expected);
    }
    
    @ParameterizedTest
    @CsvSource({ "'',true", "(,false", "],false" })
    void basic(String input, boolean expected) {
        boolean actual = instance.isValid(input);
        assertThat(actual).isEqualTo(expected);        
    }
}
