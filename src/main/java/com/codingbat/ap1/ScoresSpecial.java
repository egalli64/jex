/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.Arrays;

/**
 * scoresSpecial - https://codingbat.com/prob/p140485
 * <p>
 * Calculate the sum of the largest "special score" in the two passed array. A
 * "special score" is just a multiple of 10. If no special score is available,
 * return zero.
 */
public class ScoresSpecial {
    /**
     * Delegate to {@linkplain ScoresSpecial#solution(int[])} the search for the max
     * special scores in the two arrays, then add them up.
     *
     * @param a an array
     * @param b another array
     * @return the max special scores sum
     */
    public static int solution(int[] a, int[] b) {
        return solution(a) + solution(b);
    }

    /**
     * Get the max special value in the passed array
     *
     * @param values an array
     * @return the largest special value, or zero
     */
    static int solution(int[] values) {
        int result = 0;

        for (int value : values) {
            if (value % 10 == 0) {
                result = Math.max(value, result);
            }
        }

        return result;
    }

    /**
     * Stream the array, filter to keep the modulo 10 elements, extract the max
     * value or zero.
     *
     * @param values an array
     * @return the largest special value, or zero
     */
    static int modern(int[] values) {
        return Arrays.stream(values).filter(x -> x % 10 == 0).max().orElse(0);
    }
}
