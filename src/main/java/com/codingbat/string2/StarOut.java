/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * starOut - https://codingbat.com/prob/p139564
 * <p>
 * Remove from the passed string all the '*' and the (possible) preceding and
 * following single char
 */
public class StarOut {
    /**
     * Loop on all chars in the string. If the current one is not a star and there
     * is no star before or after it, put it in the result. Pay attention to first
     * and last chars!
     * 
     * @param str a string
     * @return cleaned string
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur != '*' && (i == 0 || str.charAt(i - 1) != '*')
                    && (i == str.length() - 1 || str.charAt(i + 1) != '*')) {
                result.append(cur);
            }
        }

        return result.toString();
    }

    /**
     * Nothing to do for an empty string or a single char one, if it is not a "*".
     * Otherwise, check all triplets in the string, if a triplet is star-free, its
     * central char can safely be appended in the resulting string. First and last
     * char require a check only for the neighbor char.
     *
     * @param str a string
     * @return cleaned string
     */
    public static String verbose(String str) {
        if (str.isEmpty()) {
            return str;
        } else if (str.length() == 1) {
            return str.charAt(0) == '*' ? "" : str;
        } else {
            StringBuilder result = new StringBuilder();

            char first = str.charAt(0);
            if (first != '*' && str.charAt(1) != '*') {
                result.append(first);
            }

            for (int i = 1; i < str.length() - 1; i++) {
                char cur = str.charAt(i);
                if (cur != '*' && str.charAt(i - 1) != '*' && str.charAt(i + 1) != '*') {
                    result.append(cur);
                }
            }

            char last = str.charAt(str.length() - 1);
            if (str.charAt(str.length() - 2) != '*' && last != '*') {
                result.append(last);
            }

            return result.toString();
        }
    }

    /**
     * Replace the pattern "one or more *, possibly prefixed and followed by a
     * single char" with an empty string
     * 
     * @param str a string
     * @return the generated string
     */
    public static String byReplaceAll(String str) {
        return str.replaceAll(".?\\*+.?", "");
    }
}
