/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * mixString - https://codingbat.com/prob/p125185
 * <p>
 * Generate a new string as a mix from the passed ones, one char for each,
 * leftover as tail
 */
public class MixString {
    /**
     * Loop on the first part of both strings, up to the size of the shortest one,
     * appending their chars in a buffer, then append the tail from the longest one
     *
     * @param a first
     * @param b second
     * @return mix from input
     */
    public static String solution(String a, String b) {
        StringBuilder result = new StringBuilder();

        final int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }

        String longest = a.length() > b.length() ? a : b;
        result.append(longest.substring(len));

        return result.toString();
    }
}
