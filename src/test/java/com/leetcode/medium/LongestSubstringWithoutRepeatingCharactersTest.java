/*
 * LeetCode 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LongestSubstringWithoutRepeatingCharactersTest {
    private static final LongestSubstringWithoutRepeatingCharacters instance = new LongestSubstringWithoutRepeatingCharacters();

    @ParameterizedTest
    @CsvSource({ "abcabcbb,3", "bbbbb,1", "pwwkew,3", "dvdf,3", "aabaab!bb,3", "umvejcuuk,6" })
    void countSubstringsExamples(String input, int expected) {
        int actual = instance.lengthOfLongestSubstring(input);
        assertThat(actual).isEqualTo(expected);
    }
}
