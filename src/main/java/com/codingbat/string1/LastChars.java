/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * lastChars - https://codingbat.com/prob/p138183
 * <p>
 * given two strings, generate a two-char string, joining the first char of the
 * first string with the last one of the second. If a string is empty, use '@'
 * instead.
 */
public class LastChars {
    /**
     * by StringBuilder
     * 
     * @param a first string, possibly empty
     * @param b second string, possibly empty
     * @return two char string, first of a + last of b (@ if missing)
     */
    public static String solution(String a, String b) {
        StringBuilder result = new StringBuilder();
        result.append(a.isEmpty() ? '@' : a.charAt(0));
        result.append(b.isEmpty() ? '@' : b.charAt(b.length() - 1));
        return result.toString();
    }

    /**
     * one (longish) liner by StringBuilder
     * 
     * @param a first string, possibly empty
     * @param b second string, possibly empty
     * @return two char string, first of a + last of b (@ if missing)
     */
    public static String oneLiner(String a, String b) {
        return new StringBuilder().append(a.isEmpty() ? '@' : a.charAt(0)) //
                .append(b.isEmpty() ? '@' : b.charAt(b.length() - 1)) //
                .toString();
    }
}
