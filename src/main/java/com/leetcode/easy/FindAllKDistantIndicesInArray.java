/*
 * 2200. Find All K-Distant Indices in an Array - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Return the indices, in natural order, of the items in the passed array that
 * are in a k distance from items having value key.
 */
public class FindAllKDistantIndicesInArray {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();

        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int left = Math.max(right, i - k);
                right = Math.min(nums.length - 1, i + k) + 1;
                for (int j = left; j < right; j++) {
                    result.add(j);
                }
            }
        }

        return result;
    }
}
