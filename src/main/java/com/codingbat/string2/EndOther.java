/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import java.util.regex.Pattern;

/**
 * endOther - https://codingbat.com/prob/p126880
 * <p>
 * Check if one of the two passed strings is a case insensitive substring of the
 * other, matching with its end.
 */
public class EndOther {
    /**
     * Convert both strings to lower, determine which one is the shorter (or same
     * size) and which is the non-shorter one. Cut the second so to compare them.
     *
     * @param a first
     * @param b second
     * @return true for success
     */
    public static boolean solution(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        String shorter = a.length() <= b.length() ? a : b;
        String other = a.length() > b.length() ? a : b;
        String sub = other.substring(other.length() - shorter.length());

        return shorter.equals(sub);
    }

    /**
     * Find on the matcher on the longer input string built on the pattern
     * determined by the regular expression: case insensitive shorter input string
     * at the end.
     *
     * @param a first
     * @param b second
     * @return true for success
     */
    public static boolean matching(String a, String b) {
        String shorter = a.length() <= b.length() ? a : b;
        String longer = a.length() > b.length() ? a : b;
        String regex = String.format("(?i)%s$", shorter);

        return Pattern.compile(regex).matcher(longer).find();
    }
}
