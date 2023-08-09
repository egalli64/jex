/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * stringSplosion - https://codingbat.com/prob/p117334
 * <p>
 * Generating the "explosion" of the input (non-empty) string, concatenation of
 * all its substrings from size 1 to its length.
 */
public class StringSplosion {
    /**
     * Append all substrings in the resulting string builder
     * 
     * @param str a string
     * @return the concatenation of all the substrings
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str, 0, i + 1);
        }

        return result.toString();
    }
}
