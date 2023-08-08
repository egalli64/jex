/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * parenBit - https://codingbat.com/prob/p137918
 * <p>
 * Extract recursively the substring delimited by '(' and ')'. Assume the input
 * string is in the format "...(...)...".
 */
public class ParenBit {
    /**
     * Base case: if the string starts by '(' and ends by ')' return it.
     * <p>
     * Recursive part: if the first char is not '(', recurse on the substring from
     * the second char; if the last char is not ')', recurse on the substring until
     * the last char excluded.
     * <p>
     * Notice that it is handier to rearrange the code to execute first the
     * recursive part and then the base case.
     *
     * @param str a string
     * @return its substring delimited by '(' and ')'
     */
    public static String parenBit(String str) {
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        } else if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        } else {
            return str;
        }
    }

    /**
     * Delegate the search of left and right parenthesis to
     * {@linkplain ParenBit#firstParenLeft(String, int)} and
     * {@linkplain ParenBit#lastParenRight(String, int)}
     *
     * @param str a string
     * @return its substring delimited by '(' and ')'
     */
    public static String tailRec(String str) {
        return str.substring(firstParenLeft(str, 0), lastParenRight(str, str.length() - 1) + 1);
    }

    /**
     * Tail recursive helper for {@linkplain ParenBit#parenBit(String)}
     * <p>
     * Assuming the input string has at least a open parenthesis, recurse increasing
     * the current position until it is found
     *
     * @param s string
     * @param i current position
     * @return the first '(' position
     */
    static int firstParenLeft(String s, int i) {
        if (s.charAt(i) == '(') {
            return i;
        }
        return firstParenLeft(s, i + 1);
    }

    /**
     * Tail recursive helper for {@linkplain ParenBit#parenBit(String)}
     * <p>
     * Assuming the input string has at least a close parenthesis, recurse
     * decreasing the current position until it is found
     *
     * @param s string
     * @param i current position
     * @return the last ')' position
     */
    static int lastParenRight(String s, int i) {
        if (s.charAt(i) == ')') {
            return i;
        }
        return lastParenRight(s, i - 1);
    }
}
