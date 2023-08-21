/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

/**
 * closeFar - https://codingbat.com/prob/p138990
 * <p>
 * Check if one value between b and c is close to a (equal or +/- 1), while the
 * other is far from both the other two ones (2 or more).
 */
public class CloseFar {
    /**
     * Delegate the close/far check to {@linkplain CloseFar#isClose(int, int)} and
     * {@linkplain CloseFar#isFar(int, int, int)}
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if acceptable
     */
    public static boolean solution(int a, int b, int c) {
        return isClose(b, a) && isFar(c, a, b) || isClose(c, a) && isFar(b, a, c);
    }

    /**
     * Helper for {@linkplain CloseFar#solution(int, int, int)}
     * <p>
     * Check if the passed value has a distance less than 2 from the target
     * 
     * @param value  a value
     * @param target the target
     * @return true if value is close to target
     */
    static boolean isClose(int value, int target) {
        return Math.abs(value - target) < 2;
    }

    /**
     * Helper for {@linkplain CloseFar#solution(int, int, int)}
     * <p>
     * Check if the passed value has a distance greater than 1 from both the targets
     * 
     * @param value  a value
     * @param first  the first target
     * @param second the second target
     * @return true if the value is far
     */
    static boolean isFar(int value, int first, int second) {
        return Math.abs(value - first) > 1 && Math.abs(value - second) > 1;
    }
}
