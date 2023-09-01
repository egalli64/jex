/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * shareDigit - https://codingbat.com/prob/p153748
 * <p>
 * Check if the passed integers, both in [10..99], share at least a digit (when
 * represented in decimal format)
 */
public class ShareDigit {
    /**
     * Get the decimal digits from a and b, check for duplicates
     * 
     * @param a [10..99]
     * @param b [10..99]
     * @return true if same digit appears in both numbers
     */
    public static boolean solution(int a, int b) {
        int at = a / 10;
        int au = a % 10;
        int bt = b / 10;
        int bu = b % 10;

        return at == bt || au == bt || at == bu || au == bu;
    }
}
