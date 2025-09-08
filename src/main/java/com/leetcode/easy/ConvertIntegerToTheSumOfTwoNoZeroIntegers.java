/*
 * 1317. Convert Integer to the Sum of Two No-Zero Integers - https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Return two positive integers whose sum is n,
 * and both do not contain any zero in their decimal representation.
 * Assume there is at least a valid solution
 */
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        result[1] = n;

        int multi = 1;
        while (n > 0) {
            int current = n % 10;
            if (current == 0) {
                result[0] += 5 * multi;
                n -= 10;
            } else if (current == 1 && n >= 10) {
                result[0] += 6 * multi;
                n -= 10;
            } else {
                result[0] += current / 2 * multi;
            }

            multi *= 10;
            n /= 10;
        }

        result[1] -= result[0];
        return result;
    }
}
