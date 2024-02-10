/*
 * LeetCode 27. Remove Element
 * https://leetcode.com/problems/remove-element/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

public class RemoveElement {
    /**
     * Remove elements in-place
     * 
     * @param nums an array of integers
     * @param val  the value of the elements to be removed
     * @return the number of survivors
     */
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                count += 1;
                i += 1;
            }
        }
        return count;
    }
}
