/*
 * 594. Longest Harmonious Subsequence - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Say that a sequence is defined harmonious if the difference between is
 * maximum and minimum value is exactly 1.
 * <p>
 * Given as input an integer array, return the length of of its longest
 * harmonious subsequence (meaning: get rid of any element you like)
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        int result = 0;

        for (int cur : counter.keySet()) {
            if (counter.containsKey(cur + 1)) {
                result = Math.max(result, counter.get(cur) + counter.get(cur + 1));
            }
        }

        return result;
    }
}
