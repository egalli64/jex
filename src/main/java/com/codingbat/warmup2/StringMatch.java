/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * stringMatch - https://codingbat.com/prob/p198640
 * <p>
 * Count how many same length-2 substrings in the same position in the two
 * passed strings
 */
public class StringMatch {
    /**
     * The search is limited by the shortest string, check all the chars couple, pay
     * attention to the limits in looping
     * 
     * @param a first string
     * @param b second string
     * @return how many same length 2 substring are in the same position
     */
    public static int solution(String a, String b) {
        int count = 0;

        final int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
                count += 1;
            }
        }

        return count;
    }
}
