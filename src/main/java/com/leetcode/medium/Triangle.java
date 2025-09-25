/*
 * 120. Triangle - https://leetcode.com/problems/triangle/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.List;

/**
 * Calculate the minimum path sum from top to bottom
 */
public class Triangle {
    /**
     * Bottom up dynamic programming
     *
     * @param triangle assuming a mutable list of lists, to simplify the algorithm
     * @return the result
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] memo = new int[triangle.size()];

        for (int i = 0; i < memo.length; i++) {
            memo[i] = triangle.getLast().get(i);
        }

        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                memo[j] = Math.min(memo[j], memo[j + 1]) + triangle.get(i).get(j);
            }
        }

        return memo[0];
    }
}
