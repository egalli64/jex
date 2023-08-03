/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * in1To10 - https://codingbat.com/prob/p137365
 * <p>
 * check the passed integer against the interval [1..10], return true if it is:
 * <li>on the border or outside the interval and the flag outsideMode is true
 * <li>inside the close interval and the flag outsideMode is false
 */
public class In1To10 {
    /**
     * Accordingly to the flag, check inside or outside
     * 
     * @param n           an integer
     * @param outsideMode a flag
     * @return true if as stated by the flag
     */
    public static boolean solution(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    /**
     * Same than solution, but using ternary operator
     * 
     * @param n           an integer
     * @param outsideMode a flag
     * @return true if as stated by the flag
     */
    public static boolean oneLiner(int n, boolean outsideMode) {
        return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
    }

    /**
     * Check if n is the lower or upper limit, otherwise check if is in or out
     * 
     * @param n           an integer
     * @param outsideMode a flag
     * @return true if as stated by the flag
     */
    public static boolean alternative(int n, boolean outsideMode) {
        if (n == 1 || n == 10) {
            return true;
        }

        boolean inside = n > 1 && n < 10;
        return outsideMode ? !inside : inside;
    }
}
