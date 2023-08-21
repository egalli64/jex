/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

/**
 * groupSum - https://codingbat.com/prob/p145416
 * <p>
 * Given an array, the first index to consider in it, and a target, check if
 * there is subset of the array having target as a sum. It is caller
 * responsibility to pass a _good_ index.
 */
public class GroupSum {
    /**
     * Solution by backtracking recursion
     * <p>
     * Base case: if the start index is not good, return true only if target is
     * zero.
     * <p>
     * Recursion: Increase the index and recurse to check the two possible
     * alternatives, the current element is part of the solution, or not.
     *
     * @param start  first index
     * @param nums   an array
     * @param target expected sum
     * @return true if found
     */
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }
}
