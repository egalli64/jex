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
     * @return truncated string with swapped chars
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length() - str.length() % 3;
        for (int i = 0; i < len; i += 3) {
            result.append(str.charAt(i + 1)).append(str.charAt(i + 2)).append(str.charAt(i));
        }

        return result.toString();
    }

    /**
     * Loop on triplets, basing the loop variable on its third element. Append the
     * rearranged chars to the builder that keep the result.
     * 
     * @param str a string
     * @return truncated string with swapped chars
     */
    public static String alternative(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < str.length(); i += 3) {
            result.append(str.charAt(i - 1)).append(str.charAt(i)).append(str.charAt(i - 2));
        }

        return result.toString();
    }
}
