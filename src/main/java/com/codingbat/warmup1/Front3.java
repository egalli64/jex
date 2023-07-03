/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * front3 - codingbat.com/prob/p136351
 * <p>
 * Three times the first three chars (or less, if not available)
 */
public class Front3 {
    /**
     * Cut the initial tag and concatenate it three times
     * 
     * @param str a possibly empty string
     * @return Three times the first three chars (if available)
     */
    public static String solution(String str) {
        int len = Math.min(str.length(), 3);
        String tag = str.substring(0, len);
        return tag + tag + tag;
    }

    /**
     * Java 11 currently not supported by Coding Bat
     * 
     * @param str a possibly empty string
     * @return Three times the first three chars (if available)
     */
    public static String solutionJ11(String str) {
        return str.substring(0, Math.min(str.length(), 3)).repeat(3);
    }
}
