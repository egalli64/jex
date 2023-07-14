/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * without2 - https://codingbat.com/prob/p142247
 * <p>
 * cut out the first two input chars, if they are repeated at end
 */
public class Without2 {
    /**
     * compare chars, substring if required
     * 
     * @param str a possibly empty string
     * @return cut the 2 starting chars, if they are also at the end
     */
    public static String verbose(String str) {
        if (str.length() < 2 //
                || str.charAt(0) != str.charAt(str.length() - 2) //
                || str.charAt(1) != str.charAt(str.length() - 1)) {
            return str;
        }
        return str.substring(2);
    }

    /**
     * String::endsWith() and substring
     * 
     * @param str a possibly empty string
     * @return cut the 2 starting chars, if they are also at the end
     */
    public static String solution(String str) {
        if (str.length() < 2 || !str.endsWith(str.substring(0, 2))) {
            return str;
        }
        return str.substring(2);
    }
}
