/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

/**
 * scoresAverage - https://codingbat.com/prob/p123837
 * <p>
 * Given an array sized 2+, return the biggest _int_ average of its left/right
 * sides. The second half begins at length/2.
 */
public class ScoresAverage {
    /**
     * Delegate to {@linkplain ScoresAverage#average(int[], int, int)} the average
     * generation.
     *
     * @param scores an array
     * @return the result
     */
    public static int solution(int[] scores) {
        int center = scores.length / 2;
        int left = average(scores, 0, center);
        int right = average(scores, center, scores.length);
        return Math.max(left, right);
    }

    /**
     * Helper for {@linkplain ScoresAverage#solution(int[])}. Calculate the _int_
     * average on a specified range for the passed array.
     *
     * @param scores an array
     * @param start  begin index
     * @param end    first out of bound index
     * @return the _int_ average for the specified elements
     */
    private static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }
}
