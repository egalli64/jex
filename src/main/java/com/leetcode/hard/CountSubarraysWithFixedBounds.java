/*
 * 2444. Count Subarrays With Fixed Bounds - https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * Given an integer array and two min/max integers, return the number of
 * fixed-bound subarrays, meaning that have the passed min/max as passed
 */
public class CountSubarraysWithFixedBounds {
    /**
     * Find the subarray count
     * 
     * @param nums the input array
     * @param minK the lower target
     * @param maxK the upper target
     * @return the count
     */
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int out = -1;
        int left = -1;
        int right = -1;

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];

            if (cur < minK || cur > maxK) {
                out = i;
            } else {
                if (cur == minK) {
                    left = i;
                }
                if (cur == maxK) {
                    right = i;
                }
            }

            count += Math.max(0, Math.min(left, right) - out);
        }

        return count;
    }
}
