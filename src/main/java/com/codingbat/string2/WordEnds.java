/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * wordEnds - https://codingbat.com/prob/p147538
 * <p>
 * Generate a string containing just the single chars before and after each
 * occurrence of the passed word in the passed string.
 */
public class WordEnds {
    /**
     * Loop on the input string looking for the index of the word within it. If
     * there is a char before/after it, append them to the string builder.
     *
     * @param str  a string
     * @param word a non-empty string
     * @return the generated new string
     */
    public static String solution(String str, String word) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while ((i = str.indexOf(word, i)) != -1) {
            if (i > 0) {
                result.append(str.charAt(i - 1));
            }

            i += word.length();
            if (i < str.length()) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
