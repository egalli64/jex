/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * greenTicket - https://codingbat.com/prob/p120633
 * <p>
 * The three input values, accordingly to their value, return:
 * <li>20: all same
 * <li>10: a couple
 * <li>0: all different
 */
public class GreenTicket {
    /**
     * Check for a triplet, then, if not a triplet, check for a couple. By default
     * all three tickets are different.
     * 
     * @param a ticket
     * @param b ticket
     * @param c ticket
     * @return 0, 10, or 20
     */
    public static int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    /**
     * Check for a triplet, then for no match. Finally, having ruled out triplet and
     * no match, it is going to be a couple.
     * 
     * @param a ticket
     * @param b ticket
     * @param c ticket
     * @return 0, 10, or 20
     */
    public static int alternative(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a != b && b != c && a != c) {
            return 0;
        } else {
            return 10;
        }
    }
}
