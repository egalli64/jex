/*
 * 812. Largest Triangle Area - https://leetcode.com/problems/largest-triangle-area/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given some 2d points, find the area of the largest one
 */
public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int largestRectangleArea = 0;

        for (int i = 0; i < points.length - 2; i++)
            for (int j = i + 1; j < points.length - 1; j++)
                for (int k = j + 1; k < points.length; k++)
                    largestRectangleArea = Math.max(largestRectangleArea, gaussAreaX2(points[i], points[j], points[k]));

        return largestRectangleArea / 2.0;
    }

    /**
     * Gauss formula: A = | (x₁ * (y₂ - y₃) + x₂ * (y₃ - y₁) + x₃ * (y₁ - y₂)) | / 2
     */
    public int gaussAreaX2(int[] a, int[] b, int[] c) {
        return Math.abs(a[0] * (b[1] - c[1]) + b[0] * (c[1] - a[1]) + c[0] * (a[1] - b[1]));
    }
}
