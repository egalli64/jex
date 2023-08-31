/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

/**
 * seriesUp - https://codingbat.com/prob/p104090
 * <p>
 * Given a non-negative integer, generate an array with all the natural series
 * from 1 to n.
 * 
 * <pre>
 * The size of the array is:
 * 1 + 2 + 3 + ... + n = n * (n + 1) / 2
 * </pre>
 */
public class SeriesUp {
    /**
     * Create an array with the n-based size. Fill it by two nested loops. The
     * external loop is for the n sub-sequences, the first one is identified by i =
     * 0, the last is i = n-1. The extra loop-variable j is initialized to 0 and
     * used in the internal loop.
     * <p>
     * The internal loop is for setting all the elements of the current
     * sub-sequence. So, k is going from 0 to i (included). The external loop
     * variable j is increased for each iteration in the internal loop, to keep
     * track of the index in the array to set the value each time to k + 1.
     *
     * @param n a non-negative integer
     * @return the generated array
     */
    public static int[] solution(int n) {
        int[] result = new int[n * (n + 1) / 2];

        for (int i = 0, j = 0; i < n; i++) {
            for (int k = 0; k <= i; j++, k++) {
                result[j] = k + 1;
            }
        }

        return result;
    }
}
