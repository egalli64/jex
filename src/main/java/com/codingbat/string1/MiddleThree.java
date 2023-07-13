/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * middleThree - codingbat.com/prob/p115863
 * <p>
 * assuming the input string has odd length (3+), return the 3 central chars
 */
public class MiddleThree {
    /**
     * codingbat.com/prob/p115863
     * 
     * @param str a string
     * @return the three central chars
     */
    public static String solution(String str) {
        int begin = str.length() / 2 - 1;
        return str.substring(begin, begin + 3);
    }
}
