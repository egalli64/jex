/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * blueTicket - https://codingbat.com/prob/p192267
 * <p>
 * The three input values, accordingly to their value, return:
 * <li>20: all same
 * <li>10: a couple
 * <li>0: all different
 */
public class BlueTicket {
    /**
     * 
     * 
     * @param a ticket
     * @param b ticket
     * @param c ticket
     * @return sum ab, bc, ac; all 10 -> 10; ab is 10 + bc or ac -> 5, else 0
     */
    public static int solution(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        if (ab == 10 || ac == 10 || bc == 10) {
            return 10;
        } else if (ab == 10 + bc || ab == 10 + ac) {
            return 5;
        } else {
            return 0;
        }
    }
}
