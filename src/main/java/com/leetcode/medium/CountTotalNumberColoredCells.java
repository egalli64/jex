/*
 * 2579. Count Total Number of Colored Cells - https://leetcode.com/problems/count-total-number-of-colored-cells/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Define a function N -> N where 1 -> 1, 2 -> 5, 3 -> 13, ...
 * <p>
 * Visualize it like this: at time 1, 1 square is colored. Then, at time x + 1,
 * all the adjacent squared are painted.
 */
public class CountTotalNumberColoredCells {
    /**
     * The series is: 1, 1 + 4, 1 + (4 * 2), ...
     * <p>
     * So, at n: 1 + (4 * 1) + (4 * 2) + ... + (4 * (n - 1)
     * <p>
     * That is: 1 + 4 * (n * (n - 1)) / 2 = 1 + 2 (n * (n - 1))
     * 
     * @param n input value
     * @return the generated value
     */
    public long coloredCells(int n) {
        return (long) 2 * n * (n - 1) + 1;
    }
}
