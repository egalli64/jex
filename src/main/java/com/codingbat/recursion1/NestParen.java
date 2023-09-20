/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * nestParen - https://codingbat.com/prob/p183174
 * <p>
 * Check if the string contains only open/close matched parenthesis
 */
public class NestParen {
    /**
     * Base cases: an empty string is accepted, a string that does not start/end
     * with an open/close parenthesis is refused.
     * <p>
     * Recursive part: check the substring excluding the extreme chars.
     *
     * @param str a string
     * @return true if matched parenthesis only
     */
    public static boolean nestParen(String str) {
        if (str.isEmpty()) {
            return true;
        } else if (str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
            return false;
        }

        return nestParen(str.substring(1, str.length() - 1));
    }

    /**
     * Adapt to {@linkplain NestParen#tailRec(String, int, int)}
     *
     * @param str a string
     * @return true if matching open/close parenthesis
     */
    public static boolean tailRec(String str) {
        return tailRec(str, 0, str.length() - 1);
    }

    /**
     * Tail recursion for {@linkplain NestParen#tailRec(String)}
     * <p>
     * Base cases: if the check interval is empty, accept the string; if the extreme
     * chars are not matching, refuse it.
     * <p>
     * Recursive part: move the indices to the center.
     *
     * @param s string
     * @param i left pos
     * @param j right pos
     * @return true if matching
     */
    static boolean tailRec(String s, int i, int j) {
        if (i > j) {
            return true;
        } else if (s.charAt(i) != '(' || s.charAt(j) != ')') {
            return false;
        }

        return tailRec(s, i + 1, j - 1);
    }
}
