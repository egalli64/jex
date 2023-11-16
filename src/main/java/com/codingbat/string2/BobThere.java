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
     * Using {@linkplain String#matches(String)} for the pattern: any char 0+ times,
     * 'b', any char exactly once, 'b', any char 0+ times.
     *
     * @param str a string
     * @return true for success
     */
    public static boolean stringMatches(String str) {
        return str.matches(".*b.b.*");
    }

    /**
     * Using {@linkplain Pattern#matches(String, CharSequence)} to match the passed
     * string for the pattern: any char 0+ times, 'b', any char exactly once, 'b',
     * any char 0+ times.
     *
     * @param str a string
     * @return true for success
     */
    public static boolean patternMatches(String str) {
        return Pattern.matches(".*b.b.*", str);
    }

    /**
     * Find anywhere on the input string the regular expression "b.b"
     * <li>Compile the pattern "b.b"
     * <li>Create a matcher for it against the passed string
     * <li>Check if the matcher find the pattern in the string
     *
     * @param str a string
     * @return true for success
     */
    public static boolean patternMatcherFind(String str) {
        return Pattern.compile("b.b").matcher(str).find();
    }
}
