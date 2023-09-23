/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.stream.IntStream;

/**
 * sumHeights - https://codingbat.com/prob/p148138
 * <p>
 * Given an array and a close interval on it [start, end], calculate the sum of
 * (positive) deltas between neighbors. It is caller responsibility passing
 * "good" arguments.
 */
public class SumHeights {
    /**
     * Loop on the interval, add the absolute delta between the current element and
     * the next one to the buffer.
     *
     * @param heights an array
     * @param start   first index
     * @param end     last index
     * @return sum of deltas
     */
    public static int solution(int[] heights, int start, int end) {
        int result = 0;

        for (int i = start; i < end; i++) {
            result += Math.abs(heights[i] - heights[i + 1]);
        }

        return result;
    }

    /**
     * Stream on the passed range (open to the right). Map each index to the delta
     * between the associated element in the array and its follower. Add up all the
     * deltas.
     *
     * @param heights an array
     * @param start   first index
     * @param end     last index
     * @return sum of deltas
     */
    public static int modern(int[] heights, int start, int end) {
        return IntStream.range(start, end).map(i -> Math.abs(heights[i] - heights[i + 1])).sum();
    }
}
