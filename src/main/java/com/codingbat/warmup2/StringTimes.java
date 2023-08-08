/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * stringTimes - https://codingbat.com/prob/p142270
 * <p>
 * Generate the original string times n
 */
public class StringTimes {
    /**
     * Java 11 is currently _not_ supported by CodingBat
     *
     * @param str a possibly empty string
     * @param n   multiplier
     * @return the original string multiplied by n
     */
    public static String unsupported(String str, int n) {
        return str.repeat(n);
    }

    /**
     * A "classic" Java solution
     *
     * @param str a possibly empty string
     * @param n   multiplier
     * @return the original string multiplied by n
     */
    public static String solution(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
