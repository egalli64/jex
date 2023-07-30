/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * old35 - https://codingbat.com/prob/p159612
 * <p>
 * Check if a value is a multiple of 3 or 5, but not both
 */
public class Old35 {
    /**
     * Modulo 3 exclusive or modulo 5
     * 
     * @param n non-negative
     * @return true if multiple of 3 or 5, not both
     */
    public static boolean solution(int n) {
        return n % 3 == 0 ^ n % 5 == 0;
    }

    /**
     * Modulo 3 and not modulo 5, or not modulo 3 and modulo 5
     * 
     * @param n non-negative
     * @return true if multiple of 3 or 5, not both
     */
    public static boolean verbose(int n) {
        return n % 3 == 0 && n % 5 != 0 || n % 3 != 0 && n % 5 == 0;
    }
}
