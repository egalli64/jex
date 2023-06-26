/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * diff21 - codingbat.com/prob/p116624
 * Get the absolute difference between n and 21, doubled if n is over 21
 * 
 * My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

public class Diff21 {
    /**
     * One liner
     *
     * @param n an integer
     * @return the absolute difference between n and 21, doubled if n is over 21
     */
    public static int plain(int n) {
        return n <= 21 ? 21 - n : 2 * (n - 21);
    }

    /**
     * Exposing full details
     *
     * @param n an integer
     * @return the absolute difference between n and 21, doubled if n is over 21
     */
    public static int verboseAbs(int n) {
        int result = Math.abs(n - 21);
        if (n > 21) {
            result *= 2;
        }
        return result;
    }

    /**
     * Exposing full details (no call to Math)
     *
     * @param n an integer
     * @return the absolute difference between n and 21, doubled if n is over 21
     */
    public static int verbose(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
}
