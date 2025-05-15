/*
 * 2900. Longest Unequal Adjacent Groups Subsequence I - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty string array, where each item is in a group specified by
 * the companion int array, generate the longest list containing strings of
 * alternating groups.
 */
public class LongestUnequalAdjacentGroupsSubsequenceI {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();

        result.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (groups[i] != groups[i - 1]) {
                result.add(words[i]);
            }
        }

        return result;
    }
}
