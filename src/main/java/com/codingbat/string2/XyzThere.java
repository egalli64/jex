/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import java.util.regex.Pattern;

/**
 * xyzThere - https://codingbat.com/prob/p136594
 * <p>
 * Check if the passed string contains "xyz" _not_ prefixed by '.'
 */
public class XyzThere {
    /**
     * If the string starts with the pattern, return success. Otherwise use
     * String::indexOf and ensure the previous char is _not_ a '.'
     *
     * @param str a string
     * @return true for success
     */
    public static boolean solution(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }

        int pos = 0;
        while ((pos = str.indexOf("xyz", pos + 1)) != -1) {
            if (str.charAt(pos - 1) != '.') {
                return true;
            }
        }

        return false;
    }

    /**
     * Match the string against a pattern that accepts "xyz" (1) at the beginning,
     * (2) everywhere else, but only if the previous char is _not_ a '.'
     *
     * @param str a string
     * @return true for success
     */
    public static boolean unsupported(String str) {
        return Pattern.compile("^xyz|[^.]xyz").matcher(str).find();
    }
}
