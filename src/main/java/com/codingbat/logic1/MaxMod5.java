/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * maxMod5 - https://codingbat.com/prob/p115384
 * <p>
 * Check the two passed integers. Return:
 * <li>0, if they are equal
 * <li>the smaller, if they are equal modulo 5
 * <li>the larger, otherwise
 */
public class MaxMod5 {
    /**
     * Check and return
     * 
     * @param a first value
     * @param b second value
     * @return 0, the smaller or the larger value
     */
    public static int solution(int a, int b) {
        if (a == b) {
            return 0;
        } else if(a % 5 == b % 5) {
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }
    }
}
