/*
 * LeetCode 4. Median of Two Sorted Arrays
 * Leetcode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * Given two sorted arrays, return the median of the two sorted arrays
 * 
 * The overall run time complexity should be O(log (m+n))
 */
public class MedianOfTwoSortedArrays {
    /**
     * Cheat, merge then get the median - O(m+n)
     * 
     * @param nums1 a possibly empty sorted array
     * @param nums2 another possibly empty sorted array
     * @return the median of the two arrays
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = merge(nums1, nums2);
        int center = merged.length / 2;
        return merged.length % 2 == 1 ? merged[center] : (merged[center] + merged[center - 1]) / 2.0;
    }

    /**
     * Merge two sorted arrays keeping the order
     * 
     * @param left  a possibly empty sorted array
     * @param right another possibly empty sorted array
     * @return the merged array
     */
    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;
        for (; i < left.length && j < right.length; k++) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i += 1;
            } else {
                result[k] = right[j];
                j += 1;
            }
        }

        for (; i < left.length; i++, k++) {
            result[k] = left[i];
        }
        for (; j < right.length; j++, k++) {
            result[k] = right[j];
        }

        return result;
    }
}
