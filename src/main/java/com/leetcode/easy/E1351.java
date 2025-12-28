/*
 * 1351. Count Negative Numbers in a Sorted Matrix
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a rectangular int matrix,
 * sorted in reversed natural order, both row/column-wise,
 * return how many negative values are in it.
 * <p>
 * The matrix is not degenerated, and "smallish" - i/j <= 100
 */
class E1351 {
    /**
     * Smoke Test
     */
    static void main() {
        E1351 x = new E1351();

        System.out.println(x.countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}) == 8);
        System.out.println(x.countNegatives(new int[][]{{3, 2}, {1, 0}}) == 0);
    }

    public int countNegatives(int[][] grid) {
        int result = 0;

        for (int i = grid.length - 1, j = 0; i >= 0 && j < grid[0].length; ) {
            if (grid[i][j] < 0) {
                result += grid[0].length - j;
                i -= 1;
            } else
                j += 1;
        }

        return result;
    }
}
