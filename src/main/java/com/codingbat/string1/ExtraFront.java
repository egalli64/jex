/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * extraFront - https://codingbat.com/prob/p172063
 * <p>
 * Return "red" or "blue" if the input string starts that way, otherwise ""
 */
public class ExtraFront {
    /**
     * Generate the required substring, concatenate three times
     * 
     * @param str a possibly empty string
     * @return the first two chars (if available) times 3
     */
    public static String solution(String str) {
        int end = Math.min(str.length(), 2);
        String tag = str.substring(0, end);
        return tag + tag + tag;
    }

    /**
     * Using explicitly StringBuilder
     * 
     * @param str a possibly empty string
     * @return the first two chars (if available) times 3
     */
    public static String verbose(String str) {
        String tag = str.substring(0, Math.min(str.length(), 2));
        StringBuilder result = new StringBuilder(tag);
        for (int i = 0; i < 2; i++) {
            result.append(tag);
        }
        return result.toString();
    }

    /**
     * Java 11 currently not supported by Coding Bat
     * 
     * @param str a possibly empty string
     * @return the first two chars (if available) times 3
     */
    public static String solutionJ11(String str) {
        return str.substring(0, Math.min(str.length(), 2)).repeat(3);
    }
}
