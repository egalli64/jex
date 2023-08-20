/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

/**
 * loneSum - https://codingbat.com/prob/p148972
 * <p>
 * Add up all the _non duplicated_ passed values
 */
public class LoneSum {
    /**
     * Before adding each value to the accumulator, check if it is duplicated
     * 
     * @param a a value
     * @param b a value
     * @param c a value
     * @return the conditioned sum
     */
    public static int solution(int a, int b, int c) {
        int sum = 0;

        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }

        return sum;
    }

    /**
     * Before adding each value to the accumulator, check if it is duplicated
     * 
     * @param a a value
     * @param b a value
     * @param c a value
     * @return the conditioned sum
     */
    public static int compact(int a, int b, int c) {
        int sum = a != b && a != c ? a : 0;
        sum += b != a && b != c ? b : 0;
        sum += c != a && c != b ? c : 0;

        return sum;
    }
}
