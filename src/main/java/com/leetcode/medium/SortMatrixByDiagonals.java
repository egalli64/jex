/*
 * 3446. Sort Matrix by Diagonals - https://leetcode.com/problems/sort-matrix-by-diagonals/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sort the elements in the input squared matrix on its diagonals.
 * Top diagonals (over the middle one) in natural order.
 * Bottom diagonals (including the middle one) in reverted order.
 */
public class SortMatrixByDiagonals {
    public int[][] sortMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            List<Integer> diagonal = new ArrayList<>();
            for (int j = 0; i + j < grid.length; j++) {
                diagonal.add(grid[i + j][j]);
            }

            diagonal.sort(Collections.reverseOrder());
            for (int j = 0; i + j < grid.length; j++) {
                grid[i + j][j] = diagonal.get(j);
            }
        }

        for (int j = 1; j < grid.length; j++) {
            List<Integer> diagonal = new ArrayList<>();
            for (int i = 0; j + i < grid.length; i++) {
                diagonal.add(grid[i][j + i]);
            }

            diagonal.sort(null);
            for (int i = 0; j + i < grid.length; i++) {
                grid[i][j + i] = diagonal.get(i);
            }
        }

        return grid;
    }
}
