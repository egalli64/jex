/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * lessBy10 - https://codingbat.com/prob/p179196
 * <p>
 * Check if at least a couple of input values is distanced by 10 or more.
 */
public class LessBy10 {
    /**
     * Delegate to {@linkplain LessBy10#distanced(int, int)} the actual check
     * between couples. Then OR the results.
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if one is 10+ distant from another one
     */
    public static boolean solution(int a, int b, int c) {
        return distanced(a, b) || distanced(b, c) || distanced(a, c);
    }

    /**
     * Helper for {@linkplain LessBy10#solution(int, int, int)}. Check if the
     * distance between input values is at least 10
     * 
     * @param left  first value
     * @param right second value
     * @return true if distance is 10+
     */
    static boolean distanced(int left, int right) {
        return Math.abs(left - right) >= 10;
    }
}
