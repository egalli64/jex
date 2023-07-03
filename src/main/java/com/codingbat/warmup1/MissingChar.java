/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * missingChar - codingbat.com/prob/p190570
 * <p>
 * remove character in n position
 */
public class MissingChar {
    /**
     * Split the string then splice it
     *
     * @param str a non-empty string
     * @param n   a valid index for the string
     * @return a copy of the original string, less the char at n position
     */
    public static String plain(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    /**
     * Delegate to StringBuilder deleteCharAt()
     *
     * @param str a non-empty string
     * @param n   a valid index for the string
     * @return a copy of the original string, less the char at n position
     */
    public static String deleteCharAt(String str, int n) {
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(n);
        return builder.toString();
    }

    /**
     * Delegate to StringBuilder deleteCharAt()
     *
     * @param str a non-empty string
     * @param n   a valid index for the string
     * @return a copy of the original string, less the char at n position
     */
    public static String oneLiner(String str, int n) {
        return new StringBuilder(str).deleteCharAt(n).toString();
    }
}
