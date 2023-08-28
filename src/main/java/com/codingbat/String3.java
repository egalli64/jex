/**
 * https://codingbat.com/java/String-3
 */
package com.codingbat;

public class String3 {
    /**
     * codingbat.com/prob/p131516
     *
     * @param string a string
     * @return the longest matching substring at the beginning and end of the string
     */
    public static String sameEnds(String string) {
        StringBuilder result = new StringBuilder(string.substring(0, string.length() / 2));

        while (result.length() > 0) {
            String current = result.toString();
            if (string.endsWith(current)) {
                break;
            } else {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }

    /**
     * codingbat.com/prob/p139411
     *
     * @param string a string
     * @return the longest palindromic section of the string
     */
    public static String mirrorEnds(String string) {
        int i = 0;
        for (int j = string.length() - 1; i < j; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                break;
            }
        }
        return i == string.length() / 2 ? string : string.substring(0, i);
    }

    /**
     * codingbat.com/prob/p179479
     * 
     * @param str a string
     * @return size of the largest sequence of same char
     */
    public static int maxBlock(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            int candidate = 1;
            for (int j = i + 1; j < str.length() && cur == str.charAt(j); j++) {
                i++;
                candidate += 1;
            }
            result = Math.max(candidate, result);
        }

        return result;
    }

    /**
     * codingbat.com/prob/p121193
     * 
     * @param str a string
     * @return sum of numbers (sequence of digit) in the string
     */
    public static int sumNumbers(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            int number = Character.isDigit(cur) ? cur - '0' : 0;
            for (int j = i + 1; j < str.length() && Character.isDigit(cur = str.charAt(j)); j++) {
                i++;
                number *= 10;
                number += cur - '0';
            }
            result += number;
        }

        return result;
    }

    /**
     * codingbat.com/prob/p154137
     * 
     * @param str a string
     * @return "is" without letters around is replaced by "is not"
     */
    public static String notReplace(String str) {
        StringBuilder result = new StringBuilder(str);

        int pos = -1;
        while ((pos = result.indexOf("is", pos)) != -1) {
            if (pos != 0 && Character.isLetter(result.charAt(pos - 1))) {
                pos += 3;
                continue;
            }
            if (pos != result.length() - 2 && Character.isLetter(result.charAt(pos + 2))) {
                pos += 3;
                continue;
            }
            result.insert(pos + 2, " not");
            pos += 6;
        }

        return result.toString();
    }
}
