/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

/**
 * split53 - https://codingbat.com/prob/p168295
 * <p>
 * Given an array, check if it is possible to split it in two groups with the
 * same sum. Besides, all elements multiple of 5 should be in the same group,
 * and all the elements multiple of 3 (and not 5) in the other one.
 */
public class Split53 {
    /**
     * Delegate to {@linkplain Split53#recursion(int[], int, int, int)
     *
     * @param nums an array
     * @return true for success
     */
    public static boolean solution(int[] nums) {
        return recursion(nums, 0, 0, 0);
    }

    /**
     * Solution by backtracking recursion, helper for
     * {@linkplain Split53#solution(int[])}
     * <p>
     * Base case: if the start index is not good, return true only if the five sum
     * is same as the three sum.
     * <p>
     * Recursion: Increase the index and recurse to check the two possible
     * alternatives, the current element is part of the five, three group, or, if
     * not multiple of 5 or 3, could be in either groups.
     * 
     * @param a     array
     * @param i     starting position
     * @param five  total in "five" group
     * @param three total in "three" group
     * @return true if success
     */
    static boolean recursion(int[] a, int i, int five, int three) {
        if (i == a.length) {
            return five == three;
        }

        if (a[i] % 5 == 0) {
            return recursion(a, i + 1, five + a[i], three);
        } else if (a[i] % 3 == 0) {
            return recursion(a, i + 1, five, three + a[i]);
        } else {
            return recursion(a, i + 1, five + a[i], three) || recursion(a, i + 1, five, three + a[i]);
        }
    }
}
