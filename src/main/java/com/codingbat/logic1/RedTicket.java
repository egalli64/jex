/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * redTicket - https://codingbat.com/prob/p170833
 * <p>
 * The three input values are in 0, 1, 2. Accordingly to their value, return:
 * <li>10: a triplet of 2
 * <li>5: a triplet of 1 or 0
 * <li>1: b and c are not the same of a
 * <li>0: other cases
 */
public class RedTicket {
    /**
     * Check the triplets, then the different values, then return the default
     * 
     * @param a [0,1,2]
     * @param b [0,1,2]
     * @param c [0,1,2]
     * @return 0, 1, 5, or 10
     */
    public static int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return a == 2 ? 10 : 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }
}
