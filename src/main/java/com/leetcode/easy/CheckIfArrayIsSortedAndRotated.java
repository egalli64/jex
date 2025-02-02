/*
 * 1752. Check if Array Is Sorted and Rotated - https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a non-empty array, check if it is sorted (natural, possibly with
 * duplicates) and rotated (possibly rot-0)
 */
public class CheckIfArrayIsSortedAndRotated {
    /**
     * The sequence must be monotonic non-decreasing, possibly with a single
     * exception, a gap downward due to the rotation.
     * 
     * @param nums the input non-empty array
     * @return true if sorted and rotated
     */
    public boolean check(int[] nums) {
        boolean hasGap = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (hasGap) {
                    return false;
                } else {
                    hasGap = true;
                }
            }
        }
        if (hasGap) {
            return nums[nums.length - 1] <= nums[0];
        }

        return true;
    }
}
