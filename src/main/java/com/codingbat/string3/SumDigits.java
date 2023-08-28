/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * sumDigits - https://codingbat.com/prob/p197890
 * <p>
 * Sum each single digit in the passed string.
 */
public class SumDigits {
    /**
     * Loop on all char in the string. If a char is actually a digit, convert it to
     * integer and add it to the accumulator.
     * 
     * @param str a string
     * @return sum of all the digits in the string
     */
    public static int solution(String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                result += c - '0';
            }
        }
        return result;
    }

    /**
     * Loop on all char in the string. If a char is actually a digit, convert it to
     * integer and add it to the accumulator.
     * 
     * @param str a string
     * @return sum of all the digits in the string
     */
    public static int alternative(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                result += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return result;
    }
}
