/*
 * 3392. Count Subarrays of Length Three With a Condition - https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Check all the triplets in the given int array, count the ones having the sum
 * of the extremes equals exactly half of the central one
 * <p>
 * Constraint: the array is sized 3+
 */
public class CountSubarraysLengthThreeWithCondition {
    public int countSubarrays(int[] nums) {
        int result = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == (nums[i - 1] + nums[i + 1]) * 2) {
                result += 1;
            }
        }

        return result;
    }
}
