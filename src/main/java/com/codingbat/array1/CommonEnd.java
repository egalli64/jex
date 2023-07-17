/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

/**
 * commonEnd - https://codingbat.com/prob/p191991
 * <p>
 * check if the two passed (non-empty) arrays have the same value in the first
 * or last position
 */
public class CommonEnd {
    /**
     * read array element, logical or
     *
     * @param a first non-empty array of int
     * @param b second non-empty array of int
     * @return true the two arrays have same first or last element
     */
    public static boolean solution(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
