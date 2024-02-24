/*
 * 9. Palindrome Number - https://leetcode.com/problems/palindrome-number/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromeNumberTest {
    private static final PalindromeNumber instance = new PalindromeNumber();

    @ParameterizedTest
    @CsvSource({ "121,true", "-12,false", "10,false" })
    void isPalindromeExamples(int input, boolean expected) {
        boolean actual = instance.isPalindrome(input);
        assertThat(actual).isEqualTo(expected);
    }
}
