/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * sumDouble - codingbat.com/prob/p181646
 * <p>
 * Add the two input values, with a possible doubling
 */
public class SumDouble {
    /**
     * Plain
     * 
     * @param a first value
     * @param b second value
     * @return the values sum, doubled if they are same
     */
    public static int plain(int a, int b) {
        return (a + b) * (a == b ? 2 : 1);
    }

    /**
     * Exposing full details
     * 
     * @param a first value
     * @param b second value
     * @return the values sum, doubled if they are same
     */
    public static int verbose(int a, int b) {
        int result = a + b;
        if (a == b) {
            result *= 2;
        }
        return result;
    }
}
