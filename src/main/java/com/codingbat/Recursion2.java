/**
 * https://codingbat.com/java/Recursion-2
 */
package com.codingbat;

public class Recursion2 {
    /**
     * codingbat.com/prob/p168295
     *
     * @param nums an array
     * @return true if could be split in two equal subs (all %5 in one, %3 in the
     *         other)
     */
    public static boolean split53(int[] nums) {
        return s53Impl(nums, 0, 0, 0);
    }

    /**
     * Helper for {@linkplain Recursion2#split53(int[])}
     *
     * @param a     array
     * @param i     starting position
     * @param five  total in "five" array
     * @param three total in "three" array
     * @return true if balanced
     */
    private static boolean s53Impl(int[] a, int i, int five, int three) {
        if (i == a.length) {
            return five == three;
        }

        if (a[i] % 5 == 0) {
            return s53Impl(a, i + 1, five + a[i], three);
        } else if (a[i] % 3 == 0) {
            return s53Impl(a, i + 1, five, three + a[i]);
        } else {
            return s53Impl(a, i + 1, five + a[i], three) || s53Impl(a, i + 1, five, three + a[i]);
        }
    }
}
