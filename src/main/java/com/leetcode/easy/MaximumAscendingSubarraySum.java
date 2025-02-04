/*
 * 1800. Maximum Ascending Subarray Sum - https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an int array, determine its strictly ascending subsequence having the
 * largest sum and return it (the sum)
 * <p>
 * Constraints: the array is not empty, and contains few small positive values
 */
public class MaximumAscendingSubarraySum {
    /**
     * Keep the previously found max and the current subsequence partial sum. Go on
     * increasing the partial sum until the subsequence terminates, in that case
     * reset the two buffers. In the end compare the previous max with the current
     * one to get the result.
     * 
     * @param nums the input array
     * @return the subsequence sum
     */
    public int maxAscendingSum(int[] nums) {
        int result = nums[0];
        int current = result;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                current += nums[i];
            } else {
                result = Math.max(result, current);
                current = nums[i];
            }
        }

        return Math.max(result, current);
    }
}
