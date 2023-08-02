/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * factorial - https://codingbat.com/prob/p154669
 * <p>
 * Calculate recursively the factorial of a non-negative integer
 */
public class Factorial {
    /**
     * Base case: if n is 0 or 1, its factorial is 1. It is not required by the
     * problem to manage negative input.
     * <p>
     * Recursive call: return the product of n for the factorial of n-1
     *
     * @param n a (small) non-negative int
     * @return n!
     */
    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
