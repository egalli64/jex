/*
 * 2185. Counting Words With a Given Prefix - https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an array of strings, return the number of strings that contain the
 * given prefix
 */
public class CountingWordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int result = 0;

        for (String word : words) {
            if (word.startsWith(pref)) {
                result += 1;
            }
        }

        return result;
    }
}
