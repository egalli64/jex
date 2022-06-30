/**
 * https://codingbat.com/java/Logic-2
 */
package cb;

public class Logic2 {
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
}
