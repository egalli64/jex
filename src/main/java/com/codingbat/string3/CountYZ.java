/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * countYZ - https://codingbat.com/prob/p199171
 * <p>
 * The passed string could contain many words. A character is said to end a word
 * if it is not followed by a letter, as defined by
 * {@linkplain Character#isLetter(char)}. Return the number of 'Y' and 'Z' (case
 * insensitive) ending words.
 */
public class CountYZ {
    /**
     * Loop on all char pairs in the given string. Increase the counter for each Y/Z
     * followed by non-letter. Then check if the last char is a Y/Z.
     *
     * @param str a non-empty string
     * @return how many case-insensitive y,z are at the end of words in the string
     */
    public static int solution(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char cur = Character.toUpperCase(str.charAt(i));
            if ((cur == 'Y' || cur == 'Z') && !Character.isLetter(str.charAt(i + 1))) {
                counter += 1;
            }
        }

        char last = Character.toUpperCase(str.charAt(str.length() - 1));
        if (last == 'Y' || last == 'Z') {
            counter += 1;
        }

        return counter;
    }
}
