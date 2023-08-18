/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repository - https://github.com/egalli64/jex/
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
        int ma = a % 10;
        int mb = b % 10;
        int mc = c % 10;
        return ma == mb || mb == mc || mc == ma;
    }

    /**
     * Same, but in a more compact way
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if at least two values have the same last decimal digit
     */
    public static boolean compact(int a, int b, int c) {
        a %= 10;
        b %= 10;
        c %= 10;
        return a == b || b == c || c == a;
    }
}
