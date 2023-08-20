/**
 * https://codingbat.com/java/String-2
 */
package com.codingbat;

public class String2 {
    private String2() {
    }

    /**
     * codingbat.com/prob/p170829
     *
     * @param str  a string
     * @param word a non-empty string
     * @return keep the words, replace other chars with '+'
     */
    public static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();

        int cur = 0;

        do {
            int next = str.indexOf(word, cur);
            for (int end = next == -1 ? str.length() : next; cur < end; cur++) {
                result.append('+');
            }
            if (next != -1) {
                result.append(word);
                cur += word.length();
            }
        } while (cur < str.length());

        return result.toString();
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
