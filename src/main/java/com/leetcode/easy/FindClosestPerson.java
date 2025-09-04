/*
 * 3516. Find Closest Person - https://leetcode.com/problems/find-closest-person/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given three positive integers
 * Return 1 if the first is closer than the second to the third
 * Return 2 if the second is closer than the first to the third
 * Return 0 otherwise
 */
public class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int left = Math.abs(x - z);
        int right = Math.abs(y - z);

        return left == right ? 0 : left < right ? 1 : 2;
    }
}
