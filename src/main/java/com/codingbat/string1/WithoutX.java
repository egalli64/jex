/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * withoutX - https://codingbat.com/prob/p151940
 * <p>
 * copy the input string, but first and last, if 'x' should be removed
 */
public class WithoutX {
    /**
     * substring
     * 
     * @param str a possibly empty string
     * @return string without x at begin and end
     */
    public static String solution(String str) {
        if (str.isEmpty()) {
            return str;
        }

        int begin = str.charAt(0) == 'x' ? 1 : 0;
        int len = str.length();
        int end = len > 1 && str.charAt(len - 1) == 'x' ? len - 1 : len;
        return str.substring(begin, end);
    }
}
