/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * conCat - https://codingbat.com/prob/p132118
 * <p>
 * Concatenate two strings, but discarding a connecting char, if it is the same
 * on the other side
 */
public class ConCat {
    /**
     * Concatenation and substring
     * 
     * @param a first string, possibly empty
     * @param b second string, possibly empty
     * @return concatenated string, with no duplicated char in the middle
     */
    public static String solution(String a, String b) {
        if (a.isEmpty() || b.isEmpty() || a.charAt(a.length() - 1) != b.charAt(0)) {
            return a + b;
        }
        return a + b.substring(1);
    }
}
