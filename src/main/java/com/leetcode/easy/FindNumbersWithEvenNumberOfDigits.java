/*
 * 1295. Find Numbers with Even Number of Digits - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Arrays;

/**
 * Count the values having an even number of (decimal) digits
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums).filter(this::hasEvenDigit).count();
    }

    private boolean hasEvenDigit(int x) {
        int digit = 0;

        while (x > 0) {
            digit += 1;
            x /= 10;
        }

        return digit % 2 == 0;
    }

    public int fastAndDirty(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num >= 10 && num <= 99 || num >= 1_000 && num <= 9_999 || num == 100_000) {
                result += 1;
            }
        }
        return result;
    }
}
