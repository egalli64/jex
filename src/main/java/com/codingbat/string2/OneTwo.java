/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * oneTwo - https://codingbat.com/prob/p122943
 * <p>
 * Each triplet in the input string should be rearranged following the schema
 * 123 -> 231, if the tail is shorter than 3, ignore it
 */
public class OneTwo {
    /**
     * Cut off the tail, if it exceeds % 3. Loop on each triplet in the input
     * string, append it to a builder in the required order
     *
     * @param str a string
     * @return swap each three letter group so that
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length() - str.length() % 3;
        for (int i = 0; i < len; i += 3) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
