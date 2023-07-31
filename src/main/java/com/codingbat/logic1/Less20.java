/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * less20 - https://codingbat.com/prob/p133158
 * <p>
 * Check if a value is a multiple 20 minus 1 or 2 (e.g.: 18 or 19)
 */
public class Less20 {
    /**
     * Use modulo
     * 
     * @param n non-negative
     * @return true if n plus 1 or 2 is a multiple of 20
     */
    public static boolean solution(int n) {
        return n % 20 >= 18;
    }
}
