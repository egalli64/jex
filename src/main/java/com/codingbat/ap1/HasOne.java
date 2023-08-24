/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

/**
 * hasOne - https://codingbat.com/prob/p191212
 * <p>
 * Given a positive integer, check if it contains a 1 digit (base 10)
 */
public class HasOne {
    /**
     * For loop on all the decimal digits
     *
     * @param n a positive number
     * @return true if it contains the digit 1
     */
    public static boolean solution(int n) {
        for (; n > 0; n /= 10) {
            if (n % 10 == 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * While loop on all the decimal digits
     *
     * @param n a positive number
     * @return true if it contains the digit 1
     */
    public static boolean alternative(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            } else {
                n /= 10;
            }
        }
        return false;
    }
}
