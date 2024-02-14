/*
 * LeetCode 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * To make things more difficult, assume the environment does not allow you to
 * store 64-bit integers (signed or unsigned)
 */
public class ReverseInteger {
    /**
     * Reverse the passed integer
     * 
     * @param x a signed integer
     * @return reversed x, or 0 if out of bound
     */
    public int reverse(int x) {
        int result = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while (x > 0) {
            try {
                result = Math.multiplyExact(result, 10);
                result = Math.addExact(result, x % 10);
            } catch (ArithmeticException ex) {
                return 0;
            }
            x /= 10;
        }

        return sign * result;
    }
}
