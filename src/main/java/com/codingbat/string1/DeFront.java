/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * deFront - https://codingbat.com/prob/p110141
 * <p>
 * copy the input string, but first must be 'a', and second 'b'
 */
public class DeFront {
    /**
     * StringBuilder, conditional copy for the first two chars
     * 
     * @param str a possibly empty string
     * @return remove first if not 'a', second if not 'b'
     */
    public static String verbose(String str) {
        StringBuilder result = new StringBuilder();
        if (!str.isEmpty() && str.charAt(0) == 'a') {
            result.append('a');
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result.append('b');
        }
        if (str.length() > 2) {
            result.append(str.substring(2));
        }

        return result.toString();
    }

    /**
     * StringBuilder as mutable string
     * 
     * @param str a possibly empty string
     * @return remove first if not 'a', second if not 'b'
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder(str);
        if (result.charAt(1) != 'b') {
            result.deleteCharAt(1);
        }
        if (result.charAt(0) != 'a') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
