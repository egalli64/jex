/**
 * https://codingbat.com/java/String-1
 */
package com.codingbat;

public class String1 {
    /**
     * codingbat.com/prob/p144623
     * 
     * @param str   a string sized 2+
     * @param index an integer
     * @return a string length 2 from the given index, or the first 2 chars
     */
    public static String twoChar(String str, int index) {
        if (index < 0 || index > str.length() - 2) {
            index = 0;
        }
        return str.substring(index, index + 2);
    }

    /**
     * codingbat.com/prob/p139075
     * 
     * @param str a possibly empty string
     * @return true if "bad" is @ pos 0 or 1
     */
    public static boolean hasBad(String str) {
        return str.lastIndexOf("bad", 1) > -1;
    }

    /**
     * codingbat.com/prob/p139076
     * 
     * @param str a possibly empty string
     * @return first 2 chars, padded with '@' when too short
     */
    public static String atFirst(String str) {
        int len = Math.min(str.length(), 2);
        StringBuilder result = new StringBuilder(str.substring(0, len));
        for (int i = len; i < 2; i++) {
            result.append('@');
        }
        return result.toString();
    }

    /**
     * codingbat.com/prob/p132118
     * 
     * @param a first string, possibly empty
     * @param b second string, possibly empty
     * @return concatenated string, but no dup for last1/first2 char
     */
    public static String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty() || a.charAt(a.length() - 1) != b.charAt(0)) {
            return a + b;
        }
        return a + b.substring(1);
    }

    /**
     * codingbat.com/prob/p194786
     * 
     * @param str a possibly empty string
     * @return last two chars, if available, swapped
     */
    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    /**
     * codingbat.com/prob/p196652
     * 
     * @param str a string
     * @return true if the first 2 chars are also at the end
     */
    public static boolean frontAgain(String str) {
        int len = str.length();
        if (len < 2) {
            return false;
        }
        return str.charAt(0) == str.charAt(len - 2) && str.charAt(1) == str.charAt(len - 1);
    }

    /**
     * codingbat.com/prob/p105745
     * 
     * @param a left, possibly empty, string
     * @param b right, possibly empty, string
     * @return concatenation of the two strings, cutting the head of the longest one to make them same sized
     */
    public static String minCat(String a, String b) {
        int len = Math.min(a.length(), b.length());
        return a.substring(a.length() - len) + b.substring(b.length() - len);
    }

    /**
     * codingbat.com/prob/p142247
     * 
     * @param str a possibly empty string
     * @return cut the 2 starting chars, if they are also at the end
     */
    public static String without2(String str) {
        if (str.length() < 2 //
                || str.charAt(0) != str.charAt(str.length() - 2) //
                || str.charAt(1) != str.charAt(str.length() - 1)) {
            return str;
        }
        return str.substring(2);
    }

    /**
     * codingbat.com/prob/p110141
     * 
     * @param str a possibly empty string
     * @return remove the first two chars, if not 'a', 'b'
     */
    public static String deFront(String str) {
        StringBuilder result = new StringBuilder();
        if (!str.isEmpty() && str.charAt(0) == 'a') {
            result.append('a');
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result.append('b');
        }
        if (str.length() > 2) {
            result.append(str.substring(2));
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p151940
     * 
     * @param str a possibly empty string
     * @return string without x at begin and end
     */
    public static String withoutX(String str) {
        if (str.isEmpty()) {
            return str;
        }

        int begin = str.charAt(0) == 'x' ? 1 : 0;
        int len = str.length();
        int end = len > 1 && str.charAt(len - 1) == 'x' ? len - 1 : len;
        return str.substring(begin, end);
    }

    /**
     * codingbat.com/prob/p151359
     * 
     * @param str a possibly empty string
     * @return remove the first two chars, if not 'x'
     */
    public static String withoutX2(String str) {
        StringBuilder result = new StringBuilder();

        final int end = Math.min(2, str.length());
        for (int i = 0; i < end; i++) {
            char cur = str.charAt(i);
            if (cur != 'x') {
                result.append(cur);
            }
        }
        if (str.length() > 2) {
            result.append(str.substring(2));
        }

        return result.toString();
    }
}
