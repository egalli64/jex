/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * lastDigit - codingbat.com/prob/p125339
 * <p>
 * Check if the two parameters have the same modulo
 */
public class LastDigit {
    /**
     * Compare the result of applying the operator %
     * 
     * @param a first non-negative value
     * @param b second non-negative value
     * @return true if they have the same last digit
     */
    public static boolean solution(int a, int b) {
        return a % 10 == b % 10;
    }
}
