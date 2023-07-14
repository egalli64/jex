/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * withoutX2 - https://codingbat.com/prob/p151359
 * <p>
 * copy the input string, but first and second, if 'x', should be removed
 */
public class WithoutX2 {
    /**
     * StringBuilder getting the first two chars, if not 'x', then the string tail
     * 
     * @param str a possibly empty string
     * @return remove the first two chars, if not 'x'
     */
    public static String verbose(String str) {
        StringBuilder result = new StringBuilder();

        final int end = Math.min(2, str.length());
        for (int i = 0; i < end; i++) {
            char cur = str.charAt(i);
            if (cur != 'x') {
                result.append(cur);
            }
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
     * @return remove the first two chars, if not 'x'
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder(str);

        final int last = Math.min(2, str.length()) - 1;
        for (int i = last; i >= 0; i--) {
            if (result.charAt(i) == 'x') {
                result.deleteCharAt(i);
            }
        }

        return result.toString();
    }
}
