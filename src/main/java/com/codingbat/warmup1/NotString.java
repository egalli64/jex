/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * notString - codingbat.com/prob/p191914
 * <p>
 * add prefix "not" but do not double it
 */
public class NotString {
    /**
     * String::startsWith()
     * 
     * @param str a string
     * @return the input prefixed by "not"
     */
    public static String checkByStartWith(String str) {
        String prefix = "not";
        if (str.startsWith(prefix)) {
            return str;
        } else {
            return prefix + " " + str;
        }
    }

    /**
     * Ternary operator
     * 
     * @param str a string
     * @return the input prefixed by "not"
     */
    public static String compact(String str) {
        String prefix = "not";
        return str.startsWith(prefix) ? str : prefix + " " + str;
    }

    /**
     * String::substring()
     * 
     * @param str a string
     * @return the input prefixed by "not"
     */
    public static String checkBySubstring(String str) {
        String prefix = "not";
        if (str.length() < 3 || !str.substring(0, 3).equals(prefix)) {
            return prefix + " " + str;
        } else {
            return str;
        }
    }
}
