/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * repeatFront - https://codingbat.com/prob/p128796
 * <p>
 * Generate a new string repeating n times the front chars of the passed string
 * in scaling way, meaning, n, n - 1, ... down to the first char alone. It is
 * caller responsibility to pass a "good" n in [0, string.length()]
 */
public class RepeatFront {
    /**
     * Append to a string builder fragments of the original string, from size n down
     * to size 1
     *
     * @param str a string
     * @param n   [0..len]
     * @return the generated string
     */
    public static String solution(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            result.append(str, 0, i);
        }

        return result.toString();
    }
}
