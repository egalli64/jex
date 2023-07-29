/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * plusTwo - https://codingbat.com/prob/p180840
 * <p>
 * Generate an array as concatenation of the passed ones. Notice they are both
 * sized 2.
 */
public class PlusTwo {
    /**
     * By hand solution
     * 
     * @param a an array sized 2
     * @param b another array sized 2
     * @return the concatenation of the two arrays
     */
    public static int[] solution(int[] a, int[] b) {
        return new int[] { a[0], a[1], b[0], b[1] };
    }

    /**
     * Do not rely on the input arrays being sized 2
     * 
     * @param a an array
     * @param b another array
     * @return the concatenation of the two arrays
     */
    public static int[] robustness(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }
}
