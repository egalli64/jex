/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * inOrderEqual - https://codingbat.com/prob/p140272
 * <p>
 * Check if the passed arguments are in natural order. The flag equalOk, when
 * true, signal that the sequence should be non-decreasing, otherwise it should
 * be strictly increasing.
 */
public class InOrderEqual {
    /**
     * Two different checks, chosen by the flag
     * 
     * @param a       first value
     * @param b       second value
     * @param c       third value
     * @param equalOk flag for equality
     * @return true if the values are (strictly) increasing
     */
    public static boolean solution(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }
}
