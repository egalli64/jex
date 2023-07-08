/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * withoutEnd - codingbat.com/prob/p130896
 * <p>
 * assuming a string sized 2+, cut out both extreme chars
 */
public class WithoutEnd {
    /**
     * By String::substring
     * 
     * @param str a string sized at least 2
     * @return removed first and last
     */
    public static String solution(String str) {
        return str.substring(1, str.length() - 1);
    }
}
