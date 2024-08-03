/*
 * 1460. Make Two Arrays Equal by Reversing Subarrays - https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two equally sized arrays, check if they contains the same elements.
 */
public class MakeTwoArraysEqualByReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>(target.length);

        for (int cur : target) {
            counter.put(cur, counter.getOrDefault(cur, 0) + 1);
        }

        for (int cur : arr) {
            counter.put(cur, counter.getOrDefault(cur, 0) - 1);
        }

        return counter.values().stream().allMatch(x -> x == 0);
    }
}
