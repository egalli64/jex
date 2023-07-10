/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * middleTwo - codingbat.com/prob/p137729
 * <p>
 * cut out the two central chars of an evenly sized string (2+)
 */
public class MiddleTwo {
    /**
     * substring around middle point
     * 
     * @param str a string of even length, 2+
     * @return the middle two chars
     */
    public static String solution(String str) {
        final int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
    }
}
