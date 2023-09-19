/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * stringClean - https://codingbat.com/prob/p104029
 * <p>
 * Remove recursively duplicated consecutive chars in the passed string
 */
public class StringClean {
    /**
     * Base case: a string shorter than 2 has no duplicate chars in it
     * <p>
     * Recursive part: check if the string begins by duplicated chars, return what
     * the recursion returns prepended by the first char, if not duplicated
     *
     * @param str a string
     * @return a input copy with no duplicates in it
     */
    public static String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        }

        char first = str.charAt(0);
        if (first == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return first + stringClean(str.substring(1));
        }
    }

    /**
     * If the input string is sized less than 2, just return it. Otherwise delegate
     * the tail recursive job to the helper
     * {@linkplain StringClean#tailRec(String, int, StringBuilder)}
     *
     * @param str a string
     * @return a input copy with no duplicates in it
     */
    public static String tailRec(String str) {
        if (str.length() < 2) {
            return str;
        }

        return tailRec(str, 0, new StringBuilder());
    }

    /**
     * Tail recursion for {@linkplain StringClean#tailRec(String)}
     * <p>
     * Base case: i is on the last char, append it to the accumulator and return it
     * <p>
     * Recursive part: if the current char is not equal to the next one, append it
     * in the accumulator, recurse increasing the current index
     *
     * @param sb a mutable string
     * @param i  current position
     * @return no double chars from i on
     */
    static String tailRec(String s, int i, StringBuilder acc) {
        char cur = s.charAt(i);

        if (i == s.length() - 1) {
            return acc.append(cur).toString();
        }

        if (cur != s.charAt(i + 1)) {
            acc.append(cur);
        }
        return tailRec(s, i + 1, acc);
    }
}
