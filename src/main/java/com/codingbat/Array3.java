/**
 * https://codingbat.com/java/Array-3
 */
package com.codingbat;

public class Array3 {
    /**
     * codingbat.com/prob/p104090
     *
     * @param n a (small) int
     * @return an array for all the natural series from 1 to n
     */
    public static int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];

        for (int i = 0, j = 0; i < n; i++) {
            for (int k = 0; k <= i; j++, k++) {
                result[j] = k + 1;
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p134022
     *
     * @param outer a "container" sorted array
     * @param inner a "contained" sorted array
     * @return true if inner is actually in outer
     */
    public static boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        for (int j = 0; i < inner.length && j < outer.length;) {
            if (inner[i] > outer[j]) {
                j += 1;
            } else if (inner[i] != outer[j]) {
                return false;
            } else {
                i += 1;
            }
        }
        return i == inner.length;
    }

    /**
     * codingbat.com/prob/p196409
     *
     * @param nums an array
     * @return max count of "mirrored" elements
     */
    public static int maxMirror(int[] nums) {
        int result = 0;

        for (int left = 0; left < nums.length; left++) {
            for (int right = nums.length - 1; right > -1; right--) {
                int current = 0;

                for (int i = left, j = right; i < nums.length && j > -1 && nums[i] == nums[j]; i++, j--) {
                    current += 1;
                }

                result = Math.max(result, current);
            }
        }

        return result;
    }

    /**
     * codingbat.com/prob/p155405
     *
     * @param n non-negative
     * @return size n^2, n sub from 0..1 to n..1
     */
    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= n - 1 - i; j--) {
                result[i * n + j] = n - j;
            }
        }
        return result;
    }

    /**
     * codingbat.com/prob/p193817
     *
     * @param nums an array
     * @return number of groups (2+) of same values
     */
    public static int countClumps(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                counter += 1;
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i += 1;
                }
            }
        }

        return counter;
    }
}
