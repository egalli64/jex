/*
 * 2873. Maximum Value of an Ordered Triplet I - https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Each ordered triplet has a value calculated as (first - second) * third.
 * Return the maximum value among triplets, or zero if there is no positive one.
 * <p>
 * Constraints: there are at least 3 elements in the array, and all of them are
 * positive integers.
 */
public class MaximumValueOrderedTripletI {
    /**
     * Easy O(N^3) solution
     * 
     * @param nums the input array
     * @return the required result
     */
    public long maximumTripletValue(int[] nums) {
        long result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                long left = nums[i] - nums[j];
                if (left > 0) {
                    for (int k = j + 1; k < nums.length; k++) {
                        long cur = left * nums[k];
                        result = Math.max(result, cur);
                    }
                }
            }
        }

        return result;
    }
}
