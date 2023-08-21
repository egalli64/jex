/**
 * https://codingbat.com/java/Logic-2
 */
package com.codingbat;

import java.util.Arrays;

public class Logic2 {
    private Logic2() {
    }

    /**
     * codingbat.com/prob/p117019
     *
     * @param a first positive number
     * @param b second positive number
     * @return the closest to 21, but not over it, or zero
     */
    public static int blackjack(int a, int b) {
        if (a > 21) {
            a = 0;
        }
        if (b > 21) {
            b = 0;
        }

        return Math.max(a, b);
    }

    /**
     * codingbat.com/prob/p186753
     * 
     * @param a a value
     * @param b a value
     * @param c a value
     * @return sum each value rounded to multiple of 10
     */
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    /**
     * Helper for {@linkplain Logic2#roundSum(int, int, int)}
     * 
     * @param num a value
     * @return the value rounded to multiple of 10
     */
    private static int round10(int num) {
        int last = num % 10;
        return last < 5 ? num - last : num + 10 - last;
    }

    /**
     * codingbat.com/prob/p198700
     * 
     * @param a an int
     * @param b an int
     * @param c an int
     * @return true if the three values are evenly spaced (but not necessary
     *         ordered)
     */
    public static boolean evenlySpaced(int a, int b, int c) {
        int[] values = { a, b, c };
        Arrays.sort(values);
        return values[1] - values[0] == values[2] - values[1];
    }

    /**
     * codingbat.com/prob/p138990
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return true if, considering b and c,
     *         <li>one is close (<2) to a
     *         <li>the other is far (>1) to both the others
     */
    public static boolean closeFar(int a, int b, int c) {
        return close(b, a) && far(c, a, b) || close(c, a) && far(b, a, c);
    }

    private static boolean close(int checked, int a) {
        return Math.abs(checked - a) < 2;
    }

    private static boolean far(int checked, int first, int second) {
        return Math.abs(checked - first) > 1 && Math.abs(checked - second) > 1;
    }

    /**
     * codingbat.com/prob/p191363
     * 
     * @param small number of chunks sized one
     * @param big   number of chunks sized five
     * @param goal  the target
     * @return how many small chunk are used (big first), or -1
     */
    public static int makeChocolate(int small, int big, int goal) {
        while (goal >= 5 && big > 0) {
            goal -= 5;
            big -= 1;
        }

        return small >= goal ? goal : -1;
    }
}
