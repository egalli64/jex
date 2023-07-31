/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * nearTen - https://codingbat.com/prob/p193613
 * <p>
 * Check if a number is close (max 2) to a multiple of 10, e.g.: [8 .. 12]
 */
public class NearTen {
    /**
     * Check interval around modulo ten
     * 
     * @param num a non-negative number
     * @return true if it is within 2 of a multiple of 10
     */
    public static boolean solution(int num) {
        int checked = num % 10;
        return checked >= 8 || checked <= 2;
    }
}
