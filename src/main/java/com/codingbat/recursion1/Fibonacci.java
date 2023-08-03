/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * fibonacci - https://codingbat.com/prob/p120015
 * <p>
 * Calculate recursively the Fibonacci number
 * 
 * <pre>
 * 0, 1, 2, 3, 4, 5, 6,  7,  8, ...
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * </pre>
 */
public class Fibonacci {
    /**
     * Base cases:
     * <li>(no need to check for negatives)
     * <li>Fibonacci(0) is zero
     * <li>Fibonacci(1) and Fibonacci(2) are 1
     * <p>
     * Recursive call: Fibonacci(n) is Fibonacci(n-2) + Fibonacci(n-1)
     *
     * @param n non-negative
     * @return the associated Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
