/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * makeAbba - codingbat.com/prob/p147483
 * <p>
 * make HTML tags concatenating strings
 */
public class MakeTags {
    /**
     * Overloaded + operator for String
     * 
     * @param tag  the tag name
     * @param word the element content
     * @return the element
     */
    public static String solution(String tag, String word) {
        return "<" + tag + '>' + word + "</" + tag + '>';
    }
}
