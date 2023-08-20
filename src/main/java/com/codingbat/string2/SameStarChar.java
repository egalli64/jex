/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * sameStarChar - https://codingbat.com/prob/p194491
 * <p>
 * Check if every '*' that has a left and right char in the passed string, is
 * between two copies of the same char
 */
public class SameStarChar {
    /**
     * Check all the triplets in the string having a '*' as middle element
     *
     * @param str a string
     * @return true if accepted
     */
    public static boolean solution(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
