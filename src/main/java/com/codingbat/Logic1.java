/**
 * https://codingbat.com/java/Logic-1
 */
package com.codingbat;

public class Logic1 {
    /**
     * codingbat.com/prob/p118077
     * 
     * @param a non-negative
     * @param b non-negative
     * @return the sum, if in the same magnitude of a; else a
     */
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        return countDigit(a) == countDigit(sum) ? sum : a;
    }

    /**
     * Helper for {@linkplain Logic1#sumLimit(int, int)}
     * 
     * @param value non-negative
     * @return the number of digits
     */
    private static int countDigit(int value) {
        int count = 0;
        while (value > 0) {
            value /= 10;
            count += 1;
        }
        return count;
    }
}
