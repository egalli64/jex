/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * sameEnds - https://codingbat.com/prob/p131516
 * <p>
 * Get the longest substring appearing both at begin and end without
 * overlapping.
 */
public class SameEnds {
    /**
     * Generate the longest acceptable substring (half string) as a builder. While
     * it is not empty, check if it matches with the string end. If not, remove its
     * last char and try again.
     *
     * @param string a string
     * @return the begin/end substring
     */
    public static String solution(String string) {
        StringBuilder result = new StringBuilder(string.substring(0, string.length() / 2));

        while (result.length() > 0) {
            String current = result.toString();
            if (string.endsWith(current)) {
                break;
            } else {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }

    /**
     * Extract from the input string all the begin/end same-size substrings and
     * compare them. Keep track of the biggest matching one.
     * 
     * @param string a string
     * @return the begin/end substring
     */
    public static String alternative(String string) {
        String result = "";

        for (int len = 1; len <= string.length() / 2; len++) {
            String left = string.substring(0, len);
            String right = string.substring(string.length() - len);
            if (left.equals(right)) {
                result = left;
            }
        }

        return result;
    }
}
