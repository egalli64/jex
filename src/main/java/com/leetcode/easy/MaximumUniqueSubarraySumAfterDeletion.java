/*
 * 3487. Maximum Unique Subarray Sum After Deletion - https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Extract from the input array the non-empty collection with only unique elements and maximum sum.
 * <br>
 * Beware of negative values.
 */
public class MaximumUniqueSubarraySumAfterDeletion {
    public int maxSum(int[] nums) {
        Set<Integer> result = new HashSet<>();

        int largestNegative = Integer.MIN_VALUE;
        int sumPositive = 0;
        for (int cur : nums) {
            if (cur >= 0 && result.add(cur)) {
                sumPositive += cur;
            } else {
                largestNegative = Math.max(largestNegative, cur);
            }
        }

        return result.isEmpty() ? largestNegative : sumPositive;
    }
}
