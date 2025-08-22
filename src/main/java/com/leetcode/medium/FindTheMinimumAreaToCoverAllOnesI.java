/*
 * 3195. Find the Minimum Area to Cover All Ones I - https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Area of the minimum rectangle covering all the ones in the input matrix
 */
public class FindTheMinimumAreaToCoverAllOnesI {
    public int minimumArea(int[][] grid) {
        int left = grid[0].length;
        int right = 0;
        int top = grid.length;
        int bottom = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    left = Math.min(j, left);
                    right = Math.max(j, right);
                    top = Math.min(i, top);
                    bottom = Math.max(i, bottom);
                }
            }
        }

        return (right - left + 1) * (bottom - top + 1);
    }
}
