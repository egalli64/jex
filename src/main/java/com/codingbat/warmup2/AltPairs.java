/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * altPairs - https://codingbat.com/prob/p121596
 * <p>
 * Extract a substring getting chars at 0,1, 4,5, 8,9 ...
 */
public class AltPairs {
    /**
     * Generate the result appending each couple of char starting at position % 4,
     * pay attention to avoid out of bound in the couple
     * 
     * @param str a possibly empty string
     * @return a substring generated from the input
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            int end = Math.min(i + 2, str.length());
            result.append(str.substring(i, end));
        }

        return result.toString();
    }

    /**
     * Loop on the string changing step each time between 1 and 3
     *
     * @param str a possibly empty string
     * @return a substring generated from the input
     */
    public static String changeStep(String str) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < str.length()) {
            result.append(str.charAt(i));
            i += (i % 2 == 0) ? 1 : 3;
        }

        return result.toString();
    }
}
