/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

/**
 * blackjack - https://codingbat.com/prob/p117019
 * <p>
 * Between the passed values, return the closest to 21, but not bigger than
 * that. Or zero.
 */
public class Blackjack {
    /**
     * If a value is 21 or more, consider it as 0. Then return the bigger one.
     *
     * @param a a value
     * @param b another value
     * @return the winner or zero
     */
    public static int solution(int a, int b) {
        if (a > 21) {
            a = 0;
        }
        if (b > 21) {
            b = 0;
        }

        return Math.max(a, b);
    }
}
