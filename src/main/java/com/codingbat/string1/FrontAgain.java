/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * frontAgain - https://codingbat.com/prob/p196652
 * <p>
 * check if the first two chars in the input string are repeated at its end
 */
public class FrontAgain {
    /**
     * Compare chars
     * 
     * @param str a string
     * @return true if the first 2 chars are also at the end
     */
    public static boolean solution(String str) {
        int len = str.length();
        if (len < 2) {
            return false;
        }
        return str.charAt(0) == str.charAt(len - 2) && str.charAt(1) == str.charAt(len - 1);
    }

    /**
     * Compare substrings
     * 
     * @param str a string
     * @return true if the first 2 chars are also at the end
     */
    public static boolean subCompare(String str) {
        int len = str.length();
        if (len < 2) {
            return false;
        }
        return str.substring(0, 2).equals(str.substring(len - 2));
    }

    /**
     * String::endsWith
     * 
     * @param str a string
     * @return true if the first 2 chars are also at the end
     */
    public static boolean oneLiner(String str) {
        return str.length() < 2 ? false : str.endsWith(str.substring(0, 2));
    }
}
