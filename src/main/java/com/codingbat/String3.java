/**
 * https://codingbat.com/java/String-3
 */
package com.codingbat;

public class String3 {
    /**
     * codingbat.com/prob/p198664
     *
     * @param str a string
     * @return true if there is no isolated g in the string
     */
    public static boolean gHappy(String str) {
        if (str.isEmpty()) {
            return true;
        }

        if (str.length() == 1) {
            return str.charAt(0) != 'g';
        }

        if (str.charAt(0) == 'g' && str.charAt(1) != 'g') {
            return false;
        }

        if (str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g') {
            return false;
        }

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                return false;
            }
        }

        return true;
    }

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
     * codingbat.com/prob/p192570
     *
     * @param base   a string
     * @param remove a non-empty string to be removed
     * @return a copy of base without any remove (case-insensitive!) in it
     */
    public static String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }

    /**
     * codingbat.com/prob/p195714
     *
     * @param str a string
     * @return how many (possibly overlapping) same char triplet are in the string
     */
    public static int countTriple(String str) {
        int result = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                result += 1;
            }
        }

        return result;
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
     * codingbat.com/prob/p141736
     * 
     * @param str a string
     * @return true if number "is" == number "not"
     */
    public static boolean equalIsNot(String str) {
        String[] tags = { "is", "not" };
        int[] counters = new int[2];

        for (int i = 0; i < tags.length; i++) {
            int pos = 0;
            while ((pos = str.indexOf(tags[i], pos)) != -1) {
                counters[i] += 1;
                pos += 1;
            }
        }
        return counters[0] == counters[1];
    }

    /**
     * codingbat.com/prob/p197890
     * 
     * @param str a string
     * @return sum of all the digits in the string
     */
    public static int sumDigits(String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                result += c - '0';
            }
        }
        return result;
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
