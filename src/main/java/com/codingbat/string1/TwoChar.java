/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * twoChar - https://codingbat.com/prob/p144623
 * <p>
 * Generate and return a string sized two from the passed one. Use the passed
 * index, if possible, otherwise start from zero. Assume the string is sized 2+
 */
public class TwoChar {
    /**
     * String::substring
     * 
     * @param str   a string sized 2+
     * @param index an integer
     * @return a string length 2 from the given index, or the first 2 chars
     */
    public static String solution(String str, int index) {
        if (index < 0 || index > str.length() - 2) {
            index = 0;
        }
        return str.substring(index, index + 2);
    }
}
