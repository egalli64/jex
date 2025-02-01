/*
 * 3151. Special Array I - https://leetcode.com/problems/special-array-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an int array, check if its values are alternatively odd and even
 * <p>
 * Constraints: the array is non-empty, its values are positive
 */
public class SpecialArrayI {
    public boolean isArraySpecial(int[] nums) {
        boolean isPrevEven = nums[0] % 2 == 0;

        for (int i = 1; i < nums.length; i++) {
            boolean isCurEven = nums[i] % 2 == 0;
            if (isPrevEven == isCurEven) {
                return false;
            } else {
                isPrevEven = isCurEven;
            }
        }

        return true;
    }
}
