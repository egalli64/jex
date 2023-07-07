/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * makeOutWord - codingbat.com/prob/p184030
 * <p>
 * put the second parameter in the first one (assume it is sized 4)
 */
public class MakeOutWord {
    /**
     * Concatenate strings and substrings
     *
     * @param out  a 4-char template in which word has to be inserted
     * @param word a string to be inserted in the middle of the "out" template
     * @return the combination of out and word
     */
    public static String solution(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
