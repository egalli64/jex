/*
 * 287. Find the Duplicate Number - https://leetcode.com/problems/find-the-duplicate-number/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given an array of integers containing n + 1 integers where each integer is in
 * the range [1, n], where n is in [1, 10_000]
 * 
 * Find the unique repeated number in it
 * 
 * Do not modify the array and uses only constant extra space
 */
public class FindTheDuplicateNumber {
    /**
     * Simple solution, but using O(n) extra space
     * 
     * @param nums the input array
     * @return the duplicated value
     */
    public int findDuplicate(int[] nums) {
        boolean[] buffer = new boolean[nums.length - 1];

        for (int num : nums) {
            if (!buffer[num - 1]) {
                buffer[num - 1] = true;
            } else {
                return num;
            }
        }

        throw new IllegalStateException("No solution found!");
    }
}
