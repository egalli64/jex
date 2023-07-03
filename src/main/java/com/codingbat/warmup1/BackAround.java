/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * backAround - codingbat.com/prob/p161642
 * <p>
 * Generate a copy with the last char added at the front and back
 */
public class BackAround {
    /**
     * Get a substring from the last char and concatenate it around
     *
     * @param str a non-empty string
     * @return the adjusted copy
     */
    public static String solution(String str) {
        String tag = str.substring(str.length() - 1);
        return tag + str + tag;
    }
}
