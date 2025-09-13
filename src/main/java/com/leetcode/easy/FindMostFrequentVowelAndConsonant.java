/*
 * 3541. Find Most Frequent Vowel and Consonant - https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Calculate the sum of most frequent vowel and consonant.
 * Only characters in ['a'...'z'] are allowed
 */
public class FindMostFrequentVowelAndConsonant {
    static final int ALPHA_SIZE = 'z' - 'a' + 1;

    public int maxFreqSum(String s) {
        int[] frequencies = new int[ALPHA_SIZE];
        for (char c : s.toCharArray()) {
            frequencies[c - 'a'] += 1;
        }

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < ALPHA_SIZE; i++) {
            if (i == 0 || i == 'e' - 'a' || i == 'i' - 'a' || i == 'o' - 'a' || i == 'u' - 'a') {
                vowelCount = Math.max(vowelCount, frequencies[i]);
            } else {
                consonantCount = Math.max(consonantCount, frequencies[i]);
            }
        }

        return vowelCount + consonantCount;
    }
}
