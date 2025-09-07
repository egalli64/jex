/*
 * 1304. Find N Unique Integers Sum up to Zero - https://leetcode.com/problems/add-binary/find-n-unique-integers-sum-up-to-zero/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Generate an array sized n, containing zero-sum different values
 */
public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n / 2; i++) {
            result[i * 2] = i + 1;
            result[i * 2 + 1] = -(i + 1);
        }

        return result;
    }
}
