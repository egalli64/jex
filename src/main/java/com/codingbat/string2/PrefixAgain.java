/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * prefixAgain - https://codingbat.com/prob/p136417
 * <p>
 * Check if the the input string prefix sized n is repeated somewhere else. It
 * is a caller responsibility passing a non-empty string a correct n in [1, len]
 */
public class PrefixAgain {
    /**
     * Extract the prefix, search it in the input string by String::indexOf from
     * position n
     *
     * @param str a string
     * @param n   prefix size
     * @return true if found
     */
    public static boolean solution(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }

    /**
     * Extract the prefix, check if the input string tail contains it
     *
     * @param str a string
     * @param n   prefix size
     * @return true if found
     */
    public static boolean byContains(String str, int n) {
        String prefix = str.substring(0, n);
        return str.substring(n).contains(prefix);
    }

    /**
     * Loop on the second part of the input string to compare the first n chars
     * against the current n chars - the loop ends when there are less than n char
     * still available. Nested loop to compare them, as just said. Increase the
     * indices when a match is found, and iterate. After the nested loop, check if
     * all the first n char have a match, if so the prefix has been found, otherwise
     * reset the index on the prefix and pass to the next external iteration.
     *
     * @param str a string
     * @param n   prefix size
     * @return true if found
     */
    public static boolean vanilla(String str, int n) {
        int pos = 0;

        for (int i = n; i < str.length() - n + 1; i++) {
            while (pos < n && str.charAt(i) == str.charAt(pos)) {
                pos += 1;
                i += 1;
            }
            if (pos == n) {
                return true;
            } else {
                pos = 0;
            }
        }

        return false;
    }
}
