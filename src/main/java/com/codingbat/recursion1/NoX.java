/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * noX - https://codingbat.com/prob/p118230
 * <p>
 * Generate recursively a new string where all the 'x' in the input string are
 * removed
 */
public class NoX {
    /**
     * Base case: if the string is empty, return it
     * <p>
     * Recursive part: if the first char is 'x', recurse on the substring discarding
     * the first char. Otherwise concatenate the first char with the recursion
     *
     * @param str a string
     * @return all 'x' removed
     */
    public static String noX(String str) {
        if (str.isEmpty()) {
            return str;
        }

        char first = str.charAt(0);
        if (first == 'x') {
            return noX(str.substring(1));
        } else {
            return first + noX(str.substring(1));
        }
    }
}
