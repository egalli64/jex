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
     * Base case: if sub is longer than the string, no occurrences, return true if n
     * should be zero, false otherwise.
     * <p>
     * Recursive part: if sub is at the beginning of str, decrease n; if n is
     * greater than zero, recurse after dropping the first char, otherwise return
     * true.
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
            return n == 0;
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
     * Base case: if the index implies no more occurrences of sub in s, return false
     * if at least one more sub was expected, true otherwise.
     * <p>
     * Recursive part: if sub is at the beginning of str, decrease n; recurse after
     * increasing the index.
     *
     * @param s   string
     * @param i   current position
     * @param sub substring
     * @param n   the expected minimum number of sub in s
     * @return true if there are enough sub is s
     */
    static boolean tailRec(String s, int i, String sub, int n) {
        if (s.length() - i < sub.length()) {
            return n == 0;
        }

        if (s.startsWith(sub, i)) {
            n -= 1;
        }
        return tailRec(s, i + 1, sub, n);
    }
}
