/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * frontBack - codingbat.com/prob/p123384
 * <p>
 * swap first / last char
 */
public class FrontBack {
    /**
     * Substring of the body, swap head and tail
     * 
     * @param str a possibly empty string
     * @return swap first / last char
     */
    public static String solution(String str) {
        if (str.length() < 2) {
            return str;
        }

        final int last = str.length() - 1;
        return str.charAt(last) + str.substring(1, last) + str.charAt(0);
    }
}
