/*
 * 2016. Maximum Difference Between Increasing Elements - https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Return the max difference between elements in the passed array, where the
 * lower value has index less than the higher value. Return -1 if there is not
 * such a couple of elements.
 */
public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int result = -1;

        for (int i = 1; i < nums.length; i++) {
            int delta = nums[i] - min;

            if (delta > 0 && delta > result) {
                result = delta;
            }

            min = Math.min(nums[i], min);
        }

        return result;
    }
}
