/*
 * 11. Container With Most Water - https://leetcode.com/problems/container-with-most-water/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given the length of n vertical lines starting on the y-axis at x as index,
 * find two lines that together with the x-axis form a container,
 * such that the container contains the most water
 * <p>
 * Return the maximum amount of water a container can store
 */
public class ContainerWithMostWater {
    /**
     * Max water in container
     *
     * @param height there are at least 2 elements in it
     * @return the maximum amount of water a container can store
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while (left < right) {
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        return result;
    }
}
