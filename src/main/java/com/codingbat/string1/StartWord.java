/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * startWord - https://codingbat.com/prob/p141494
 * <p>
 * Given two non empty strings, str and word:
 * <li>cut str at the same length of word.
 * <li>compare the cut and word from their second char on.
 * <li>if they equals (in this strange way), return the cut.
 * <li>otherwise an empty string.
 */
public class StartWord {
    /**
     * Using substring a lot
     * 
     * @param str  a non-empty string
     * @param word a non-empty checking string
     * @return the cut from str or an empty string
     */
    public static String solution(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        String tag = str.substring(0, word.length());
        return tag.substring(1).equals(word.substring(1)) ? tag : "";
    }
}
