/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * endsLy - codingbat.com/prob/p103895
 * <p>
 * check if the passed string ends with "ly"
 */
public class EndsLy {
    /**
     * implementing the functionality from scratch
     *
     * @param str a possibly empty string
     * @return true if it ends in "ly"
     */
    public static boolean solution(String str) {
        final int len = str.length();
        return len > 1 && str.charAt(len - 2) == 'l' && str.charAt(len - 1) == 'y';
    }

    /**
     * delegate to String::endsWith()
     *
     * @param str a possibly empty string
     * @return true if it ends in "ly"
     */
    public static boolean endsWith(String str) {
        return str.endsWith("ly");
    }

    /**
     * delegate to String::startsWith() with offset
     *
     * @param str a possibly empty string
     * @return true if it ends in "ly"
     */
    public static boolean startsWith(String str) {
        return str.startsWith("ly", str.length() - 2);
    }
}
