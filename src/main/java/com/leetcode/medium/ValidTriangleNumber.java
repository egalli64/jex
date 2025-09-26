/*
 * 611. Valid Triangle Number - https://leetcode.com/problems/valid-triangle-number/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;

/**
 * Count the triplets representing valid triangles (by side lengths)
 */
public class ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;

        for (int i = nums.length - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    result += right - left;
                    right -= 1;
                } else {
                    left += 1;
                }
            }
        }
        return result;
    }
}
