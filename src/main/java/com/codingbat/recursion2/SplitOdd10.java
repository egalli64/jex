/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

/**
 * splitOdd10 - https://codingbat.com/prob/p171660
 * <p>
 * Given an array, check if it is possible to split it in two groups, one should
 * have a modulo 10 sum, the other should have an odd sum.
 */
public class SplitOdd10 {
    /**
     * Delegate to {@linkplain SplitOdd10#recursion(int, int[], int, int)}
     *
     * @param nums an array
     * @return true for success
     */
    public static boolean solution(int[] nums) {
        return recursion(0, nums, 0, 0);
    }

    /**
     * Solution by backtracking recursion, helper for
     * {@linkplain SplitOdd10#solution(int[])}
     * <p>
     * Base case: if the start index is not good, return true only if the ten sum is
     * modulo 10 and the odd sum is odd.
     * <p>
     * Recursion: Increase the index and recurse to check the two possible
     * alternatives, the current element is part of the ten or odd group.
     *
     * @param i    current index
     * @param nums an array
     * @param ten  sum of the "ten" partition
     * @param odd  sum of the "odd" partition
     * @return true for success
     */
    private static boolean recursion(int i, int[] nums, int ten, int odd) {
        if (i == nums.length) {
            return ten % 10 == 0 && odd % 2 != 0;
        }

        return recursion(i + 1, nums, ten + nums[i], odd) || recursion(i + 1, nums, ten, odd + nums[i]);
    }
}
