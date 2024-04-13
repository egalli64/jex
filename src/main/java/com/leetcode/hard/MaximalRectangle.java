/*
 * 85. Maximal Rectangle - https://leetcode.com/problems/maximal-rectangle/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a non-empty 0/1 matrix, find the area of largest rectangle containing
 * only 1
 */
public class MaximalRectangle {
    /**
     * Find the largest only-1 rectangle
     * 
     * @param matrix contains just '1's and '0's
     * @return the area of the found rectangle
     */
    public int maximalRectangle(char[][] matrix) {
        int[] heights = new int[matrix[0].length + 1];
        int result = 0;

        Deque<Integer> stack = new ArrayDeque<>();
        for (char[] row : matrix) {
            for (int i = 0; i < heights.length - 1; i++) {
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }

            stack.clear();
            for (int i = 0; i < heights.length; i++) {
                while (!stack.isEmpty()) {
                    Integer prev = stack.peek();
                    if (heights[i] < heights[prev]) {
                        int height = heights[stack.pop()];
                        int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                        result = Math.max(result, height * width);
                    } else {
                        break;
                    }
                }
                stack.push(i);
            }
        }

        return result;
    }
}
