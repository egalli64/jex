/*
 * 2966. Divide Array Into Arrays With Max Difference - https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;

/**
 */
public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        int[][] result = new int[nums.length / 3][3];

        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[][] {};
            }
            result[i / 3] = new int[] { nums[i], nums[i + 1], nums[i + 2] };
        }

        return result;
    }
}
