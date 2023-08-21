/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import java.util.Arrays;

/**
 * evenlySpaced - https://codingbat.com/prob/p198700
 * <p>
 * Check if the passed values are evenly spaced. That is, the difference between
 * small and medium is the same as the difference between medium and large.
 */
public class EvenlySpaced {
    /**
     * Put the values in an array, sort it, than check them.
     * 
     * @param a an int
     * @param b an int
     * @param c an int
     * @return true if the three values are evenly spaced
     */
    public static boolean solution(int a, int b, int c) {
        int[] values = { a, b, c };
        Arrays.sort(values);
        return values[1] - values[0] == values[2] - values[1];
    }
}
