/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * posNeg - codingbat.com/prob/p159227
 * <p>
 * Accordingly to the third argument, check if both are negative or alternate
 */
public class PosNeg {
    /**
     * Check by if / else
     * 
     * @param a        first value
     * @param b        second value
     * @param negative flag
     * @return true
     *         <li>if one is negative and the other positive
     *         <li>both are negative and the flag is true
     */
    public static boolean plain(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return a >= 0 && b < 0 || a < 0 && b >= 0;
        }
    }

    /**
     * Check by ternary operator
     * 
     * @param a        first value
     * @param b        second value
     * @param negative flag
     * @return true
     *         <li>if one is negative and the other positive
     *         <li>both are negative and the flag is true
     */
    public static boolean oneLiner(int a, int b, boolean negative) {
        return negative ? a < 0 && b < 0 : a >= 0 && b < 0 || a < 0 && b >= 0;
    }
}
