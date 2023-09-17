/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * count8 - https://codingbat.com/prob/p192383
 * <p>
 * Given a non negative integer, count the number of 8 among its digits (base
 * 10). But, each 8 that has another 8 to its left counts for 2.
 */
public class Count8 {
    /**
     * Base cases: n less than 8 leads to zero
     * <p>
     * Recursive part:
     * <li>Initialize a count to 1 if the last digit is 8, otherwise 0.
     * <li>If the last two digits are 88 add 1 to the counter.
     * <li>Recurse for the input number divided by 10, getting rid of last digit.
     *
     * @param n non-negative
     * @return number of 8, with a twist
     */
    public static int count8(int n) {
        if (n < 8) {
            return 0;
        }

        int count = n % 10 == 8 ? 1 : 0;
        if (n % 100 == 88) {
            count = 2;
        }

        return count + count8(n / 10);
    }
}
