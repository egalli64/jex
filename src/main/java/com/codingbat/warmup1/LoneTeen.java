/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * loneTeen - codingbat.com/prob/p165701
 * <p>
 * Check if exactly one parameter is in range 13..19 inclusive
 */
public class LoneTeen {
    /**
     * Xor for calling {@linkplain LoneTeen#isTeen(int)} on both parameters
     * 
     * @param a first value
     * @param b second value
     * @return return true if only one is in [13 .. 19]
     */
    public static boolean solution(int a, int b) {
        return isTeen(a) ^ isTeen(b);
    }

    /**
     * Count teens calling {@linkplain LoneTeen#isTeen(int)} on both parameters
     * 
     * @param a first value
     * @param b second value
     * @return return true if only one is in [13 .. 19]
     */
    public static boolean verbose(int a, int b) {
        int count = isTeen(a) ? 1 : 0;
        if (isTeen(b)) {
            count += 1;
        }
        return count == 1;
    }

    /**
     * Helper for:
     * <li>{@linkplain LoneTeen#solution(int, int)}
     * <li>{@linkplain LoneTeen#verbose(int, int)}
     * 
     * @param value a value
     * @return true if the input value is in [13..19]
     */
    static boolean isTeen(int value) {
        return value > 12 && value < 20;
    }
}
