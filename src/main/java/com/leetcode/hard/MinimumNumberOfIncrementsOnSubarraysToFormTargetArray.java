/*
 * 1526. Minimum Number of Increments on Subarrays to Form a Target Array
 * https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * Given a non-empty array of positive values,
 * calculate how many operations are required to build it.
 * Each operation is an increase by one on a subarray.
 */
public class MinimumNumberOfIncrementsOnSubarraysToFormTargetArray {
    /**
     * Smoke Test
     */
    static void main() {
        MinimumNumberOfIncrementsOnSubarraysToFormTargetArray x = new MinimumNumberOfIncrementsOnSubarraysToFormTargetArray();

        System.out.println(x.minNumberOperations(new int[]{1, 2, 3, 2, 1}) == 3);
        System.out.println(x.minNumberOperations(new int[]{3, 1, 1, 2}) == 4);
        System.out.println(x.minNumberOperations(new int[]{3, 1, 5, 4, 2}) == 7);
    }

    /**
     * If the array contains just an element, its value is the result.
     * Consider its following element.
     * If bigger, we need to perform the extra steps. Otherwise, we are okay.
     */
    public int minNumberOperations(int[] target) {
        int result = target[0];

        for (int i = 1; i < target.length; i++) {
            if (target[i] > target[i - 1]) {
                result += target[i] - target[i - 1];
            }
        }

        return result;
    }
}
