/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * atFirst - https://codingbat.com/prob/p139076
 * <p>
 * Generate a string sized 2, taking the first 2 chars from the parameter,
 * padding with '@' when required
 */
public class AtFirst {
    /**
     * StringBuilder
     * 
     * @param str a possibly empty string
     * @return first 2 chars, with 1 or 2 '@' when required
     */
    public static String solution(String str) {
        int len = Math.min(str.length(), 2);
        StringBuilder result = new StringBuilder(str.substring(0, len));
        for (int i = len; i < 2; i++) {
            result.append('@');
        }
        return result.toString();
    }
}
