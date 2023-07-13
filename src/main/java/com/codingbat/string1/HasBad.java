/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * hasBad - https://codingbat.com/prob/p139075
 * <p>
 * check if "bad" is in the passed string, in position 0 or 1
 */
public class HasBad {
    /**
     * String::indexOf()
     * 
     * @param str a possibly empty string
     * @return true if "bad" is @ pos 0 or 1
     */
    public static boolean solution(String str) {
        int pos = str.indexOf("bad");
        return pos == 0 || pos == 1;
    }

    /**
     * String::lastIndexOf()
     * 
     * @param str a possibly empty string
     * @return true if "bad" is @ pos 0 or 1
     */
    public static boolean oneLiner(String str) {
        return str.lastIndexOf("bad", 1) > -1;
    }
}
