/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * more20 - https://codingbat.com/prob/p118290
 * <p>
 * Check if a value is a multiple of 20 plus one or two
 */
public class More20 {
    /**
     * Get the input modulo 20, check if it is 1 or 2
     * 
     * @param n a non-negative number
     * @return true if n is a "more20" value
     */
    public static boolean solution(int n) {
        int checked = n % 20;
        return checked == 1 || checked == 2;
    }
}
