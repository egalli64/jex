/**
 * https://codingbat.com/java/AP-1
 */
package com.codingbat;

public class AP1 {
    /**
     * codingbat.com/prob/p100369
     *
     * @param a ordered array, possibly with duplicates
     * @param b ordered array, possibly with duplicates
     * @return count of strings in both array (do not care about duplicates!)
     */
    public static int commonTwo(String[] a, String[] b) {
        int result = 0;

        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i].equals(b[j])) {
                String cur = a[i];
                while (i < a.length && a[i].equals(cur)) {
                    i++;
                }
                while (j < b.length && b[j].equals(cur)) {
                    j++;
                }
                result += 1;
            } else if (a[i].compareTo(b[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
