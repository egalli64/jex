/**
 * https://codingbat.com/java/Logic-2
 */
package com.codingbat;

import java.util.Arrays;

public class Logic2 {
    private Logic2() {
    }

    /**
     * codingbat.com/prob/p183562
     *
     * @param small number of bricks sized 1
     * @param big   number of bricks sized 5
     * @param goal  wall size
     * @return true if we can build a wall sized goal with the given bricks
     */
    public static boolean makeBricks(int small, int big, int goal) {
        return goal <= big * 5 + small && goal % 5 <= small;
    }

    /**
     * helper for {@linkplain Logic2#noTeenSum(int, int, int)}
     *
     * @param n an age
     * @return n or zero
     */
    private static int fixTeen(int n) {
        return n < 13 || n == 15 || n == 16 || n > 19 ? n : 0;
    }

    /**
     * codingbat.com/prob/p182879
     *
     * @param a first age
     * @param b second age
     * @param c third age
     * @return the sum of the three input values, with a fix in some special cases
     */
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
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
     * codingbat.com/prob/p148972
     * 
     * @param a a value
     * @param b a value
     * @param c a value
     * @return the sum of the passed value, if not duplicated
     */
    public static int loneSum(int a, int b, int c) {
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
     * @return true if the three values are evenly spaced (but not necessary ordered)
     */
    public static boolean evenlySpaced(int a, int b, int c) {
        int[] values = { a, b, c };
        Arrays.sort(values);
        return values[1] - values[0] == values[2] - values[1];
    }

    /**
     * codingbat.com/prob/p130788
     * 
     * @param a first value
     * @param b second value
     * @param c third value
     * @return sum, but 13 and follower do not count
     */
    public static int luckySum(int a, int b, int c) {
        boolean skip = false;
        int sum = 0;

        if (a == 13) {
            skip = true;
        } else {
            sum += a;
        }

        if (b == 13) {
            skip = true;
        } else if (!skip) {
            sum += b;
        }

        if (c != 13 && !skip) {
            sum += c;
        }

        return sum;
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
