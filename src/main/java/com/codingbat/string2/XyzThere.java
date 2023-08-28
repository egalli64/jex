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
     * Delegate the pattern matching to {@linkplain XyzThere#checkXyz(String, int)}.
     * If the string starts with the pattern, return success. Otherwise check the
     * pattern and ensure the previous char is _not_ a '.'
     * 
     * @param str a string
     * @return true for success
     */
    public static boolean solution(String str) {
        if (str.length() >= 3 && checkXyz(str, 0)) {
            return true;
        }

        for (int i = 1; i < str.length() - 2; i++) {
            if (checkXyz(str, i) && str.charAt(i - 1) != '.') {
                return true;
            }
        }

        return false;
    }

    /**
     * Helper for {@linkplain XyzThere#solution(String)}
     * <p>
     * Check if the string contains "xyz" at its i position, if there is no room, it
     * throws an exception!
     * 
     * @param s a string
     * @param i index in the string
     * @return true when succeed
     * @apiNote precondition: s and i should be "good"
     */
    static boolean checkXyz(String s, int i) {
        return s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z';
    }

    /**
     * If the string starts with the pattern, return success. Otherwise use
     * {@linkplain String#indexOf(String, int))} and ensure the previous char is
     * _not_ a '.'
     *
     * @param str a string
     * @return true for success
     */
    public static boolean byIndexOf(String str) {
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
    public static boolean match(String str) {
        return Pattern.compile("^xyz|[^.]xyz").matcher(str).find();
    }
}
