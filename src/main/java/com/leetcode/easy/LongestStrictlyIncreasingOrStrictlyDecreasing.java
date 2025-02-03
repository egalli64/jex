/*
 * 3105. Longest Strictly Increasing or Strictly Decreasing - https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a non-empty int array, return the length of the longest strictly
 * increasing or decreasing subsequence in it
 */
public class LongestStrictlyIncreasingOrStrictlyDecreasing {
    /**
     * Keep track of the current size of the increasing/decreasing subsequence, and
     * of the longest one already seen. For each pair of elements, check if the new
     * one is increasing / decreasing / same. Adjust the length of the growing
     * subsequence, reset the other(s) one(s). At the end of each step, check if the
     * longest monotonic subsequence is changed.
     * 
     * @param nums the non-empty input arrays
     * @return the length of longest strictly monotonic subsequence
     */
    public int longestMonotonicSubarray(int[] nums) {
        int increasing = 1;
        int decreasing = 1;

        int monotonic = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                increasing += 1;
                decreasing = 1;
            } else if (nums[i] < nums[i - 1]) {
                decreasing += 1;
                increasing = 1;
            } else {
                increasing = 1;
                decreasing = 1;
            }

            monotonic = Math.max(monotonic, Math.max(increasing, decreasing));
        }

        return monotonic;
    }
}
