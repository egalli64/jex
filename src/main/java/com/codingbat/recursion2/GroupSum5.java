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
     * Delegate to {@linkplain GroupSum5#recursion(int, int[], int, boolean)},
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
     * Delegate to {@linkplain GroupSum5#recursion(int, int[], int, boolean)}
     * <p>
     * For robustness, the caller can't specify the starting index
     * 
     * @param start  first index
     * @param nums   array
     * @param target the target
     * @return true if found
     */
    public static boolean solution(int[] nums, int target) {
        return recursion(0, nums, target, true);
    }

    /**
     * Delegate to {@linkplain GroupSum5#recursion(int, int[], int, boolean)}
     * <p>
     * If the caller wants to be able to specify the starting index, check if the
     * starting element is selectable before starting recursion
     * 
     * @param start  first index
     * @param nums   array
     * @param target the target
     * @return true if found
     */
    public static boolean checkStart(int start, int[] nums, int target) {
        boolean selectable = start > 0 && nums[start - 1] == 5 && nums[start] == 1 ? false : true;
        return recursion(start, nums, target, selectable);
    }

    static boolean recursion(int i, int[] nums, int target, boolean selectable) {
        if (i == nums.length) {
            return target == 0;
        }

        if (nums[i] % 5 == 0) {
            return recursion(i + 1, nums, target - nums[i], false);
        } else if (nums[i] == 1 && !selectable) {
            return recursion(i + 1, nums, target, true);
        } else {
            return recursion(i + 1, nums, target - nums[i], true) || recursion(i + 1, nums, target, true);
        }
    }

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
    public static boolean alternative(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        if (nums[start] % 5 == 0) {
            return alternative(start + 1, nums, target - nums[start]);
        } else if (start > 0 && nums[start - 1] % 5 == 0 && nums[start] == 1) {
            return alternative(start + 1, nums, target);
        } else {
            return alternative(start + 1, nums, target - nums[start]) || alternative(start + 1, nums, target);
        }
    }
}
