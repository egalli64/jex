/**
 * https://codingbat.com/java/String-2
 */
package com.codingbat;

import java.util.regex.Pattern;

public class String2 {
    private String2() {
    }

    /**
     * codingbat.com/prob/p165312
     *
     * @param str a string
     * @return copy of str, where each char is duplicated
     */
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p123614
     *
     * @param str a string
     * @return how many times the pattern "co.e" is present in the string
     */
    public static int countCode(String str) {
        int count = 0;
        int pos = 0;
        do {
            pos = str.indexOf("co", pos);
            if (pos != -1) {
                if (pos < str.length() - 3 && str.charAt(pos + 3) == 'e') {
                    count += 1;
                    pos += 2;
                }
                pos += 2;
            }
        } while (pos != -1);

        return count;
    }

    /**
     * codingbat.com/prob/p123614
     *
     * <p>
     * Java 9 is currently _not_ supported by CodingBat
     * <p>
     * For a pre-9 solution see {@linkplain String2#countCode(String)}
     *
     * @param str a string
     * @return how many times the pattern "co.e" is present in the string
     */
    public static int countCode9(String str) {
        return (int) Pattern.compile("(co.e)").matcher(str).results().count();
    }

    /**
     * codingbat.com/prob/p175762
     *
     * @param str a string
     * @return true if it contains the pattern "b.b"
     */
    public static boolean bobThere(String str) {
        return str.matches(".*b.b.*");
    }

    /**
     * Java 11 not supported by CodingBat, see {@linkplain String2#repeatEnd(String, int)}
     */
    public static String repeatEnd11(String str, int n) {
        return str.substring(str.length() - n).repeat(n);
    }

    /**
     * codingbat.com/prob/p152339
     *
     * @param str a possibly empty string
     * @param n   a number in [0, string.length()]
     * @return The last n char of str repeated n times
     */
    public static String repeatEnd(String str, int n) {
        String base = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(base);
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p136417
     *
     * @param str a non emtpy string
     * @param n   an int in [1,str.length()]
     * @return true if the prefix till n is repeated in the string
     */
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
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
     * codingbat.com/prob/p147448
     *
     * @param str a string
     * @return number of "hi" in the string
     */
    public static int countHi(String str) {
        int count = 0;
        int pos = 0;
        while ((pos = str.indexOf("hi", pos)) != -1) {
            count += 1;
            pos += 1;
        }
        return count;
    }

    /**
     * codingbat.com/prob/p111624
     *
     * @param str a string
     * @return true if same number of "cat" and "dog"
     */
    public static boolean catDog(String str) {
        return counter(str, "cat") == counter(str, "dog");
    }

    /**
     * Helper for {@linkplain String2#catDog(String)}
     *
     * @param s      where to search
     * @param target what to search
     * @return number of targets
     */
    private static int counter(String s, String target) {
        int count = 0;
        int pos = 0;
        while ((pos = s.indexOf(target, pos)) != -1) {
            count += 1;
            pos += 1;
        }
        return count;
    }

    /**
     * codingbat.com/prob/p126880
     *
     * @param a first
     * @param b second
     * @return true if one ends with other (case insensitive)
     */
    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() == b.length()) {
            return a.equals(b);
        }
        String shorter = a.length() < b.length() ? a : b;
        String longer = a.length() > b.length() ? a : b;
        String other = longer.substring(longer.length() - shorter.length());
        return shorter.equals(other);
    }

    /**
     * codingbat.com/prob/p136594
     *
     * @param str a string
     * @return true if contains "xyz" _not_ prefixed by '.'
     */
    public static boolean xyzThere(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }

        int pos = 1;
        while ((pos = str.indexOf("xyz", pos)) != -1) {
            if (str.charAt(pos - 1) != '.') {
                return true;
            }
            pos += 1;
        }

        return false;
    }

    /**
     * codingbat.com/prob/p134250
     *
     * @param str a string
     * @return true if the string is x-y balanced - a y balances all the previous x
     */
    public static boolean xyBalance(String str) {
        return str.indexOf('x', str.lastIndexOf('y') + 1) == -1;
    }

    /**
     * codingbat.com/prob/p125185
     *
     * @param a first
     * @param b second
     * @return mix a and b, one char for each, leftover as tail
     */
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();

        final int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        String longest = a.length() > b.length() ? a : b;
        result.append(longest.substring(len));

        return result.toString();
    }

    /**
     * codingbat.com/prob/p128796
     *
     * @param str a string
     * @param n   [0..len]
     * @return scaling n concatenated fragments of str
     */
    public static String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            result.append(str, 0, i);
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p109637
     *
     * @param word  a word
     * @param sep   a connector
     * @param count an integer
     * @return count times word connected by sep
     */
    public static String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i < count; i++) {
            result.append(word);
            result.append(sep);
        }
        result.append(word);

        return result.toString();
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
