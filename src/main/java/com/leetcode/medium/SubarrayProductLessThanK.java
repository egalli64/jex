/*
 * 713. Subarray Product Less Than K - https://leetcode.com/problems/subarray-product-less-than-k/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given an array of integers, return the number of contiguous subarrays where
 * the product of all its elements is strictly less than a given integer
 */
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k < 2) {
            return 0;
        }

        int count = 0;
        for (int left = 0, right = 0, product = 1; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left];
                left += 1;
            }
            count += 1 + (right - left);
        }

        return count;
    }
}
