/*
 * 3024. Type of Triangle - https://leetcode.com/problems/type-of-triangle/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given three integers, representing the length of the sides of a triangle,
 * return the string representing it.
 */
public class TypeOfTriangle {

    public String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }
        if (nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[1] + nums[2] <= nums[0]) {
            return "none";
        }
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            return "isosceles";
        }
        return "scalene";
    }

    public String byOrdering(int[] nums) {
        int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
        int pos_max = nums[0] == max ? 0 : nums[1] == max ? 1 : 2;
        int min = Math.min(nums[0], Math.min(nums[1], nums[2]));
        int pos_min = nums[0] == min ? 0 : nums[1] == min ? 1 : 2;
        int pos_mid = pos_max != 0 && pos_min != 0 ? 0 : pos_max != 1 && pos_min != 1 ? 1 : 2;
        int mid = nums[pos_mid];

        return max == min ? "equilateral"
                : max >= min + mid ? "none" : max == mid || min == mid ? "isosceles" : "scalene";
    }
}
