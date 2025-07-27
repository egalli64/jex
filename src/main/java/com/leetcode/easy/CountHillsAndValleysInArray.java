/*
 * 2210. Count Hills and Valleys in an Array - https://leetcode.com/problems/count-hills-and-valleys-in-an-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Count top and bottom values in the input array, without repetition.
 * First/last elements are out of game (can't compare on both sides).
 * <br>Constraints: Length is 3+, values are in [1 ... 100]
 */
public class CountHillsAndValleysInArray {
    public int countHillValley(int[] nums) {
        int result = 0;

        for (int i = 1, left = nums[0]; i < nums.length - 1; i++) {
            if (nums[i] < left && nums[i] < nums[i + 1] || nums[i] > left && nums[i] > nums[i + 1]) {
                result += 1;
            }
            if (nums[i] != nums[i + 1]) {
                left = nums[i];
            }
        }

        return result;
    }
}
