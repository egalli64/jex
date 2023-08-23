/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * countHi - https://codingbat.com/prob/p147448
 * <p>
 * Count the number of "hi" in the passed string
 */
public class CountHi {
    /**
     * Use String::indexOf
     *
     * @param str a string
     * @return number of "hi"
     */
    public static int solution(String str) {
        int count = 0;
        int pos = -1;
        while ((pos = str.indexOf("hi", pos + 1)) != -1) {
            count += 1;
        }
        return count;
    }

    /**
     * Check each pair of chars in the string
     *
     * @param str a string
     * @return number of "hi"
     */
    public static int verbose(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count += 1;
                i += 1;
            }
        }

        return count;
    }
}
