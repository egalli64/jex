/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * comboString - codingbat.com/prob/p168564
 * <p>
 * assuming two strings having different size, concatenate them keeping the long
 * one in the middle
 */
public class ComboString {
    /**
     * check length, then concatenate
     * 
     * @param a first string
     * @param b second string
     * @return short+long+short
     */
    public static String solution(String a, String b) {
        String shortOne = a.length() < b.length() ? a : b;
        String longOne = a.length() > b.length() ? a : b;
        return shortOne + longOne + shortOne;
    }
}
