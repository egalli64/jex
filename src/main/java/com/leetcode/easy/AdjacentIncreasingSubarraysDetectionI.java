/*
 * 3349. Adjacent Increasing Subarrays Detection I - https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.List;

/**
 * Check if in the input sequence, sized 2+, there are two subsequences:
 * adjacent, both strictly increasing, and sized k
 */
public class AdjacentIncreasingSubarraysDetectionI {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for (int i = 0; i <= nums.size() - 2 * k; i++) {
            if (isStrictlyIncreasing(nums, i, k) && isStrictlyIncreasing(nums, i + k, k)) {
                return true;
            }
        }

        return false;
    }

    private boolean isStrictlyIncreasing(List<Integer> sub, int begin, int size) {
        for (int i = begin; i < begin + size - 1; i++) {
            if (sub.get(i) >= sub.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
