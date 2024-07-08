/*
 * 1. Two Sum - https://leetcode.com/problems/two-sum/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer target, return indices of the two
 * _distinct_ elements such that they add up to target
 * 
 * There is exactly one solution.
 * 
 * No assumption on the order of returned indices
 */
public class TwoSum {
    /**
     * Classic imperative approach
     * 
     * @param nums   the array of integers
     * @param target look for this target
     * @return indices found, or an empty array
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    /**
     * Caching in a map the values
     * 
     * @param nums   the array of integers
     * @param target look for this target
     * @return indices found, or an empty array
     */
    public int[] linear(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer other = target - nums[i];
            if (cache.containsKey(other)) {
                return new int[] { i, cache.get(other) };
            } else {
                cache.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
