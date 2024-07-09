/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * backAround - codingbat.com/prob/p161642
 * <p>
 * Generate a copy with the last char added at the front and back
 * 
 * @apiNote A non-empty string is expected as input 
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

    /**
     * Append in a string builder what required, then convert it to a string
     *
     * @param str a non-empty string
     * @return the adjusted copy
     */
    public static String builderSolution(String str) {
        char last = str.charAt(str.length() - 1);
        return new StringBuilder().append(last).append(str).append(last).toString();
    }
}
