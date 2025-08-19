/*
 * 2348. Number of Zero-Filled Subarrays - https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Count how many zero subarrays are in the input array
 */
public class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        int count = 0;

        for (int num : nums) {
            count = (num == 0) ? count + 1 : 0;
            result += count;
        }

        return result;
    }
}
