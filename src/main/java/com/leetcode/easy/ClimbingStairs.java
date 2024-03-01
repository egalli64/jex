/*
 * 70. Climbing Stairs - https://leetcode.com/problems/climbing-stairs/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Climbing a staircase
 */
public class ClimbingStairs {
    /**
     * Each time you can either climb 1 or 2 steps
     * 
     * @param n number of steps to reach the top, in [1..45]
     * @return number of distinct way to reach the top
     */
    public int climbStairs(int n) {
        int prev = 0;
        int cur = 1;

        for (int i = 0; i < n; i++) {
            int temp = prev;
            prev = cur;
            cur += temp;
        }

        return cur;
    }
}
