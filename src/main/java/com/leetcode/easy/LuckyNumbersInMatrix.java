/*
 * 1380. Lucky Numbers in a Matrix - https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.List;

/**
 * A lucky number is an element of the matrix such that it is the minimum
 * element in its row and maximum in its column. Notice that there is no
 * duplicate value in the matrix.
 * <p>
 * Given a matrix of distinct numbers, return all lucky numbers in it.
 */
public class LuckyNumbersInMatrix {
    /**
     * Generate the arrays of min and max elements, then put the elements in both
     * the arrays in the resulting list.
     * 
     * @param matrix an int matrix
     * @return list of min/max elements
     */
    public List<Integer> luckyNumbers(int[][] matrix) {
        // initialize the max for each column using the value in the first row
        int[] maxs = matrix[0].clone();
        // initialize the minimum for each row using the value in the first column
        int[] mins = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mins[i] = matrix[i][0];
        }

        // adjust min/max when required
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int cur = matrix[i][j];
                mins[i] = Math.min(mins[i], cur);
                maxs[j] = Math.max(maxs[j], cur);
            }
        }

        // check in the matrix for the min/max value, if exists
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int cur = matrix[i][j];
                if (cur == mins[i] && cur == maxs[j]) {
                    return List.of(cur);
                }
            }
        }

        // no min/max found
        return List.of();
    }
}
