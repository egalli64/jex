/*
 * 1930. Unique Length-3 Palindromic Subsequences - https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UniqueLength3PalindromicSubsequencesTest {
    private static final UniqueLength3PalindromicSubsequences instance = new UniqueLength3PalindromicSubsequences();

    @ParameterizedTest
    @CsvSource({ "aabca,3", "adc,0", "bbcbaba,4" })
    void examples(String input, int expected) {
        int actual = instance.countPalindromicSubsequence(input);
        assertThat(actual).isEqualTo(expected);
    }
}
