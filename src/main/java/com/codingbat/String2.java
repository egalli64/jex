/**
 * https://codingbat.com/java/String-2
 */
package com.codingbat;

public class String2 {
    private String2() {
    }

    /**
     * codingbat.com/prob/p147538
     *
     * @param str  a string
     * @param word a non-empty string
     * @return the chars before/after words in str
     */
    public static String wordEnds(String str, String word) {
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
