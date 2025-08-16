/*
 * 1323. Maximum 69 Number - https://leetcode.com/problems/maximum-69-number/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a number containing only 6 and 9.
 * Get the max value from it changing a single digit.
 */
public class Maximum69Number {
    public int maximum69Number(int num) {
        int pos = -1;
        int x = num;

        for (int i = 0; x > 0; i++) {
            if (x % 10 == 6) {
                pos = i;
            }
            x /= 10;
        }

        int delta = pos >= 0 ? 3 * (int) Math.pow(10, pos) : 0;
        return num + delta;
    }
}
