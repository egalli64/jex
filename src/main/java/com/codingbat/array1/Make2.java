/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * make2 - https://codingbat.com/prob/p143461
 * <p>
 * Given two arrays, generate a new array sized 2. Put in it the first two
 * elements from the first array, if available, otherwise use elements from the
 * second array. Assume the two input arrays combined have at least 2 elements
 * in them.
 */
public class Make2 {
    /**
     * Using System.arraycopy - currently NOT supported by CodingBat
     * 
     * @param a first possibly empty array
     * @param b second possibly empty array
     * @return a size 2 array from the concatenation of the input
     */
    public static int[] unsupported(int[] a, int[] b) {
        final int lenR = 2;
        int[] result = new int[lenR];

        final int lenA = Math.min(2, a.length);
        System.arraycopy(a, 0, result, 0, lenA);
        System.arraycopy(b, 0, result, lenA, lenR - lenA);

        return result;
    }

    /**
     * Loop (when required) on both arrays
     * 
     * @param a first possibly empty array
     * @param b second possibly empty array
     * @return a size 2 array from input concatenation
     */
    public static int[] solution(int[] a, int[] b) {
        final int lenR = 2;
        int[] result = new int[lenR];

        final int lenA = Math.min(lenR, a.length);
        for (int i = 0, j = 0; i < lenA; i++, j++) {
            result[i] = a[j];
        }

        for (int i = lenA, j = 0; i < lenR; i++, j++) {
            result[i] = b[j];
        }

        return result;
    }
}
