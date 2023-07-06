/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * endUp - codingbat.com/prob/p125268
 * <p>
 * Build a copy with the last 3 chars (or less) to upper
 */
public class EndUp {
    /**
     * Use Math::min() to ensure the tail is no longer than the string itself
     * 
     * @param str a possibly empty string
     * @return tail-upped clone
     */
    public static String solution(String str) {
        int pos = str.length() - Math.min(3, str.length());
        return str.substring(0, pos) + str.substring(pos).toUpperCase();
    }
}
