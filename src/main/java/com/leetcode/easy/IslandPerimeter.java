/*
 * 463. Island Perimeter - https://leetcode.com/problems/island-perimeter/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a 0/1 matrix, representing a map where 0 is water and 1 is land, with
 * one "no-hole" island in it. Calculate the island perimeter.
 */
public class IslandPerimeter {
    /**
     * Calculate the perimeter
     * 
     * @param grid the island map
     * @return the island perimeter
     */
    public int islandPerimeter(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (!(i > 0 && grid[i - 1][j] == 1)) {
                        result += 2;
                    }
                    if (!(j > 0 && grid[i][j - 1] == 1)) {
                        result += 2;
                    }
                }
            }
        }

        return result;
    }
}
