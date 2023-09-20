/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * strDist - https://codingbat.com/prob/p195413
 * <p>
 * Calculate recursively the size of the largest substring starting and ending
 * by sub (start/end could be the same)
 */
public class StrDist {
    /**
     * Base case: if sub is longer than the string, no occurrences, return 0.
     * <p>
     * Recursive part: if sub is not at the begin, recurse cutting out the first
     * char; if sub is not at the end, recurse cutting out the last char
     * <p>
     * Base case (part /2): return the size of the string (being checked by the
     * recursive part).
     * 
     * @param str a string
     * @param sub a substring
     * @return size from sub to sub
     */
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        } else if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

        return str.length();
    }

    /**
     * Adapter to {@linkplain StrDist#tailRec(String, String, int, int)}
     * 
     * @param str a string
     * @param sub a substring
     * @return size from sub to sub
     */
    public static int tailRec(String str, String sub) {
        return tailRec(str, sub, 0, str.length() - sub.length());
    }

    /**
     * Tail recursive version
     * <p>
     * Base case: if the interval is empty, return 0
     * <p>
     * Recursive part: if sub is not at the begin of the interval, recurse
     * increasing i; if sub is not at the end of the interval, recurse decreasing j.
     * <p>
     * Base case (part /2): return the size of the interval, plus the size of sub.
     *
     * @param str a string
     * @param sub the substring
     * @param i   begin of interval
     * @param j   end of interval
     * @return the requested size
     */
    static int tailRec(String str, String sub, int i, int j) {
        if (j < i) {
            return 0;
        }

        if (!str.startsWith(sub, i)) {
            return tailRec(str, sub, i + 1, j);
        }
        if (!str.startsWith(sub, j)) {
            return tailRec(str, sub, i, j - 1);
        }

        return j - i + sub.length();
    }
}
