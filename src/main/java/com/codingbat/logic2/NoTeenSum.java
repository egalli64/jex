/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

/**
 * noTeenSum - https://codingbat.com/prob/p182879
 * <p>
 * Add up all the values passed, but [13, 14] and [17, 19] count as 0
 */
public class NoTeenSum {
    /**
     * Delegate to {@linkplain NoTeenSum#fixTeen(int)} the conversion of each
     * parameter, then sum them up
     *
     * @param a first age
     * @param b second age
     * @param c third age
     * @return the adjusted sum
     */
    public static int solution(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    /**
     * Helper for {@linkplain NoTeenSum#solution(int, int, int)}
     * <p>
     * Convert the passed value to 0 if in [14..19] but it is not 15 nor 16
     *
     * @param n an age
     * @return n or zero
     */
    static int fixTeen(int n) {
        return n < 13 || n == 15 || n == 16 || n > 19 ? n : 0;
    }

    /**
     * Convert the passed value to 0 if in [14..19] but it is not 15 nor 16
     *
     * @param n an age
     * @return n or zero
     */
    static int fixTeenVerbose(int n) {
        if (n < 13 || n > 19) {
            return n;
        } else if (n == 15 || n == 16) {
            return n;
        } else {
            return 0;
        }
    }
}
