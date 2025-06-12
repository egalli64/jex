/*
 * 3423. Maximum Difference Between Adjacent Elements in a Circular Array - https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Find the max absolute difference between adjacent elements in an array
 * considered circular
 * <p>
 * Constraint: the array is sized 2+
 */
public class MaximumDifferenceBetweenAdjacentElementsInCircularArray {
    public int maxAdjacentDistance(int[] nums) {
        int result = Math.abs(nums[nums.length - 1] - nums[0]);

        for (int i = 1; i < nums.length; i++) {
            result = Math.max(result, Math.abs(nums[i - 1] - nums[i]));
        }

        return result;
    }
}
