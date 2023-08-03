/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * lastTwo - https://codingbat.com/prob/p194786
 * <p>
 * Swap the last two chars in the passed string, when the string is sized 2+
 */
public class LastTwo {
    /**
     * Substring
     * 
     * @param str a possibly empty string
     * @return last two chars, if available, swapped
     */
    public static String solution(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            final int last = str.length() - 1;
            return str.substring(0, last - 1) + str.substring(last) + str.substring(last - 1, last);
        }
    }
}
