/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * sumDigits - https://codingbat.com/prob/p163932
 * <p>
 * Given a non negative integer, calculate recursively the sum of its digits
 * (base 10)
 */
public class SumDigits {
    /**
     * Base cases: single digit, result is the same value
     * <p>
     * Recursive call: Get the last digit (by modulo 10) and add it to a call for
     * the number divided by 10 (removing in this way the last digit)
     *
     * @param n non-negative
     * @return sum of digits
     */
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + sumDigits(n / 10);
    }
}
