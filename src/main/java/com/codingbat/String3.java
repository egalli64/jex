/**
 * https://codingbat.com/java/String-3
 */
package com.codingbat;

public class String3 {
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
