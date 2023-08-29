/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * xyzMiddle - https://codingbat.com/prob/p159772
 * <p>
 * Check if the passed string has "xyz" in the middle. The chars to the left and
 * to the right of the middle should differ by one at most.
 */
public class XyzMiddle {
    /**
     * Ensure that the string is long enough to contain "xyz", if so, get the index
     * of its instance close to the center. If "xyz" is there, compare the size of
     * head and tail.
     *
     * @param str a string
     * @return true if accepted
     */
    public static boolean solution(String str) {
        int head = str.indexOf("xyz", str.length() / 2 - 3);
        if (head == -1) {
            return false;
        }

        int tail = str.length() - (head + 3);
        return Math.abs(head - tail) <= 1;
    }
}
