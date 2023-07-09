/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * nonStart - codingbat.com/prob/p143825
 * <p>
 * assuming two not empty strings, concatenate them keeping out their first char
 */
public class NonStart {
    /**
     * substring and then concatenate
     *
     * @param a a non-empty string
     * @param b a non-empty string
     * @return a concatenation of the two input strings, but their first char
     */
    public static String solution(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
