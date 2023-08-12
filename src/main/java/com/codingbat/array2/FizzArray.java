/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * fizzArray - https://codingbat.com/prob/p180920
 * <p>
 * Generate an array sized n with the natural (zero-based) sequence
 */
public class FizzArray {
    /**
     * Create an array sized n, fill it and return it
     *
     * @param n a non-negative integer
     * @return the generated array
     */
    public static int[] solution(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = i;
        }

        return result;
    }
}
