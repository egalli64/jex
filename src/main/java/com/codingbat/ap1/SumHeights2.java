/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.stream.IntStream;

/**
 * sumHeights2 - https://codingbat.com/prob/p157900
 * <p>
 * Given an array and a close interval on it [start, end], calculate the sum of
 * deltas between neighbors. Positive deltas should be doubled, negative ones
 * just made positive. It is caller responsibility passing "good" arguments.
 */
public class SumHeights2 {
    /**
     * Loop on the interval, delegate to {@linkplain SumHeights2#mapper(int[], int)}
     * the delta generation, add them up.
     *
     * @param heights an array
     * @param start   first index
     * @param end     last index
     * @return sum of deltas
     */
    public static int solution(int[] heights, int start, int end) {
        int result = 0;

        for (int i = start; i < end; i++) {
            result += mapper(heights, i);
        }

        return result;
    }

    /**
     * Stream on the passed range (open to the right). Delegate to
     * {@linkplain SumHeights2#mapper(int[], int)} the delta generation, map the
     * each array element having index in the range to such delta. Add up all of
     * them.
     *
     * @param heights an array
     * @param start   first index
     * @param end     last index
     * @return sum of deltas
     */
    public static int modern(int[] heights, int start, int end) {
        return IntStream.range(start, end).map(i -> mapper(heights, i)).sum();
    }

    /**
     * Map the element in the passed position to the delta to its right neighbor,
     * calculated as defined by the problem. It is caller responsibility passing
     * good values.
     * 
     * @param xs an array
     * @param i  index of the first element to consider
     * @return delta
     */
    static int mapper(int[] xs, int i) {
        int delta = xs[i + 1] - xs[i];
        return delta < 0 ? -delta : 2 * delta;
    }
}
