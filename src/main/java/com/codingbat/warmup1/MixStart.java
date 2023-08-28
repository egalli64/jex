/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import java.util.regex.Pattern;

/**
 * mixStart - codingbat.com/prob/p151713
 * <p>
 * Check if a string matches ^.ix
 */
public class MixStart {
    /**
     * check char by char
     * 
     * @param str a string
     * @return true if it begins by ".ix"
     */
    public static boolean byChar(String str) {
        return str.length() >= 3 && str.charAt(1) == 'i' && str.charAt(2) == 'x';
    }

    /**
     * check by {@linkplain String#substring(int, int)}
     * 
     * @param str a string
     * @return true if it begins by ".ix"
     */
    public static boolean sub(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }

    /**
     * check by {@linkplain String#indexOf(String)}
     * 
     * @param str a string
     * @return true if it begins by ".ix"
     */
    public static boolean index(String str) {
        return str.indexOf("ix") == 1;
    }

    /**
     * check by {@linkplain String#lastIndexOf(String, int)}
     * 
     * @param str a string
     * @return true if it begins by ".ix"
     */
    public static boolean lastIndex(String str) {
        return str.lastIndexOf("ix", 1) == 1;
    }

    /**
     * check the regular expression by {@linkplain String#matches(String)}
     * 
     * @param str a string
     * @return true if it begins by "?ix"
     */
    public static boolean simpleMatch(String str) {
        return str.matches("^.ix.*");
    }

    /**
     * check by {@linkplain Pattern#matches(String, CharSequence)} for the pattern:
     * begin with any char followed by "ix".
     * 
     * @param str a string
     * @return true if it begins by ".ix"
     */
    public static boolean match(String str) {
        return Pattern.matches("^.ix.*", str);
    }
}
