/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * sumLimit - https://codingbat.com/prob/p118077
 * <p>
 * Check if the sum of a and b has the same number of digits of a. If so, return
 * the sum, otherwise a
 */
public class SumLimit {
    /**
     * Generate the sum, ask to {@linkplain SumLimit#digits(int)} the number of
     * digit in it. Compare sum and a size
     * 
     * @param a non-negative
     * @param b non-negative
     * @return the sum, if in the same magnitude of a; else a
     */
    public static int solution(int a, int b) {
        int sum = a + b;
        return digits(a) == digits(sum) ? sum : a;
    }

    /**
     * Helper for {@linkplain SumLimit#solution(int, int)}
     * 
     * @param value non-negative
     * @return the number of digits
     */
    static int digits(int value) {
        int count = 0;
        while (value > 0) {
            value /= 10;
            count += 1;
        }
        return count;
    }

    /**
     * Generate the sum of the two parameters, convert both a and the sum to string,
     * check their size.
     * 
     * @param a non-negative
     * @param b non-negative
     * @return the sum, if in the same magnitude of a; else a
     */
    public static int alternative(int a, int b) {
        int sum = a + b;
        return String.valueOf(a).length() == String.valueOf(sum).length() ? sum : a;
    }
}
