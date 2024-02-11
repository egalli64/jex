/*
 * LeetCode 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LongestPalindromicSubstringTest {
    private static final LongestPalindromicSubstring instance = new LongestPalindromicSubstring();

    @ParameterizedTest
    @CsvSource({ "babad,bab", "cbbd,bb", "a,a", "aa,aa", "aacabdkacaa,aca" })
    void longestPalindromeExamples(String input, String expected) {
        String actual = instance.longestPalindrome(input);
        assertThat(actual).isEqualTo(expected);
    }
}
