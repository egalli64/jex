/*
 * 42. Trapping Rain Water - https://leetcode.com/problems/trapping-rain-water/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * Given a non-negative integer array representing an elevation map where the
 * width of each bar is 1, compute how much water it can trap after raining.
 */
public class TrappingRainWater {
    /**
     * Get the max water quantity
     * 
     * @param height the elevation map
     * @return the max water quantity
     */
    public int trap(int[] height) {
        int result = 0;

        int[] left = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        int[] right = new int[height.length];
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            result += Math.min(left[i], right[i]) - height[i];
        }

        return result;
    }
}
