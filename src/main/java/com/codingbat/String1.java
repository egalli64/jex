/**
 * https://codingbat.com/java/String-1
 */
package com.codingbat;

public class String1 {
    /**
     * 
     * @param a first string, possibly empty
     * @param b second string, possibly empty
     * @return two char string, first of a + last of b (@ if missing)
     */
    public static String lastChars(String a, String b) {
        StringBuilder result = new StringBuilder();
        result.append(a.isEmpty() ? '@' : a.charAt(0));
        result.append(b.isEmpty() ? '@' : b.charAt(b.length() - 1));
        return result.toString();
    }

    /**
     * codingbat.com/prob/p199216
     * 
     * @param str a possibly empty string
     * @return "red", "blue", or "", accordingly to the starting tag
     */
    public static String seeColor(String str) {
        String[] tags = { "red", "blue" };
        for (String tag : tags) {
            if (str.startsWith(tag)) {
                return tag;
            }
        }
        return "";
    }

    /**
     * codingbat.com/prob/p172063
     * 
     * @param str a possibly empty string
     * @return the first two chars (if available) times 3
     */
    public static String extraFront(String str) {
        int end = Math.min(str.length(), 2);
        String tag = str.substring(0, end);
        StringBuilder result = new StringBuilder(tag);
        for (int i = 0; i < 2; i++) {
            result.append(tag);
        }
        return result.toString();
    }

    /**
     * Java 11 currently not supported by Coding Bat
     * 
     * @param str a possibly empty string
     * @return the first two chars (if available) times 3
     */
    public static String extraFront11(String str) {
        int end = Math.min(str.length(), 2);
        return str.substring(0, end).repeat(3);
    }

    /**
     * codingbat.com/prob/p141494
     * 
     * @param str  a non-empty string
     * @param word a non-empty checking string
     * @return the start of str if matches with word (first char excluded)
     *         <li>empty string otherwise
     */
    public static String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        String tag = str.substring(0, word.length());
        return tag.substring(1).equals(word.substring(1)) ? tag : "";
    }

    /**
     * Java 11 currently not supported by Coding Bat
     * 
     * @param str a string sized 2+
     * @return 3 copies of the last 2 chars
     */
    public static String extraEnd11(String str) {
        return str.substring(str.length() - 2).repeat(3);
    }

    /**
     * codingbat.com/prob/p174148
     * 
     * @param str a string size n+
     * @param n   a non-negative integer
     * @return the first and last n chars
     */
    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

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
