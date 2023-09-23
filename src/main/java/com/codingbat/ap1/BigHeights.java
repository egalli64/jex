/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.stream.IntStream;

/**
 * bigHeights - https://codingbat.com/prob/p197710
 * <p>
 * Given an array and a close interval on it [start, end], count the number of
 * "big steps" (5+) between neighbors. It is caller responsibility passing
 * "good" arguments.
 */
public class BigHeights {
    /**
     * Loop on the interval, ask to {@linkplain BigHeights#mapper(int[], int)} if
     * the current step is big (1) or not (0), and keep track of each big step.
     *
     * @param heights an array
     * @param start   first of sub
     * @param end     last of sub
     * @return number of 5+ steps in range
     */
    public static int solution(int[] heights, int start, int end) {
        int result = 0;

        for (int i = start; i < end; i++) {
            result += mapper(heights, i);
        }

        return result;
    }

    /**
     * Stream on the passed range (open to the right). Map each index to 1, for big
     * step, or 0 - mapping done by {@linkplain BigHeights#mapper(int[], int)} Add
     * up all counters.
     *
     * @param heights an array
     * @param start   first index
     * @param end     last index
     * @return sum of counters
     */
    public static int modern(int[] heights, int start, int end) {
        return IntStream.range(start, end).map(i -> mapper(heights, i)).sum();
    }

    /**
     * Map the element in the passed position to 1 or 0, accordingly if it is a big
     * step or not. It is caller responsibility passing good values.
     * 
     * @param xs an array
     * @param i  index of the first element to consider
     * @return big step flag
     */
    static int mapper(int[] xs, int i) {
        return Math.abs(xs[i] - xs[i + 1]) >= 5 ? 1 : 0;
    }
}
