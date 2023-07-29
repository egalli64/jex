/**
 * https://codingbat.com/java/Array-1
 */
package com.codingbat;

public class Array1 {
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
