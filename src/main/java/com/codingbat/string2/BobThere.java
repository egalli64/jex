/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import java.util.regex.Pattern;

/**
 * bobThere - https://codingbat.com/prob/p175762
 * <p>
 * Check if the passed string contains an instance of the pattern "b.b"
 */
public class BobThere {
    /**
     * Check all the triplets in the passed string for the pattern
     *
     * @param str a string
     * @return true for success
     */
    public static boolean solution(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    /**
     * Using String::matches
     *
     * @param str a string
     * @return true for success
     */
    public static boolean simpleRegex(String str) {
        return str.matches(".*b.b.*");
    }

    /**
     * Package java.util.regex is not (currently) supported in CodingBat
     *
     * @param str a string
     * @return true for success
     */
    public static boolean unsupported(String str) {
        return Pattern.compile("b.b").matcher(str).find();
    }
}
