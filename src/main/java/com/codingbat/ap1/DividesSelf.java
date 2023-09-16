/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

/**
 * dividesSelf - https://codingbat.com/prob/p165941
 * <p>
 * Check if each digit (base ten) of a positive integer are divisor of the whole
 * number.
 */
public class DividesSelf {
    /**
     * Copy the number in a buffer, loop on it until it is reduced to zero. Get at
     * each iteration the rightmost digit, if it is not a divisor return false.
     * Beware of zero.
     *
     * @param n positive, non-zero
     * @return true if each digit is a divisor of n
     */
    public static boolean solution(int n) {
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            } else {
                temp /= 10;
            }
        }

        return true;
    }

    /**
     * For loop
     * 
     * @param n positive, non-zero
     * @return true if each digit is a divisor of n
     */
    public static boolean alternative(int n) {
        for (int temp = n; temp > 0; temp /= 10) {
            int digit = temp % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
        }

        return true;
    }
}
