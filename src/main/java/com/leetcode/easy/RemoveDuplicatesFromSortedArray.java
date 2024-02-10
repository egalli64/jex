/*
 * LeetCode 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

public class RemoveDuplicatesFromSortedArray {
    /**
     * Remove duplicates in-place
     * 
     * @param nums a sorted array of integers
     * @return the number of unique elements in it
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 1;
        for (int i = 0, j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                count += 1;
                i += 1;
                nums[i] = nums[j];
            }
        }
        return count;
    }
}
