/*
 * 992. Subarrays with K Different Integers - https://leetcode.com/problems/subarrays-with-k-different-integers/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import java.util.HashMap;

/**
 * Given an integer array, return the number of its "good" subarrays
 * 
 * An array is "good" if the number of different integers in it is a given value
 */
public class SubarraysWithKDifferentIntegers {
    /**
     * Count the "good" subarrays
     * 
     * @param nums the input array
     * @param k    the "good" value
     * @return the count
     */
    public int subarraysWithKDistinct(int[] nums, int k) {
        return maxKSubarray(nums, k) - maxKSubarray(nums, k - 1);
    }

    /**
     * Plain sliding window solution, checking for windows with k or less elements
     * 
     * @param nums the input array
     * @param k    the target value
     * @return the count
     */
    int maxKSubarray(int[] nums, int k) {
        int result = 0;

        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int left = 0, right = 0; right < nums.length; right++) {
            counter.put(nums[right], counter.getOrDefault(nums[right], 0) + 1);

            while (counter.size() > k) {
                counter.put(nums[left], counter.get(nums[left]) - 1);
                if (counter.get(nums[left]) == 0) {
                    counter.remove(nums[left]);
                }

                left += 1;
            }

            result += right - left + 1;
        }

        return result;
    }
}
