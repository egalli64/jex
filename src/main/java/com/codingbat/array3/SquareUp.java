/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

/**
 * squareUp - https://codingbat.com/prob/p155405
 * <p>
 * Generate an array from the passed non-negative integer n. Its size is n
 * squared, and its values are n sub-sequences from 0..1 to n..1
 */
public class SquareUp {
    /**
     * Create an array sized n * n, loop n times, to set the values in the n
     * sections. Loop on each section, from right to left, filling in the first time
     * just one element, increasing each time.
     *
     * @param n an integer
     * @return the generated array
     */
    public static int[] solution(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= n - 1 - i; j--) {
                result[i * n + j] = n - j;
            }
        }
        return result;
    }
}
