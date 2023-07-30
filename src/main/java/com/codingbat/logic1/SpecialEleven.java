/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * specialEleven - https://codingbat.com/prob/p100962
 * <p>
 * check if the passed integer is a multiple of 11, or one more than that
 */
public class SpecialEleven {
    /**
     * Modulo operator
     * 
     * @param n a non-negative value
     * @return true if multiple of 11 (or plus 1)
     */
    public static boolean solution(int n) {
        return n % 11 <= 1;
    }
}
