/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * minCat - https://codingbat.com/prob/p105745
 * <p>
 * Make the two passed strings of the same size, cutting the head of the longest
 * one, then concatenate them and return the result
 */
public class MinCat {
    /**
     * substring and concatenate
     * 
     * @param a left, possibly empty, string
     * @param b right, possibly empty, string
     * @return minimized concatenation
     */
    public static String solution(String a, String b) {
        int len = Math.min(a.length(), b.length());
        return a.substring(a.length() - len) + b.substring(b.length() - len);
    }

    /**
     * substring and concatenate
     * 
     * @param a left, possibly empty, string
     * @param b right, possibly empty, string
     * @return minimized concatenation
     */
    public static String verbose(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA > lenB) {
            return a.substring(lenA - lenB) + b;
        } else {
            return a + b.substring(lenB - lenA);
        }
    }
}
