/*
 * 8. String to Integer (atoi) - https://leetcode.com/problems/string-to-integer-atoi/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * The input string contains: English letters, digits, ' ', '+', '-', '.'
 * <p>
 * Algorithm:
 * 
 * <ol>
 * <li>Ignore any leading whitespace
 * <li>The next character could be '-' or '+'. The result is positive by default
 * <li>Read characters until the next non-digit character or the end of the
 * input is reached. The rest of the string is ignored
 * <li>Convert the digits into an integer (i.e. "123" -> 123, "0032" -> 32). If
 * no digits were read, then the integer is 0. Change the sign as necessary
 * <li>If the integer is out of the 32-bit signed integer range [-2^31, 2^31 -
 * 1], then clamp the integer so that it remains in the range. Specifically,
 * integers less than -2^31 should be clamped to -2^31, and integers greater
 * than 2^31 - 1 should be clamped to 2^31 - 1.
 * <li>Return the integer as the final result.
 */
public class StringToInteger {
    /**
     * Something like atoi()
     * 
     * @param s a string with length in [0..200]
     * @return the integer extracted from input
     */
    public int myAtoi(String s) {
        int i = 0;

        // 1
        while (i < s.length() && s.charAt(i) == ' ') {
            i += 1;
        }

        // 2
        if (i == s.length()) {
            return 0;
        }

        int sign = 1;
        char cur = s.charAt(i);
        if (cur == '-') {
            sign = -1;
            i += 1;
        } else if (cur == '+') {
            i += 1;
        }

        // 3 and 4
        if (i == s.length()) {
            return 0;
        }

        long result = 0;

        while (i < s.length()) {
            cur = s.charAt(i);
            if (result > Integer.MAX_VALUE || !Character.isDigit(cur)) {
                break;
            } else {
                result *= 10;
                result += cur - '0';

                i += 1;
            }
        }

        result *= sign;

        // 5
        result = Math.min(result, Integer.MAX_VALUE);
        result = Math.max(result, Integer.MIN_VALUE);

        // 6
        return (int) result;
    }
}
