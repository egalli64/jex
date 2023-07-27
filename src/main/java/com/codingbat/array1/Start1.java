/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * start1 - https://codingbat.com/prob/p109660
 * <p>
 * Given two (possibly empty) arrays, count the 1 in first position
 */
public class Start1 {
    /**
     * Beware of empty arrays
     * 
     * @param a an array, possibly empty
     * @param b another array, possibly empty
     * @return 0, 1, or 2
     */
    public static int solution(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count += 1;
        }
        if (b.length > 0 && b[0] == 1) {
            count += 1;
        }
        return count;
    }
}
