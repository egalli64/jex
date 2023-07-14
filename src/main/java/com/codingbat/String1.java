/**
 * https://codingbat.com/java/String-1
 */
package com.codingbat;

public class String1 {
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
