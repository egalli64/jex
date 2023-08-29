/**
 * https://codingbat.com/java/String-3
 */
package com.codingbat;

public class String3 {
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
