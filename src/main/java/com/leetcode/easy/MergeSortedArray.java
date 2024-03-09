/*
 * 88. Merge Sorted Array - https://leetcode.com/problems/merge-sorted-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given two integer arrays sorted in non-decreasing, merge them into a single
 * sorted array
 * 
 * The result should be placed in the first parameter, which size is ready to
 * accept the other array elements
 */
public class MergeSortedArray {
    /**
     * Merge the two arrays in the first one
     * 
     * @param nums1 a sorted array
     * @param m     the first array numbers of "good" elements
     * @param nums2 a sorted array
     * @param n     the second array size
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;

        for (m -= 1, n -= 1; m >= 0 && n >= 0; i--) {
            if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m -= 1;
            } else {
                nums1[i] = nums2[n];
                n -= 1;
            }
        }

        while (n >= 0) {
            nums1[i] = nums2[n];
            n -= 1;
            i -= 1;
        }
    }
}
