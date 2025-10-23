/*
 * 3461. Check If Digits Are Equal in String After Operations - https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Add all digits modulo 10 in the input string by pairs,
 * until just 2 digits are left.
 * Return true if they are equal.
 * <p>
 * The input string is sized 3+ and it contains just digits
 */
public class CheckIfDigitsAreEqualInStringAfterOperations {
    public boolean hasSameDigits(String s) {
        int[] digits = s.chars().map(c -> c - '0').toArray();

        for (int i = digits.length; i > 2; i--) {
            for (int j = 0; j < i - 1; j++) {
                digits[j] = (digits[j] + digits[j + 1]) % 10;
            }
        }

        return digits[0] == digits[1];
    }
}
