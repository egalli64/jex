/*
 * 2529. Maximum Count of Positive Integer and Negative Integer - https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a sorted array with duplicated values, return the max count between
 * positive and negative values.
 */
public class MaximumCountPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int negativeCount = firstNonNegativePos(nums);
        int positiveCount = nums.length - firstPositivePos(nums);

        return Math.max(negativeCount, positiveCount);
    }

    private int firstNonNegativePos(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int result = nums.length;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] < 0) {
                left = middle + 1;
            } else if (nums[middle] >= 0) {
                right = middle - 1;
                result = middle;
            }
        }

        return result;
    }

    private int firstPositivePos(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int result = nums.length;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] <= 0) {
                left = middle + 1;
            } else if (nums[middle] > 0) {
                right = middle - 1;
                result = middle;
            }
        }

        return result;
    }
}
