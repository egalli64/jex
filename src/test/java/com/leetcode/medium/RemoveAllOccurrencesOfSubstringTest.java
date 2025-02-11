/*
 * 1910. Remove All Occurrences of a Substring - https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RemoveAllOccurrencesOfSubstringTest {
    private static final RemoveAllOccurrencesOfSubstring instance = new RemoveAllOccurrencesOfSubstring();

    @ParameterizedTest
    @CsvSource({ "abc,abc,''","daabcbaabcbc,abc,dab", "axxxxyyyyb,xy,ab" })
    void examples(String input, String target, String expected) {
        assertThat(instance.removeOccurrences(input, target)).isEqualTo(expected);
    }
}
