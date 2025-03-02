/*
 * 2570. Merge Two 2D Arrays by Summing Values - https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Arrays;

/**
 * Given an array of pairs, where a pair is a two-item array, both ones ordered
 * naturally by key, merge the pairs having the same key adding their value in
 * the result.
 * <p>
 * Constraints: both array are not empty, having unique key, naturally ordered.
 * Their length could be different.
 */
public class MergeTwo2DArraysBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] result = new int[nums1.length + nums2.length][2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                result[k][0] = nums1[i][0];
                result[k][1] = nums1[i][1] + nums2[j][1];
                i += 1;
                j += 1;
            } else if (nums1[i][0] < nums2[j][0]) {
                result[k][0] = nums1[i][0];
                result[k][1] = nums1[i][1];
                i += 1;
            } else {
                result[k][0] = nums2[j][0];
                result[k][1] = nums2[j][1];
                j += 1;
            }
            k += 1;
        }

        while (i < nums1.length) {
            result[k][0] = nums1[i][0];
            result[k][1] = nums1[i][1];
            i += 1;
            k += 1;
        }

        while (j < nums2.length) {
            result[k][0] = nums2[j][0];
            result[k][1] = nums2[j][1];
            j += 1;
            k += 1;
        }

        return Arrays.copyOf(result, k);
    }
}
