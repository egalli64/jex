/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * allStar - https://codingbat.com/prob/p183394
 * <p>
 * Generate recursively a new string having interleaving '*' between each couple
 * of characters
 */
public class AllStar {
    /**
     * Base case: if the string has less than two chars in it, return it unchanged
     * <p>
     * Recursive part: return the first char, a '*' then the result of recursion on
     * a copy of the original string from its second char on
     *
     * @param str a string
     * @return the string with '*' added as char connector
     */
    public static String allStar(String str) {
        if (str.length() < 2) {
            return str;
        }

        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }

    /**
     * If the string is sized less than 2, return it unchanged. Otherwise delegate
     * to {@linkplain AllStar#tailRec(String, int, StringBuilder)}.
     *
     * @param str a string
     * @return the string with '*' added as char connector
     */
    public static String tailRec(String str) {
        if (str.length() < 2) {
            return str;
        }
        return tailRec(str, 0, new StringBuilder()).toString();
    }

    /**
     * Tail recursion support for {@linkplain AllStar#tailRec(String)}
     * <p>
     * Base case: on the string end, push the current char in the accumulator and
     * return it
     * <p>
     * Recursive part: besides the current char, append also a '*' to the
     * accumulator, recurse for the next position
     *
     * @param s   a string
     * @param i   current position
     * @param acc accumulator
     * @return the starred string
     */
    static StringBuilder tailRec(String s, int i, StringBuilder acc) {
        acc.append(s.charAt(i));

        if (i == s.length() - 1) {
            return acc;
        }

        acc.append('*');
        return tailRec(s, i + 1, acc);
    }
}
