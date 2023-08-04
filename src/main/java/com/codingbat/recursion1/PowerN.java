/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * powerN - https://codingbat.com/prob/p158888
 * <p>
 * Given a base and an exponent, both at least 1, calculate recursively the
 * required power
 */
public class PowerN {
    /**
     * Base cases: if n is 1, the result is the base itself
     * <p>
     * Recursive part: multiply the base for the recursion on the same base with
     * exponent reduced by 1
     *
     * @param base 1+
     * @param n    1+
     * @return base ^ n
     */
    public static int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }
}
