/*
 * 3541. Find Most Frequent Vowel and Consonant - https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FindMostFrequentVowelAndConsonantTest {
    private static final FindMostFrequentVowelAndConsonant instance = new FindMostFrequentVowelAndConsonant();

    @ParameterizedTest
    @CsvSource({"successes,6", "aeiaeia,3"})
    void examples(String input, int expected) {
        assertThat(instance.maxFreqSum(input)).isEqualTo(expected);
    }
}