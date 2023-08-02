/**
 * https://codingbat.com/java/Logic-1
 */
package com.codingbat;

public class Logic1 {
    /**
     * codingbat.com/prob/p153748
     * 
     * @param a [10..99]
     * @param b [10..99]
     * @return true if same digit appears in both numbers
     */
    public static boolean shareDigit(int a, int b) {
        int[] as = { a % 10, a / 10 };
        int[] bs = { b % 10, b / 10 };
        return as[0] == bs[0] || as[1] == bs[0] || as[0] == bs[1] || as[1] == bs[1];
    }

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
