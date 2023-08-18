/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * repeatEnd - https://codingbat.com/prob/p152339
 * <p>
 * Generate a new string repeating n times the last n chars of the passed
 * string. It is caller responsibility to pass an n, in [0, string.length()]
 */
public class RepeatEnd {
    /**
     * Extract the last n chars from the input string, append it n time to a string
     * builder, then return it as string.
     *
     * @param str a string
     * @param n   a number
     * @return The generated string
     */
    public static String solution(String str, int n) {
        StringBuilder result = new StringBuilder();

        String tag = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            result.append(tag);
        }

        return result.toString();
    }

    /**
     * Java 11 not supported by CodingBat
     *
     * @param str a string
     * @param n   a number
     * @return The generated string
     */
    public static String unsupported(String str, int n) {
        return str.substring(str.length() - n).repeat(n);
    }
}
