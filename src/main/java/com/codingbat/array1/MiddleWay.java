/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * middleWay - https://codingbat.com/prob/p146449
 * <p>
 * Given two arrays sized 3, generate a new array with their central elements
 */
public class MiddleWay {
    /**
     * Create a two-element array on the fly
     *
     * @param a an array sized 3
     * @param b an array sized 3
     * @return an array containing the central values from the input arrays
     */
    public static int[] solution(int[] a, int[] b) {
        return new int[] { a[1], b[1] };
    }
}
