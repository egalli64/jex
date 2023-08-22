/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

/**
 * groupSumClump - https://codingbat.com/prob/p105136
 * <p>
 * Given an array, the first index to consider in it, and a target, check if
 * there is subset of the array having target as a sum. However, each group of
 * same-value elements should be considered as a unity, all of them in or out
 * (we can loop on them, to keep the problem simple). It is caller
 * responsibility to pass a _good_ index.
 */
public class GroupSumClump {
    /**
     * Solution by backtracking recursion
     * <p>
     * Base case: if the start index is not good, return true only if target is
     * zero.
     * <p>
     * Recursion: Increase the index and recurse to check the two possible
     * alternatives, the current element is part of the solution, or not. But groups
     * of same-value elements should be considered as a single element, so,
     * determine the current group size, and recurse on the using it as element.
     *
     * @param start  first index
     * @param nums   an array
     * @param target the required total
     * @return true for success
     */
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        int size = 1;
        while (start + size < nums.length && nums[start] == nums[start + size]) {
            size += 1;
        }
        int value = nums[start] * size;

        return groupSumClump(start + size, nums, target - value) || groupSumClump(start + size, nums, target);
    }
}
