/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * firstHalf - codingbat.com/prob/p172267
 * <p>
 * assuming an even sized input, get its first half
 */
public class FirstHalf {
    /**
     * String::substring
     *
     * @param str a string even sized
     * @return the str first half
     */
    public static String solution(String str) {
        return str.substring(0, str.length() / 2);
    }
}
