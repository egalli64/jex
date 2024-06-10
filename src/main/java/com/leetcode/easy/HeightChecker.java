/*
 * 1051. Height Checker - https://leetcode.com/problems/height-checker/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);

        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i])
                result += 1;
        }

        return result;
    }
}
