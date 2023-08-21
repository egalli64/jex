/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

/**
 * luckySum - https://codingbat.com/prob/p130788
 * <p>
 * Add up all the values passed, but not 13 and its followers
 */
public class LuckySum {
    /**
     * Stop adding values when a 13 is seen
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return conditional sum
     */
    public static int solution(int a, int b, int c) {
        int sum = 0;

        if (a == 13) {
            return sum;
        } else {
            sum += a;
        }

        if (b == 13) {
            return sum;
        } else {
            sum += b;
        }

        if (c != 13) {
            sum += c;
        }

        return sum;
    }
}
