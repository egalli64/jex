/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * intMax - codingbat.com/prob/p101887
 * <p>
 * The biggest of three
 */
public class IntMax {
    /**
     * By Math::max()
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return the biggest one
     */
    public static int solution(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /**
     * All in the method body
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return the biggest one
     */
    public static int compact(int a, int b, int c) {
        int ab = a > b ? a : b;
        return c > ab ? c : ab;
    }

    /**
     * Basic implementation
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return the biggest one
     */
    public static int verbose(int a, int b, int c) {
        int result = a;
        if (b > result) {
            result = b;
        }
        if (c > result) {
            result = c;
        }
        return result;
    }
}
