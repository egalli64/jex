/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

/**
 * mergeTwo - https://codingbat.com/prob/p139150
 * <p>
 * Given two sorted arrays, with no duplicates, generate a new n-sized array
 * with the first n items, with no duplicates, from the input arrays.
 */
public class MergeTwo {
    /**
     * Create a n-sized array, loop on the resulting array with i as index,
     * something like the merging in merge-sort. Use j as index for a and k as index
     * for b. If the current comparison between a[j] and b[k] shows an equality, use
     * either one, bit increase both indices. Otherwise use the "smaller" one, and
     * increase its index.
     *
     * @param a sorted array, no duplicates, sized n+
     * @param b sorted array, no duplicates, sized n+
     * @param n positive
     * @return n items from the input arrays, keeping the order, no duplicates!
     */
    public static String[] solution(String[] a, String[] b, int n) {
        String[] result = new String[n];

        for (int i = 0, j = 0, k = 0; i < n; i++) {
            if (a[j].equals(b[k])) {
                result[i] = a[j++];
                k++;
            } else {
                result[i] = (a[j].compareTo(b[k]) < 0) ? a[j++] : b[k++];
            }
        }

        return result;
    }
}
