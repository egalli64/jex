/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

/**
 * groupSum6 - https://codingbat.com/prob/p199368
 * <p>
 * Given an array, the first index to consider in it, and a target, check if
 * there is subset _containing all 6s_ of the array having target as a sum. It
 * is caller responsibility to pass a _good_ index.
 */
public class GroupSum6 {
    /**
     * Solution by backtracking recursion
     * <p>
     * Base case: if the start index is not good, return true only if target is
     * zero.
     * <p>
     * Recursion: Increase the index and recurse to check the two possible
     * alternatives, the current element is part of the solution, or not. But, if
     * the current element has to be discarded and it is a 6, there is no valid
     * subset.
     *
     * @param start  first index
     * @param nums   an array
     * @param target expected sum
     * @return true if found
     */
    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        } else {
            if (nums[start] == 6) {
                return false;
            } else {
                return groupSum6(start + 1, nums, target);
            }
        }
    }
}
