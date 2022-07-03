/**
 * https://codingbat.com/java/Logic-2
 */
package cb;

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
        if(a != b && a != c) {
            sum += a;
        }
        if(b != a && b != c) {
            sum += b;
        }
        if(c != a && c != b) {
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
        int[] values = {a,b,c};
        Arrays.sort(values);
        return values[1] - values[0] == values[2] - values[1];
    }
}
