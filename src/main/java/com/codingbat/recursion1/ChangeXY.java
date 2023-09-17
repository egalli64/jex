/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * changeXY - https://codingbat.com/prob/p101372
 * <p>
 * Generate recursively a new string where all the 'x' in the input string are
 * changed to 'y'
 */
public class ChangeXY {
    /**
     * Base case: an empty string leads to another empty string
     * <p>
     * Recursive part: check if the first two chars in the string are 'h' and 'i',
     *
     * @param str a string
     * @return each 'x' changed to 'y'
     */
    public static String changeXY(String str) {
        if (str.isEmpty()) {
            return str;
        }

        String left = str.charAt(0) == 'x' ? "y" : str.substring(0, 1);
        return left + changeXY(str.substring(1));
    }

    /**
     * Base case: if there is no 'x' in the string, return the input string as is
     * <p>
     * Recursive part: if the target has been found, return the substring left of
     * 'x' concatenated to "y", concatenated with the result of recursive call on
     * the substring to the right of 'x'
     * <p>
     * Even tough we don't see it in the code, the call to String::indexOf implies a
     * loop (so, this is kind of cheating)
     *
     * @param str a string
     * @return the changed string
     */
    public static String cheat(String str) {
        int pos = str.indexOf('x');
        if (pos == -1) {
            return str;
        }

        return str.substring(0, pos) + "y" + cheat(str.substring(pos + 1));
    }

}
