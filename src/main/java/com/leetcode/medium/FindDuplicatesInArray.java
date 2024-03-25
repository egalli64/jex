/*
 * 442. Find All Duplicates in an Array - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array where all the integers are in the range [1, length]
 * and each integer appears once or twice, return an array of all the integers
 * that appears twice.
 *
 * The array length is in [1 .. 10_000]
 */
public class FindDuplicatesInArray {
    /**
     * Use an int array as buffer instead of a Set for performance
     * 
     * @param nums the input array
     * @return an array with the duplicated items
     */
    public List<Integer> findDuplicates(int[] nums) {
        int[] buffer = new int[nums.length];
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (buffer[num - 1] == 1) {
                result.add(num);
            } else {
                buffer[num - 1] = 1;
            }
        }

        return result;
    }
}
