/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * nTwice - https://codingbat.com/prob/p174148
 * <p>
 * Given a string and an integer n (assume it won't be bigger than string
 * length):
 * <li>create two substring with the first/last n chars
 * <li>concatenate the two substrings and return the result
 */
public class NTwice {
    /**
     * String::substring
     * 
     * @param str a string size n+
     * @param n   a non-negative integer
     * @return the first and last n chars
     */
    public static String solution(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
