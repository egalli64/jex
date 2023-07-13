/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * seeColor - https://codingbat.com/prob/p199216
 * <p>
 * Return "red" or "blue" if the input string starts that way, otherwise ""
 */
public class SeeColor {
    /**
     * for loop
     * 
     * @param str a possibly empty string
     * @return "red", "blue", or "", accordingly to the starting tag
     */
    public static String solution(String str) {
        String[] tags = { "red", "blue" };
        for (String tag : tags) {
            if (str.startsWith(tag)) {
                return tag;
            }
        }
        return "";
    }

    /**
     * if - else if - else
     * 
     * @param str a possibly empty string
     * @return "red", "blue", or "", accordingly to the starting tag
     */
    public static String linearCheck(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
