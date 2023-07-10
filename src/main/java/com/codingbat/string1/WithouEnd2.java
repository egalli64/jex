/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * withouEnd2 - codingbat.com/prob/p174254
 * <p>
 * cut out first and last char from the passed string, beware of short input!
 */
public class WithouEnd2 {
    /**
     * substring (or empty string)
     * 
     * @param str a possibly empty string
     * @return cut first and last, when available
     */
    public static String solution(String str) {
        return str.length() < 3 ? "" : str.substring(1, str.length() - 1);
    }
}
