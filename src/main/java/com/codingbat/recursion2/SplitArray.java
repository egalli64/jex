/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

/**
 * splitArray - https://codingbat.com/prob/p185204
 * <p>
 * Given an array, check if it is possible to split it in two groups, each one
 * having the same sum.
 */
public class SplitArray {
    /**
     * Delegate to {@linkplain SplitArray#recursion(int[], int, int, int)}
     *
     * @param nums an array
     * @return true on success
     */
    public static boolean solution(int[] nums) {
        return recursion(nums, 0, 0, 0);
    }

    /**
     * Solution by backtracking recursion, helper for
     * {@linkplain SplitArray#solution(int[])}
     * <p>
     * Base case: if the start index is not good, return true only if left and right
     * are same.
     * <p>
     * Recursion: Increase the index and recurse to check the two possible
     * alternatives, the current element is part of the left or right group.
     *
     * @param a     array
     * @param i     current position
     * @param left  total in left array
     * @param right total in right array
     * @return true if balanced
     */
    static boolean recursion(int[] a, int i, int left, int right) {
        if (i == a.length) {
            return left == right;
        }

        return recursion(a, i + 1, left + a[i], right) || recursion(a, i + 1, left, right + a[i]);
    }
}
