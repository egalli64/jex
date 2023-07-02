/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * nearHundred - codingbat.com/prob/p184004
 * <p>
 * Check if a value is close to 100 or 200
 */
public class NearHundred {
    /**
     * Check interval
     *
     * @param n an integer
     * @return true if n distance to 100 or 200 is within 10
     */
    public static boolean isInRange(int n) {
        return n >= 90 && n <= 110 || n >= 190 && n <= 210;
    }

    /**
     * Check distance
     *
     * @param n an integer
     * @return true if n distance to 100 or 200 is within 10
     */
    public static boolean isClose(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }
}
