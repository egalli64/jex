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
     * Loop on the interval, add the delta (doubled or negated) between the current
     * element and the next one to the buffer.
     *
     * @param heights an array
     * @param start   first index
     * @param end     last index
     * @return sum of deltas
     */
    public static int solution(int[] heights, int start, int end) {
        int result = 0;

        for (int i = start; i < end; i++) {
            int delta = heights[i + 1] - heights[i];
            result += delta < 0 ? -delta : 2 * delta;
        }

        return result;
    }

    /**
     * IntStream is (currently) not supported in CodingBat.
     * <p>
     * Stream on the passed range (open to the right). Map each index to the delta
     * (doubled or negated) between the associated element in the array and its
     * follower. Add up all the deltas.
     *
     * @param heights an array
     * @param start   first index
     * @param end     last index
     * @return sum of deltas
     */
    public static int unsupported(int[] heights, int start, int end) {
        return IntStream.range(start, end).map(i -> {
            int delta = heights[i + 1] - heights[i];
            return delta < 0 ? -delta : 2 * delta;
        }).sum();
    }
}
