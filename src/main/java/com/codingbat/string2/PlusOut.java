/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * plusOut - https://codingbat.com/prob/p170829
 * <p>
 * Generate a string with the same size of the passed one, but where each char
 * is replaced by a '+', with the exception of the passed word (could be
 * duplicated), that should stay clear in the result
 */
public class PlusOut {
    /**
     * Loop on the passed string looking for the index of the passed word, change
     * all chars in that interval with '+', if not found, all the string from the
     * current index to the end of string should by obscured. Append the clear word
     * if it was found.
     *
     * @param str  a string
     * @param word a non-empty string
     * @return keep the words, replace other chars with '+'
     */
    public static String solution(String str, String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length();) {
            int end = str.indexOf(word, i);
            if (end == -1) {
                end = str.length();
            }

            for (; i < end; i++) {
                result.append('+');
            }

            if (end != str.length()) {
                result.append(word);
                i += word.length();
            }
        }

        return result.toString();
    }
}
