/*
 * 200. Number of Islands - https://leetcode.com/problems/number-of-islands/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given a 2d 0/1 array representing a map of water and land, calculate the
 * number of islands
 */
public class NumberOfIslands {
    public static final char WATER = '0';
    public static final char LAND = '1';
    public static final char VISITED = 'x';

    /**
     * For each land cell check all neighbors
     * 
     * @param grid the non-empty map
     * @return the number of islands
     */
    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == LAND) {
                    result += 1;
                    visit(grid, i, j);
                }
            }
        }

        return result;
    }

    /**
     * Recursively visit each neighbor
     * 
     * @param grid the map
     * @param i    row
     * @param j    column
     */
    void visit(char[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == LAND) {
            grid[i][j] = VISITED;

            visit(grid, i + 1, j);
            visit(grid, i - 1, j);
            visit(grid, i, j + 1);
            visit(grid, i, j - 1);
        }
    }
}
