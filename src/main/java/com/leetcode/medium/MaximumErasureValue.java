/*
 * 1695. Maximum Erasure Value - https://leetcode.com/problems/maximum-erasure-value/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Find in the input array the (contiguous) subarray having:
 * (a) unique values, and
 * (b) the largest sum.
 * Returns its sum.
 */
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> window = new HashSet<>(nums.length);

        int sum = 0;
        int result = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            while (window.contains(nums[j])) {
                window.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            sum += nums[j];
            window.add(nums[j]);

            result = Math.max(result, sum);
        }

        return result;
    }
}
