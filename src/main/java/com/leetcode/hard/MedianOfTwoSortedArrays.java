/*
 * 4. Median of Two Sorted Arrays - https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * Given two sorted arrays, return the median of the two sorted arrays
 * 
 * Precondition: each array could be empty but at least one should be not empty
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
    public double linearSolution(int[] nums1, int[] nums2) {
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

    /**
     * O(log n) solution, by binary search
     * 
     * @param left  a possibly empty sorted array
     * @param right another possibly empty sorted array
     * @return the merged array
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] shorty = nums1.length < nums2.length ? nums1 : nums2;
        int[] longy = nums2.length > nums1.length ? nums2 : nums1;

        int begin = 0;
        int end = shorty.length;
        final int center = (shorty.length + longy.length + 1) / 2;

        while (begin <= end) {
            int pivot = (begin + end) / 2;
            int left = pivot == 0 ? Integer.MIN_VALUE : shorty[pivot - 1];
            int right = pivot == shorty.length ? Integer.MAX_VALUE : shorty[pivot];

            int pivotLongy = center - pivot;
            int leftLongy = pivotLongy == 0 ? Integer.MIN_VALUE : longy[pivotLongy - 1];
            int rightLongy = pivotLongy == longy.length ? Integer.MAX_VALUE : longy[pivotLongy];

            if (left <= rightLongy && leftLongy <= right) {
                double result = Math.max(left, leftLongy);
                if ((shorty.length + longy.length) % 2 == 1) {
                    return result;
                } else {
                    return (result + Math.min(right, rightLongy)) / 2;
                }
            } else if (left > rightLongy) {
                end = pivot - 1;
            } else {
                begin = pivot + 1;
            }
        }
        throw new IllegalStateException("Are the arrays sorted?");
    }
}
