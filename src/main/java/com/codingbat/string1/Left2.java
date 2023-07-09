/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * left2 - codingbat.com/prob/p197720
 * <p>
 * assuming a string sized 2+, rotate left 2
 */
public class Left2 {
    /**
     * substring and concatenate
     * 
     * @param str a string
     * @return rotate left two chars
     */
    public static String solution(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
}
