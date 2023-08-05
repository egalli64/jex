/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * count7 - https://codingbat.com/prob/p101409
 * <p>
 * Given a non negative integer, count the number of 7 among its digits (base
 * 10)
 */
public class Count7 {
    /**
     * Base cases: n less than 7 leads to zero
     * <p>
     * Recursive call: Get the last digit (by modulo 10), set the count to 1 if the
     * digit is 7, otherwise the counter is 0. Return the found count added to a
     * recursive call for the input number divided by 10 (to get rid of the last
     * digit)
     *
     * @param n non-negative
     * @return number of 7 in n (as decimal integer)
     */
    public static int count7(int n) {
        if (n < 7) {
            return 0;
        }

        int count = n % 10 == 7 ? 1 : 0;
        return count + count7(n / 10);
    }
}
