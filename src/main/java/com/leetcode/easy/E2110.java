/*
 * 2110. Number of Smooth Descent Periods of a Stock
 * https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a non-empty int array,
 * count how many decreasing by one sub-sequences are in it.
 * Each single item is considered a "good" decreasing subseq.
 */
class E2110 {
    /**
     * Smoke Test
     */
    static void main() {
        E2110 x = new E2110();

        System.out.println(x.getDescentPeriods(new int[]{3, 2, 1, 4}) == 7);
        System.out.println(x.getDescentPeriods(new int[]{8, 6, 7, 7}) == 4);
        System.out.println(x.getDescentPeriods(new int[]{1}) == 1);
    }

    public long getDescentPeriods(int[] prices) {
        long result = 1;

        for (int i = 1, size = 1; i < prices.length; i++) {
            if (prices[i] == prices[i - 1] - 1) {
                size += 1;
            } else {
                size = 1;
            }
            result += size;
        }

        return result;
    }
}
