/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * stringYak - https://codingbat.com/prob/p126212
 * <p>
 * Generate a copy of the input string, with all "y?k" removed
 */
public class StringYak {
    /**
     * Loop on the chars, do not copy the "y?k" parts, when detected
     * 
     * @param str a string
     * @return an adjusted copy of the input string
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur == 'y' && i < str.length() - 2 && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                result.append(cur);
            }
        }

        return result.toString();
    }
}
