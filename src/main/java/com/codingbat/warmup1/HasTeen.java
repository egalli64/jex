/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * hasTeen - codingbat.com/prob/p178986
 * <p>
 * Check if at least a parameter is in range 13..19 inclusive
 */
public class HasTeen {
    /**
     * The actual job is delegated to {@linkplain HasTeen#isTeen(int)}
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if an input value (or more) are in [13..19]
     */
    public static boolean solution(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    /**
     * Helper for {@linkplain HasTeen#solution(int, int, int)}
     * 
     * @param value a value
     * @return true if the input value is in [13..19]
     */
    static boolean isTeen(int value) {
        return value > 12 && value < 20;
    }
}
