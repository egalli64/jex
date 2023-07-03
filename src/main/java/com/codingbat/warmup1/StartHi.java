/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * startHi - codingbat.com/prob/p191022
 * <p>
 * Check if the string starts with "hi"
 */
public class StartHi {
    /**
     * Delegate the job to String::startsWith
     *
     * @param str a possibly empty string
     * @return true if the string starts with "hi"
     */
    public static boolean startsWith(String str) {
        return str.startsWith("hi");
    }

    /**
     * Explicit check on the first two chars
     *
     * @param str a possibly empty string
     * @return true if the string starts with "hi"
     */
    public static boolean checkChars(String str) {
        return str.length() > 1 && str.charAt(0) == 'h' && str.charAt(1) == 'i';
    }

    /**
     * Get a substring and check it
     *
     * @param str a possibly empty string
     * @return true if the string starts with "hi"
     */
    public static boolean sub(String str) {
        return str.length() > 1 && str.substring(0, 2).equals("hi");
    }

}
