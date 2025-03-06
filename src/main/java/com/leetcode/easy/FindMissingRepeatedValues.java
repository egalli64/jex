/*
 * 2965. Find Missing and Repeated Values - https://leetcode.com/problems/find-missing-and-repeated-values/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an n x n array that should contain values in [1 .. n*n], we know that
 * one value is missing and another is in there twice. Returns these two values,
 * first is the repeating one, second is the missing one.
 * <p>
 * Constraints: n is in [2 .. 50], values are in [1 .. n*n] following the rule
 * given above.
 */
public class FindMissingRepeatedValues {
    /**
     * Use a set to keep track of values in input - the duplicated one, as detected
     * is put in the result. Use the Gauss summation to find the expected sum,
     * compare to the actual one to get the missing value.
     * 
     * @param grid the input values
     * @return the pair of repeating / missing values
     */
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[] { 0, 0 };

        Set<Integer> buffer = new HashSet<>();

        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cur = grid[i][j];
                if (buffer.contains(cur)) {
                    result[0] = cur;
                } else {
                    buffer.add(cur);
                }
            }
        }

        int expected = (1 + n * n) * (n * n) / 2;
        int actual = buffer.stream().mapToInt(i -> i).sum();
        result[1] = expected - actual;

        return result;
    }
}
