/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * front22 - codingbat.com/prob/p183592
 * <p>
 * Add the first 2 char (when available) to begin and end
 */
public class Front22 {
    /**
     * Get the tag as a substring and concatenate it
     * 
     * @param str a possibly empty string
     * @return a variation on the input string
     */
    public static String solution(String str) {
        int len = Math.min(str.length(), 2);
        String tag = str.substring(0, len);
        return tag + str + tag;
    }
}
