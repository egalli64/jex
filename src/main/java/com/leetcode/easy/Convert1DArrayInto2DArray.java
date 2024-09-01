/*
 * 2022. Convert 1D Array Into 2D Array - https://leetcode.com/problems/convert-1d-array-into-2d-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Arrays;

/**
 * Given a 1D integer array transpose it (in the natural way) in a m x n 2D
 * array, if the dimensions match, or return an empty array
 */
public class Convert1DArrayInto2DArray {
    /**
     * A Java n-D array is actually an array of array
     * 
     * @param original the input 1-D array
     * @param m        output rows
     * @param n        output columns
     * @return the converted array
     */
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][];
        for (int i = 0; i < m; i++) {
            final int begin = i * n;
            result[i] = Arrays.copyOfRange(original, begin, begin + n);
        }

        return result;
    }

    /**
     * Keep track of the original position in k, loop on each (i, j) element in the
     * output matrix
     * 
     * @param original the input 1-D array
     * @param m        output rows
     * @param n        output columns
     * @return the converted array
     */
    public int[][] raw(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        for (int i = 0, k = 0; i < m; i++) {
            for (int j = 0; j < n; j++, k++) {
                result[i][j] = original[k];
            }
        }

        return result;
    }
}
