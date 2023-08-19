/**
 * https://codingbat.com/java/String-2
 */
package com.codingbat;

public class String2 {
    private String2() {
    }

    /**
     * codingbat.com/prob/p194491
     *
     * @param str a string
     * @return true if any * in it not in extreme positions has same neighbors
     */
    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * codingbat.com/prob/p159772
     *
     * @param str a string
     * @return true if "xyz" is in the middle
     */
    public static boolean xyzMiddle(String str) {
        int len = str.length();
        int pos = str.indexOf("xyz", len / 2 - 3);
        return len > 2 && Math.abs(pos - (len - (pos + 3))) < 2;
    }

    /**
     * codingbat.com/prob/p129952
     *
     * @param str a string
     * @return the substring enclosed in two extreme "bread", or empty
     */
    public static String getSandwich(String str) {
        int first = str.indexOf("bread");
        int second = str.lastIndexOf("bread");
        return first == second ? "" : str.substring(first + 5, second);
    }

    /**
     * codingbat.com/prob/p122943
     *
     * @param str a string
     * @return swap each three letter group so that 123 -> 231
     */
    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length() - str.length() % 3;
        for (int i = 0; i < len; i += 3) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p180759
     *
     * @param str a string
     * @return remove each central char in "z?p" patterns
     */
    public static String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            result.append(cur);

            if (cur == 'z' && i < str.length() - 2 && str.charAt(i + 2) == 'p') {
                result.append('p');
                i += 2;
            }
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p139564
     *
     * @param str a string
     * @return remove '*' and preceding/following non-star char
     */
    public static String starOut(String str) {
        if (str.isEmpty()) {
            return str;
        } else if (str.length() == 1) {
            return str.charAt(0) == '*' ? "" : str;
        }

        StringBuilder result = new StringBuilder();
        char first = str.charAt(0);
        char second = str.charAt(1);
        if (first != '*' && second != '*') {
            result.append(first);
        }

        for (int i = 1; i < str.length() - 1; i++) {
            char prev = str.charAt(i - 1);
            char cur = str.charAt(i);
            char next = str.charAt(i + 1);
            if (!(prev == '*' || cur == '*' || next == '*')) {
                result.append(cur);
            }
        }

        char prev = str.charAt(str.length() - 2);
        char last = str.charAt(str.length() - 1);
        if (prev != '*' && last != '*') {
            result.append(last);
        }

        return result.toString();
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
