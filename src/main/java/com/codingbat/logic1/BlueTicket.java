/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * blueTicket - https://codingbat.com/prob/p192267
 * <p>
 * The three input values (a, b, c), check the sums for each couple (ab, ac, bc)
 * to return:
 * <li>10: at least a couple with value 10
 * <li>5: ab is 10 more than ac or bc
 * <li>0: otherwise
 */
public class BlueTicket {
    /**
     * Calculate the couples, check for "ten" couple, then for the difference
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
