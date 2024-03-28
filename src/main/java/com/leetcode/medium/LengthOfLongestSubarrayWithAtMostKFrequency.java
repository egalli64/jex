/*
 * 2958. Length of Longest Subarray With at Most K Frequency - https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;

/**
 * Given an integer array, return the length of its longest subarray having the
 * frequency of each element less than or equal to the given limit
 */
public class LengthOfLongestSubarrayWithAtMostKFrequency {
    /**
     * Find sized of longest "good" subarray
     * 
     * @param nums the input array
     * @param k    the limit
     * @return the found size
     */
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> window = new HashMap<>();

        int result = 0;
        for (int left = 0, right = 0; right < nums.length; right++) {
            window.put(nums[right], window.getOrDefault(nums[right], 0) + 1);
            while (window.get(nums[right]) > k) {
                window.put(nums[left], window.get(nums[left]) - 1);
                left += 1;
            }
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
