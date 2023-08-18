/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * xyBalance - https://codingbat.com/prob/p134250
 * <p>
 * Check if the passed string is x-y balanced - a y balances all the previous x
 */
public class XyBalance {
    /**
     * Loop from the right, check if an x is seen before an y or vice versa. If no x
     * nor y are in the string, is a success
     * 
     * @param str a string
     * @return true for success
     */
    public static boolean solution(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            char cur = str.charAt(i);

            if (cur == 'x') {
                return false;
            } else if (cur == 'y') {
                return true;
            }
        }

        return true;
    }

    /**
     * Use String::(last)IndexOf to check if there is no x after the last y
     *
     * @param str a string
     * @return true for success
     */
    public static boolean byIndex(String str) {
        return str.indexOf('x', str.lastIndexOf('y') + 1) == -1;
    }

    /**
     * Use String::lastIndexOf to check if there is no x after the last y
     *
     * @param str a string
     * @return true for success
     */
    public static boolean byLastIndex(String str) {
        return str.lastIndexOf('x') <= str.lastIndexOf('y');
    }
}
