/*
 * 452. Minimum Number of Arrows to Burst Balloons - https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;

/**
 * Given the x coordinates of n overlapping targets, return the minimal number
 * of overlapping groups of target
 * 
 * The passed array is not empty, at least one target is provided
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    /**
     * Each non-overlapping target determines a group
     * 
     * @param non-empty points array of extreme coordinates for each target
     * @return minimal number of overlapping groups of target
     */
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int result = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                result += 1;
                end = points[i][1];
            }
        }

        return result;
    }
}
