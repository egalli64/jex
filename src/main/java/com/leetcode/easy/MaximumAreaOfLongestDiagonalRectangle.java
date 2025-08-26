/*
 * 3000. Maximum Area of Longest Diagonal Rectangle - https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given the dimensions of a few rectangles
 * Return the max area of the one among the ones having the longest diagonal
 */
public class MaximumAreaOfLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxSquredDiagonal = 0;
        int result = 0;

        for (int[] dimension : dimensions) {
            int squaredDiagonal = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            int area = dimension[0] * dimension[1];
            if (squaredDiagonal > maxSquredDiagonal) {
                maxSquredDiagonal = squaredDiagonal;
                result = area;
            } else if (squaredDiagonal == maxSquredDiagonal) {
                result = Math.max(result, area);
            }
        }

        return result;
    }
}
