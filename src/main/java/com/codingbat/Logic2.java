/**
 * https://codingbat.com/java/Logic-2
 */
package com.codingbat;

import java.util.Arrays;

public class Logic2 {
    private Logic2() {
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
