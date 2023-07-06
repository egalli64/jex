/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * everyNth - codingbat.com/prob/p196441
 * <p>
 * Build a copy with the chars in the modulo n positions
 */
public class EveryNth {
    /**
     * Increasing the loop variable by n each time
     * 
     * @param str a non-empty string
     * @param n   1 or more
     * @return the compacted string
     */
    public static String solution(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
