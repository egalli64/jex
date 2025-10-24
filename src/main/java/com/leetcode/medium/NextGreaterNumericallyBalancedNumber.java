/*
 * 2048. Next Greater Numerically Balanced Number - https://leetcode.com/problems/next-greater-numerically-balanced-number/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * A number is "beautiful" if it follows this rule:
 * each digit d in it should appear d times.
 * Return the next beautiful number to the input value.
 * <p>
 * Input is in [0 ... 1_000_000]
 */
public class NextGreaterNumericallyBalancedNumber {
    /**
     * Given the constraint, this is the largest admissible result
     */
    private static final int LARGEST_BEAUTIFUL = 1_224_444;

    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; i <= LARGEST_BEAUTIFUL; i++) {
            if (isBeautiful(i)) {
                return i;
            }
        }

        throw new IllegalArgumentException();
    }

    private boolean isBeautiful(int x) {
        int[] count = new int[10];

        while (x > 0) {
            count[x % 10] += 1;
            x /= 10;
        }

        for (int digit = 0; digit <= 9; digit++) {
            if (count[digit] > 0 && count[digit] != digit) {
                return false;
            }
        }

        return true;
    }
}
