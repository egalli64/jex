/*
 * 2485. Find the Pivot Integer - https://leetcode.com/problems/find-the-pivot-integer/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an integer n in [1 .. 1000], generate the integer such that the sum of
 * all elements between 1 and it inclusively equals the sum of all elements
 * between it and n inclusively.
 * 
 */
public class FindThePivotInteger {
    /**
     * The pivot for [1 .. n]
     * 
     * @param n a positive integer
     * @return its pivot, or -1
     */
    public int pivotInteger(int n) {
        final int sum = n * (n + 1) / 2;
        int left = 1;
        int right = n;

        while (left <= right) {
            int candidate = left + (right - left) / 2;
            int leftSum = (candidate * (candidate + 1)) / 2;
            int rightSum = sum - leftSum + candidate;

            if (leftSum == rightSum) {
                return candidate;
            } else if (leftSum < rightSum) {
                left = candidate + 1;
            } else {
                right = candidate - 1;
            }
        }
        return -1;
    }
}
