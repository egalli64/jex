/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * mirrorEnds - https://codingbat.com/prob/p139411
 * <p>
 * Get the longest substring appearing both at begin and, reversed, at end. They
 * could overlap.
 */
public class MirrorEnds {
    /**
     * Loop on all characters in the string, keeping an index moving from left to
     * right and another from right to left. End looping when the center is reached
     * or when a non-match is found. If all chars are matching return the full
     * string, otherwise return just the left-to-right substring.
     *
     * @param string a string
     * @return the longest palindrome section of the string
     */
    public static String solution(String string) {
        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                return string.substring(0, i);
            }
        }
        return string;
    }
}
