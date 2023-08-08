/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * frontTimes - https://codingbat.com/prob/p101475
 * <p>
 * Generate a new string from the first three chars (or less) from the input
 * string, multiplied for the passed integer
 */
public class FrontTimes {
    /**
     * "classic" solution
     * 
     * @param str a string
     * @param n   a non negative number
     * @return n times the first 3 chars (or less)
     */
    public static String solution(String str, int n) {
        int len = Math.min(str.length(), 3);
        String base = str.substring(0, len);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(base);
        }
        return result.toString();
    }

    /**
     * Solution currently not supported by CodingBat (Java 11 required)
     * 
     * @param s a string
     * @param n a non negative number
     * @return n times the first 3 chars (or less)
     */
    public static String unsupported(String s, int n) {
        return s.substring(0, Math.min(s.length(), 3)).repeat(n);
    }
}
