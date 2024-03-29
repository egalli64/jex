/*
 * 2962. Count Subarrays Where Max Element Appears at Least K Times - https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given an integer array, return the number of subarrays having the maximum
 * array element at least k times in it, where k is in [1 .. 100_000]
 */
public class CountSubarraysMaxElementKPlusTimes {
    /**
     * Find the max
     * 
     * @param xs an array
     * @return it max value
     */
    private int max(int[] xs) {
        int result = 0;
        for (int x : xs) {
            result = Math.max(result, x);
        }
        return result;
    }

    /**
     * Count the subarrays
     * 
     * @param nums an array
     * @param k    the target
     * @return the count
     */
    public long countSubarrays(int[] nums, int k) {
        int max = max(nums);
        long result = 0;

        for (int left = 0, right = 0, count = 0; right < nums.length; right++) {
            if (nums[right] == max) {
                count += 1;
            }

            while (count >= k) {
                result += nums.length - right;
                if (nums[left] == max)
                    count -= 1;
                left += 1;
            }
        }

        return result;
    }
}
