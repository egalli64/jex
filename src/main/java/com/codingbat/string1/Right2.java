/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * right2 - codingbat.com/prob/p130781
 * <p>
 * assuming a string sized 2+, rotate right 2
 */
public class Right2 {
    /**
     * concatenate two substring splitting the passed string
     * 
     * @param str a string
     * @return the last 2 chars moved to the begin
     */
    public static String solution(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
