/*
 * 3042. Count Prefix and Suffix Pairs I - https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 */
public class CountPrefixAndSuffixPairsI {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
