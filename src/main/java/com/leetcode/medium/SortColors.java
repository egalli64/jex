/*
 * 75. Sort Colors - https://leetcode.com/problems/sort-colors/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Sort the passed int-array without using the standard sorting functions
 * <p>
 * Constraints: only 0, 1, 2 are admissible values
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;

        for (int num : nums) {
            switch (num) {
            case 0 -> zeroes += 1;
            case 1 -> ones += 1;
            }
        }

        for (int i = 0; i < zeroes; i++) {
            nums[i] = 0;
        }

        int notTwos = zeroes + ones;
        for (int i = zeroes; i < notTwos; i++) {
            nums[i] = 1;
        }

        for (int i = notTwos; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}
