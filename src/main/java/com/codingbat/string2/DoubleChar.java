/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * doubleChar - https://codingbat.com/prob/p165312
 * <p>
 * Generate a string where each char in the original one is duplicated
 */
public class DoubleChar {
    /**
     * Use a string builder as helper, append each char in the input string two
     * times in it.
     *
     * @param str a string
     * @return copy of str, where each char is duplicated
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            result.append(cur).append(cur);
        }

        return result.toString();
    }
}
