/*
 * 647. Palindromic Substrings - https://leetcode.com/problems/palindromic-substrings/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromicSubstringsTest {
    private static final PalindromicSubstrings instance = new PalindromicSubstrings();

    @ParameterizedTest
    @CsvSource({ "abc,3", "aaa,6" })
    void examples(String input, int expected) {
        int actual = instance.countSubstrings(input);
        assertThat(actual).isEqualTo(expected);
    }
}
