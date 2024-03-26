/*
 * 41. First Missing Positive - https://leetcode.com/problems/first-missing-positive/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * Given an unsorted integer array, return the smallest positive integer that is
 * not present
 * 
 * The answer should be in [1..n+1]
 * 
 * Required complexity is O(n) in time and O(1) in space
 */
public class FirstMissingPositive {
    /**
     * Disregarding space complexity requirement for simpler and faster solution
     * 
     * @param nums a non-empty array
     * @return the first missing positive integer
     */
    public int firstMissingPositive(int[] nums) {
        boolean[] flags = new boolean[nums.length];
        for (int num : nums) {
            if (num > 0 && num <= nums.length) {
                flags[num - 1] = true;
            }
        }

        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}
