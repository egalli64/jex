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
     * check by charAt()
     * 
     * @param str a string
     * @return true if it begins by ".ix"
     */
    public static boolean byChar(String str) {
        return str.length() > 2 && str.charAt(1) == 'i' && str.charAt(2) == 'x';
    }

    /**
     * check by substring()
     * 
     * @param str a string
     * @return true if it begins by ".ix"
     */
    public static boolean sub(String str) {
        return str.length() > 2 && str.substring(1, 3).equals("ix");
    }

    /**
     * check by indexOf()
     * 
     * @param str a string
     * @return true if it begins by ".ix"
     */
    public static boolean index(String str) {
        return str.indexOf("ix") == 1;
    }

    /**
     * check by regular expression
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
