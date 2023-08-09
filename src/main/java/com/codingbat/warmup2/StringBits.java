/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * stringBits - https://codingbat.com/prob/p165666
 * <p>
 * Generating a string skipping every second char from input
 */
public class StringBits {
    /**
     * Append in the resulting string buffer only the chars in even positions
     * 
     * @param str a string
     * @return copy of input string stripped of chars in odd position
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
