/*
 * 3350. Adjacent Increasing Subarrays Detection II - https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.List;

/**
 * Check in the input sequence, sized 2+, for two subsequences:
 * adjacent, both strictly increasing.
 * Return the maximum size for them.
 */
public class AdjacentIncreasingSubarraysDetectionII {
    /**
     * Loop on the input sequence.
     * Get the size of the current strictly increasing subsequence.
     * It could be coupled with the previous subsequence (the smallest wins)
     * or split in two.
     * Careful about the fence problem on the last item.
     */
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int result = 1;
        int left = 1;
        int current = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                current += 1;
            } else {
                result = Math.max(result, Math.max(current / 2, Math.min(left, current)));
                left = current;
                current = 1;
            }
        }

        return Math.max(result, Math.max(current / 2, Math.min(left, current)));
    }
}
