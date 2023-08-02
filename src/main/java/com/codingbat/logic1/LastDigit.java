/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * lastDigit - https://codingbat.com/prob/p169213
 * <p>
 * Check if at least two input integers have the same last (decimal) digit
 */
public class LastDigit {
    /**
     * Compare the modulo of input values
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if at least two values have the same last decimal digit
     */
    public static boolean solution(int a, int b, int c) {
        a %= 10;
        b %= 10;
        c %= 10;
        return a == b || b == c || c == a;
    }
}
