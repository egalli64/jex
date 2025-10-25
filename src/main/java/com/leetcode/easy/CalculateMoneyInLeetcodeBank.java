/*
 * 1716. Calculate Money in Leetcode Bank - https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Calculate the sum of a sequence of n values.
 * The sequence is divided in sub-sequences sized 7 (with a tail that could be shorter)
 * The first sub-sequence starts from 1, and it has an increase by 1.
 * The second sub-sequence starts from 2, the third from 3, and so on.
 */
public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int x = n / 7;

        int first = 28;
        int last = 28 + (x - 1) * 7;
        int fullWeeksSum = x * (first + last) / 2;

        int tail = 0;
        for (int day = 0, base = 1 + x; day < n % 7; day++) {
            tail += base + day;
        }

        return fullWeeksSum + tail;
    }
}
