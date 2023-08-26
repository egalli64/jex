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
     * Loop on the interval, add one to the counter if the current step is big
     * enough.
     *
     * @param heights an array
     * @param start   first of sub
     * @param end     last of sub
     * @return number of 5+ steps in range
     */
    public static int solution(int[] heights, int start, int end) {
        int result = 0;

        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                result += 1;
            }
        }

        return result;
    }

    /**
     * IntStream is (currently) not supported in CodingBat.
     * <p>
     * Stream on the passed range (open to the right). Map each index to 1, for big
     * step, or 0. Add up all counters.
     *
     * @param heights an array
     * @param start   first index
     * @param end     last index
     * @return sum of counters
     */
    public static int unsupported(int[] heights, int start, int end) {
        return IntStream.range(start, end).map(i -> Math.abs(heights[i] - heights[i + 1]) >= 5 ? 1 : 0).sum();
    }
}
