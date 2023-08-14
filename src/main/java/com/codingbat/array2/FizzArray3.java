/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

/**
 * fizzArray3 - https://codingbat.com/prob/p142539
 * <p>
 * Generate an array containing the sequence of integer from the specified start
 * to the (excluded) end. It is caller responsibility to pass correctly the
 * limits.
 */
public class FizzArray3 {
    /**
     * Create the array then fill it "by hand"
     * 
     * @param start first (included)
     * @param end   last (excluded)
     * @return the generated array
     */
    public static int[] solution(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        return result;
    }
}
