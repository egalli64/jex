/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * count11 - https://codingbat.com/prob/p167015
 * <p>
 * Count recursively non overlapping occurrences of "11" in the passed string
 */
public class Count11 {
    /**
     * Base case: a string shorter than 2 has no "11" in it
     * <p>
     * Recursive part: check if the string begins by "11", return what the recursion
     * on the string without 1 or 2 initial chars, added by 1 when required.
     *
     * @param str a string
     * @return number of non-overlapping substring "11"
     */
    public static int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.charAt(0) == '1' && str.charAt(1) == '1') {
            return 1 + count11(str.substring(2));
        } else {
            return count11(str.substring(1));
        }
    }

    /**
     * Inception for tail recursion {@linkplain Count11#tailRec(String, int, int)}
     *
     * @param str a string
     * @return number of non-overlapping substring "11"
     */
    public static int tailRec(String str) {
        return tailRec(str, 0, 0);
    }

    /**
     * Tail recursion for {@linkplain Count11#tailRec(String)}
     * <p>
     * Base case: if i is too big, return the accumulator
     * <p>
     * Recursive part: check for "11" at the current index, recurse increasing index
     * and accumulator accordingly
     * 
     * @param s   a string
     * @param i   current index
     * @param acc current number of "11"
     * @return number of non-overlapping substring "11"
     */
    static int tailRec(String s, int i, int acc) {
        if (i > s.length() - 2) {
            return acc;
        }
        if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
            return tailRec(s, i + 2, acc + 1);
        } else {
            return tailRec(s, i + 1, acc);
        }
    }
}
