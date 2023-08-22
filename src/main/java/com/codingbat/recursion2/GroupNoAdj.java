/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

/**
 * groupNoAdj - https://codingbat.com/prob/p169605
 * <p>
 * Given an array, the first index to consider in it, and a target, check if
 * there is subset of the array having target as a sum. However, it is not
 * possible to get two elements in a row. It is caller responsibility to pass a
 * _good_ index.
 */
public class GroupNoAdj {
    /**
     * Delegate to {@linkplain GroupNoAdj#recursion(int, int[], int, boolean)},
     * assuming that the passed start index is 0, so that it makes sense to specify
     * selectable as true
     * 
     * @param start  first index
     * @param nums   array
     * @param target the target
     * @return true if found
     */
    public static boolean solution(int start, int[] nums, int target) {
        return recursion(start, nums, target, true);
    }

    /**
     * Helper for {@linkplain GroupNoAdj#solution(int, int[], int)}
     * <p>
     * Solution by backtracking recursion
     * <p>
     * Base case: if the start index is not good, return true only if target is
     * zero.
     * <p>
     * Recursion: Increase the index and recurse to check the two possible
     * alternatives, the current element is part of the solution, or not. But, if
     * the current element is chosen, recurse with selectable false, since the next
     * one can't be chosen. Discard the current element if it is not selectable, or
     * if, when selected, it does not lead to a positive solution.
     * 
     * @param start      first index
     * @param nums       array
     * @param target     the target
     * @param selectable true if the current element could be chosen
     * @return true if found
     */
    static boolean recursion(int start, int[] nums, int target, boolean selectable) {
        if (start == nums.length) {
            return target == 0;
        }

        if (selectable && recursion(start + 1, nums, target - nums[start], false)) {
            return true;
        } else {
            return recursion(start + 1, nums, target, true);
        }
    }
}
