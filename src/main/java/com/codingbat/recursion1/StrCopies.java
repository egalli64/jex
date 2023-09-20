/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * strCopies - https://codingbat.com/prob/p118182
 * <p>
 * Check recursively if there are at least a given number of occurrences of sub
 * in str (could overlap)
 */
public class StrCopies {
    /**
     * Base case: if no sub should be found, return true, otherwise, if the searched
     * string is shorter than sub, return false
     * <p>
     * Recursive part: if sub is at the beginning of str, decrease n; in any case,
     * recurse after dropping the first char.
     *
     * @param str a string
     * @param sub a substring
     * @param n   number of copies
     * @return true if there are at least the required copies
     */
    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        } else if (str.length() < sub.length()) {
            return false;
        }

        if (str.startsWith(sub)) {
            n -= 1;
        }
        return strCopies(str.substring(1), sub, n);
    }

    /**
     * Adapter to {@linkplain StrCopies#tailRec(String, int, String, int)}
     *
     * @param str a string
     * @param sub a substring
     * @param n   number of copies
     * @return true if there are at least the required copies
     */
    public static boolean tailRec(String str, String sub, int n) {
        return tailRec(str, 0, sub, n);
    }

    /**
     * Tail recursive version
     * <p>
     * Base case: if no occurrence of sub is expected, return true; otherwise, if
     * the index implies no more occurrences of sub are in s, return false
     * <p>
     * Recursive part: if sub is at the beginning of str, decrease n; in any case
     * recurse after increasing the index.
     *
     * @param s   string
     * @param i   current position
     * @param sub substring
     * @param n   the expected minimum number of sub in s
     * @return true if there are enough sub is s
     */
    static boolean tailRec(String s, int i, String sub, int n) {
        if (n == 0) {
            return true;
        } else if (s.length() - i < sub.length()) {
            return false;
        }

        if (s.startsWith(sub, i)) {
            n -= 1;
        }
        return tailRec(s, i + 1, sub, n);
    }
}
