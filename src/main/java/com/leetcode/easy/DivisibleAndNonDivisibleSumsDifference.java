/*
 * 2894. Divisible and Non-divisible Sums Difference - https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given two integers, n and m, return the difference between (a) the sum of all
 * integers in the range [1, n] (both inclusive) that are not divisible by m and
 * (b) the sum of all integers in the range [1, n] (both inclusive) that are
 * divisible by m.
 */
public class DivisibleAndNonDivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        int a = n * (n + 1) / 2;
        int k = n / m;
        int b = m * k * (k + 1);
        return a - b;
    }
}
