/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * theEnd - codingbat.com/prob/p162477
 * <p>
 * assuming a non-empty string, return a one-char string (front or back)
 */
public class TheEnd {
    /**
     * substring
     *
     * @param str   a non-empty string
     * @param front true for begin, false for back
     * @return a string containing just the first or last char from input
     */
    public static String solution(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }
}
