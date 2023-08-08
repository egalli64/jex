/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * strCount - https://codingbat.com/prob/p186177
 * <p>
 * Count recursively the occurrences of sub in str
 */
public class StrCount {
    /**
     * Base case: if sub is longer, no occurrences
     * <p>
     * Recursive part: recurse on a shorter string. Cut one char if sub is not at
     * the beginning, otherwise the length of sub. Add one to the result if sub is
     * found.
     * 
     * @param str a string
     * @param sub the substring
     * @return number of sub
     */
    public static int strCount(String str, String sub) {
        int len = sub.length();
        if (str.length() < len) {
            return 0;
        }

        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(len), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }

    /**
     * Adapter for {@linkplain StrCount#tailRec(String, int, String, int)}
     *
     * @param str a string
     * @param sub the substring
     * @return number of sub
     */
    public static int tailRec(String str, String sub) {
        return tailRec(str, 0, sub, 0);
    }

    /**
     * Tail recursive version
     * <p>
     * Base case: if the current position is so close to the end that no sub could
     * be found, return the accumulator.
     * <p>
     * Recursive part: check for sub at the current position, if found increase the
     * accumulator and adjust the index accordingly, otherwise increase the index.
     * Then recurse.
     *
     * @param s   a string
     * @param i   current position
     * @param sub to be matched
     * @param acc partial count of matches
     * @return number of matches
     */
    private static int tailRec(String s, int i, String sub, int acc) {
        if (s.length() - i < sub.length()) {
            return acc;
        }

        if (s.startsWith(sub, i)) {
            acc += 1;
            i += sub.length();
        } else {
            i += 1;
        }
        return tailRec(s, i, sub, acc);
    }
}
