/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * makes10 - codingbat.com/prob/p182873
 * <p>
 * Check if at least one parameter is 10 or if their sum is 10
 */
public class Makes10 {
    /**
     * One liner
     * 
     * @param a first value
     * @param b second value
     * @return true if one if them is 10 or if their sum is 10
     */
    public static boolean plain(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    /**
     * Exposing full details
     * 
     * @param a first value
     * @param b second value
     * @return true if one if them is 10 or if their sum is 10
     */
    public static boolean verbose(int a, int b) {
        if (a == 10) {
            return true;
        } else if (b == 10) {
            return true;
        } else if (a + b == 10) {
            return true;
        }
        return false;
    }
}
