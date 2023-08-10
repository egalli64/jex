/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * stringX - https://codingbat.com/prob/p171260
 * <p>
 * Generate a new string removing all 'x' but the extreme ones from input
 */
public class StringX {
    /**
     * Generate the new string in a string builder, appending the chars when
     * required. No need to do anything if the string is too short.
     * 
     * @param str a string
     * @return a almost no-x string
     */
    public static String solution(String str) {
        if (str.length() < 3) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            char cur = str.charAt(i);
            if (cur != 'x') {
                result.append(cur);
            }
        }
        result.append(str.charAt(str.length() - 1));

        return result.toString();
    }

    /**
     * Copy the input string in a string builder. Starting from the end, remove the
     * 'x' not on the borders. No need to do anything if the string is too short.
     * 
     * @param str a string
     * @return a almost no-x string
     */
    public static String alternative(String str) {
        if (str.length() < 3) {
            return str;
        }

        StringBuilder result = new StringBuilder(str);
        for (int i = result.length() - 2; i > 0; i--) {
            if (result.charAt(i) == 'x') {
                result.deleteCharAt(i);
            }
        }

        return result.toString();
    }
}
