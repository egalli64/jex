/*
 * 2116. Check if a Parentheses String Can Be Valid - https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckIfParenthesesStringCanBeValidTest {
    private static final CheckIfParenthesesStringCanBeValid instance = new CheckIfParenthesesStringCanBeValid();

    @ParameterizedTest
    @CsvSource({ "))())),010100,true", "()(),0000,true", "),0,false" })
    void examples(String input, String locks, boolean expected) {
        assertThat(instance.canBeValid(input, locks)).isEqualTo(expected);
    }
}
