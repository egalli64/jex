/**
 * https://codingbat.com/java/Array-1
 */
package com.codingbat;

public class Array1 {
    /**
     * codingbat.com/prob/p143461
     * 
     * @param a first possibly empty array
     * @param b second possibly empty array
     * @return a size 2 array from the concatenation of the input
     */
    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];

        int lenA = Math.min(2, a.length);
        System.arraycopy(a, 0, result, 0, lenA);

        for (int i = lenA, j = 0; i < 2; i++, j++) {
            result[i] = b[j];
        }

        return result;
    }

    /**
     * codingbat.com/prob/p128270
     * 
     * @param a first possibly empty array
     * @param b second possibly empty array
     * @return the first elements of the arrays (when available)
     */
    public static int[] front11(int[] a, int[] b) {
        boolean aGood = a.length > 0;
        boolean bGood = b.length > 0;
        int[] result = new int[(aGood ? 1 : 0) + (bGood ? 1 : 0)];

        if (aGood) {
            result[0] = a[0];
        }
        if (bGood) {
            result[aGood ? 1 : 0] = b[0];
        }

        return result;
    }
}
