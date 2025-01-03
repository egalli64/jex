/*
 * 2270. Number of Ways to Split Array - https://leetcode.com/problems/number-of-ways-to-split-array/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given an array, split it in all the possible way, so that both left and right
 * are not empty, and count the ones where left is greater or equal to right
 */
public class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long right = 0;
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        long left = nums[0];

        int result = left < right ? 0 : 1;
        for (int i = 1; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i];
            if (left >= right) {
                result += 1;
            }
        }

        return result;
    }
}
