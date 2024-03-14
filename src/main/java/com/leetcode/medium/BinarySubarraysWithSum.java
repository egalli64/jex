/*
 * 930. Binary Subarrays With Sum - https://leetcode.com/problems/binary-subarrays-with-sum/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given an array, count the non-empty subarrays having a specified sum
 * 
 * Constraints:
 * <li>array length is in [1 .. 30_000]
 * <li>each array value is 0 or 1
 * <li>the target is in [0 .. array.length]
 */
public class BinarySubarraysWithSum {
    /**
     * Count subarrays having the given sum
     * 
     * @param nums an array
     * @param goal the sum
     * @return the count
     */
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = 0;

        for (int i = 0, j = 0, count = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                goal -= 1;
                count = 0;
            }

            while (goal == 0 && j <= i) {
                goal += nums[j];
                j += 1;
                count += 1;
                if (j > i - goal + 1)
                    break;
            }

            while (goal < 0) {
                goal += nums[j];
                j += 1;
            }

            result += count;
        }

        return result;
    }
}
