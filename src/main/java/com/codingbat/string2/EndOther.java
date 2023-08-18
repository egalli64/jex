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
     * Package java.util.regex is not (currently) supported in CodingBat
     *
     * @param a first
     * @param b second
     * @return true for success
     */
    public static boolean unsupported(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() < b.length()) {
            return Pattern.compile(a).matcher(b).find();
        } else {
            return Pattern.compile(b).matcher(a).find();
        }
    }
}
