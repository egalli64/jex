/*
 * LeetCode 35. Search Insert Position
 * Leetcode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * https://leetcode.com/problems/search-insert-position/description/
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a sorted array and a target value, return the target index or the index
 * where it would be if it were inserted in order
 * 
 * <ol>
 * <li>The array is not empty
 * <li>There is no duplicate in the array
 * <li>An O(log n) time complexity is required
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        boolean right = true;

        while (first < last) {
            int pivot = first + (last - first) / 2;
            if (nums[pivot] > target) {
                right = false;
                last = pivot - 1;
            } else if (nums[pivot] < target) {
                right = true;
                first = pivot + 1;
            } else {
                return pivot;
            }
        }

        if (right) {
            return last + (nums[last] < target ? 1 : 0);
        } else {
            return first + (nums[first] < target ? 1 : 0);
        }
    }
}
