/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * repeatSeparator - https://codingbat.com/prob/p109637
 * <p>
 * Generate a new string repeating n times the passed string separated by the
 * passed connector.
 * <p>
 * Beware of fence-post error!
 */
public class RepeatSeparator {
    /**
     * If count is not zero, append the word a first time, then append repeatedly
     * pairs of connector and word, until the full string is generated.
     *
     * @param word  a word
     * @param sep   a connector
     * @param count an integer
     * @return count times word connected by sep
     */
    public static String solution(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        if (count > 0) {
            result.append(word);
        }
        for (int i = 1; i < count; i++) {
            result.append(sep);
            result.append(word);
        }

        return result.toString();
    }
}
