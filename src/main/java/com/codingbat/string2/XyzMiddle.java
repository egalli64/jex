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
     * Ensure the string is long enough to contain the target. If it has an even
     * size, the target can't be exactly centered, check if it is more to the left.
     * Otherwise check if it the target starts from the center minus one. In case of
     * odd-sized input, this means that it is exactly centered, for a even-sized
     * input it means it is a one step more to the right.
     * <p>
     * The check for "xyz" is delegated to
     * {@linkplain XyzMiddle#checkXyz(String, int)}
     * 
     * @param str a string
     * @return true if accepted
     */
    public static boolean solution(String str) {
        if (str.length() < 3) {
            return false;
        } else if (str.length() % 2 == 0 && checkXyz(str, str.length() / 2 - 2)) {
            return true;
        } else {
            return checkXyz(str, str.length() / 2 - 1);
        }
    }

    /**
     * Check if "xyz" is a substring of s from i
     * 
     * @param s a string
     * @param i an index in s
     * @return true if matches
     * @throws StringIndexOutOfBoundsException for "bad" i
     */
    static boolean checkXyz(String s, int i) {
        return s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z';
    }

    /**
     * Get the index of its instance close to the center. If "xyz" is there, compare
     * the size of head and tail.
     *
     * @param str a string
     * @return true if accepted
     */
    public static boolean byIndex(String str) {
        int head = str.indexOf("xyz", str.length() / 2 - 3);
        if (head == -1) {
            return false;
        }

        int tail = str.length() - (head + 3);
        return Math.abs(head - tail) <= 1;
    }
}
