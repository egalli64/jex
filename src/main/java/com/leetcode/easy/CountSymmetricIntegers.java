/*
 * 2843. Count Symmetric Integers - https://leetcode.com/problems/count-symmetric-integers/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given that a symmetric integer has a even number of digits, and the sum of
 * the left hand digits equals the sum of the right hand ones. Count number of
 * in passed closed range.
 * <p>
 * Constraint: 1 <= low <= high <= 10_000
 */
public class CountSymmetricIntegers {
    /**
     * <ul>
     * <li>no need to check values less than 11
     * <li>two digit numbers are symmetric only if they are 11 multiples
     * <li>no need to check values in [100 .. 999] range
     * <li>check values in [1_000 .. 9_999] as required
     * </ul>
     * 
     * @param low
     * @param high
     * @return
     */
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;

        low = low < 11 ? 11 : low;

        final int max = Math.min(high, 99);
        for (int cur = low; cur <= max; cur++) {
            if (cur % 11 == 0) {
                result += 1;
                cur += 10;
            }
        }

        low = low < 1_001 ? 1_001 : low;
        for (int cur = low; cur <= high; cur++) {
            int left = cur / 1_000 + (cur % 1_000) / 100;
            int right = (cur % 100) / 10 + (cur % 10);
            if (left == right) {
                result += 1;
            }
        }

        return result;
    }
}
