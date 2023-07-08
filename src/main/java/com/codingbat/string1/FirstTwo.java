/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * firstTwo - codingbat.com/prob/p163411
 * <p>
 * get the first two char (or less) of input string
 */
public class FirstTwo {
    /**
     * String::substring, Math::min
     * 
     * @param str a possibly empty string
     * @return the first two chars (when available) as string
     */
    public static String solution(String str) {
        return str.substring(0, Math.min(str.length(), 2));
    }
}
