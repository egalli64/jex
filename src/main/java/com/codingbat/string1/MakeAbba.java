/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * makeAbba - codingbat.com/prob/p161056
 * <p>
 * concatenate strings
 */
public class MakeAbba {
    /**
     * Overloaded + operator for String
     * 
     * @param a first string
     * @param b second string
     * @return first + second + second + first
     */
    public static String solution(String a, String b) {
        return a + b + b + a;
    }

    /**
     * StringBuilder
     *
     * @param a first string
     * @param b second string
     * @return first + second + second + first
     */
    public static String builder(String a, String b) {
        return new StringBuilder(a).append(b).append(b).append(a).toString();
    }
}
