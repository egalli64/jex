/*
 * 69. Sqrt(x) - https://leetcode.com/problems/sqrtx/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a non-negative integer x, return the its truncated square root
 * 
 * No built-in exponent function or operator is allowed!
 */
public class SqrtX {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int tentative = left;

        while (left <= right) {
            int pivot = left + (right - left) / 2;
            long square = (long) pivot * pivot;

            if (square > x) {
                right = pivot - 1;
            } else if (square < x) {
                tentative = pivot;
                left = pivot + 1;
            } else {
                return pivot;
            }
        }
        return tentative;
    }
}
