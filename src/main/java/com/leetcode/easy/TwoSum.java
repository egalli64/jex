/*
 * https://leetcode.com/problems/two-sum/description/
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

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
}
