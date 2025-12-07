/*
 * 1523. Count Odd Numbers in an Interval Range
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * How many odd values are in [low...high]?
 * Both values are non-negative, low is not greater than high.
 */
class E1523 {
    /**
     * Smoke Test
     */
    static void main() {
        E1523 x = new E1523();

        System.out.println(x.countOdds(3, 7) == 3);
        System.out.println(x.countOdds(8, 10) == 1);
    }

    /**
     * Get the size of the interval, the odd values in it are N / 2.
     * But: if its size and its first element are odd, minus one.
     */
    public int countOdds(int low, int high) {
        final int size = high - low + 1;

        int result = size / 2;
        if (size % 2 != 0 && low % 2 != 0) {
            result += 1;
        }
        return result;
    }
}
