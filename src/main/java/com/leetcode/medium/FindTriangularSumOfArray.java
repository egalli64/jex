/*
 * 2221. Find Triangular Sum of an Array - https://leetcode.com/problems/find-triangular-sum-of-an-array/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Fold the input array, recursively adding the adjacent values modulo 10
 * <p>
 * The array is non-empty
 */
public class FindTriangularSumOfArray {
    public int triangularSum(int[] nums) {
        int size = nums.length;
        while (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            size -= 1;
        }
        return nums[0];
    }
}
