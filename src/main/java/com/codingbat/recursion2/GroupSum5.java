/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

/**
 * groupSum5 - https://codingbat.com/prob/p138907
 * <p>
 * Given an array, the first index to consider in it, and a target, check if
 * there is subset of the array having target as a sum. However, all multiples
 * of 5 should be part of the solution (if any) and, elements 1, if following a
 * multiple of 5, won't be considered. It is caller responsibility to pass a
 * _good_ index.
 */
public class GroupSum5 {
    /**
     * Solution by backtracking recursion
     * <p>
     * Base case: if the start index is not good, return true only if target is
     * zero.
     * <p>
     * Recursion: Increase the index and recurse to check the two possible
     * alternatives, the current element is part of the solution, or not. But first,
     * check if the current value is modulo 5, in that case, it should be part of
     * the solution. Otherwise, if it is a 1 and follow a multiple of 5, it should
     * be discarded.
     *
     * @param start  first index
     * @param nums   an array
     * @param target the target
     * @return true if succeeded
     */
    public static boolean groupSum5(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        if (nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        } else if (start > 0 && nums[start - 1] % 5 == 0 && nums[start] == 1) {
            return groupSum5(start + 1, nums, target);
        } else {
            return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
        }
    }
}
