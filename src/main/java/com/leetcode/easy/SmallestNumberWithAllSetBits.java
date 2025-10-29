/*
 * 3370. Smallest Number With All Set Bits - https://leetcode.com/problems/smallest-number-with-all-set-bits/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Find the first value with all bits set to 1 from the input value on
 * <p>
 * The input value is in [1...1_000]
 */
class SmallestNumberWithAllSetBits {
    /**
     * Smoke Test
     */
    static void main() {
        var x = new SmallestNumberWithAllSetBits();

        System.out.println(x.smallestNumber(5) == 7);
        System.out.println(x.smallestNumber(10) == 15);
        System.out.println(x.smallestNumber(3) == 3);
    }

    public int smallestNumber(int n) {
        int result = 1;

        while (result <= n) {
            result <<= 1;
        }

        return result - 1;
    }
}
