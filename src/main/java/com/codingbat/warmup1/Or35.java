/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * or35 - codingbat.com/prob/p112564
 * <p>
 * Check if the passed value is a multiple of 3 or 5
 */
public class Or35 {
    /**
     * Just check the modulo
     * 
     * @param n a non negative number
     * @return if it is a multiple of 3 or 5
     */
    public static boolean solution(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
