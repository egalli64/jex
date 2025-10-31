/*
 * 3289. The Two Sneaky Numbers of Digitville
 * https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * The input array contains values in [0 ... n - 1].
 * All the values are in just once, but there are two duplicates.
 * Return the two duplicates.
 */
public class TheTwoSneakyNumbersOfDigitville {
    /**
     * Smoke Test
     */
    static void main() {
        TheTwoSneakyNumbersOfDigitville x = new TheTwoSneakyNumbersOfDigitville();

        int[] result = x.getSneakyNumbers(new int[]{0, 1, 1, 0});
        System.out.println(result[0] == 1 && result[1] == 0);

        result = x.getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2});
        System.out.println(result[0] == 3 && result[1] == 2);

        result = x.getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2});
        System.out.println(result[0] == 4 && result[1] == 5);
    }

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = {0, 0};
        boolean[] founds = new boolean[nums.length - 2];
        int i = 0;

        for (int num : nums) {
            if (founds[num]) {
                result[i] = num;
                if (i == 1) {
                    break;
                } else {
                    i += 1;
                }
            } else {
                founds[num] = true;
            }
        }

        return result;
    }
}
