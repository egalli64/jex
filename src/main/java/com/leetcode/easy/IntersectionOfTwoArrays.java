/*
 * 349. Intersection of Two Arrays - https://leetcode.com/problems/intersection-of-two-arrays/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Generate the intersection of two arrays. Duplicates should be discarded, no
 * order is required
 */
public class IntersectionOfTwoArrays {
    /**
     * Raw intersection, emulating for better timing a simple hash table using the
     * requisite that value should be in [0 .. 1000]
     * 
     * @param nums1 an array
     * @param nums2 another array
     * @return the arrays intersection
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] buffer = new int[1001];
        for (int cur : nums1) {
            buffer[cur] = 1;
        }

        int size = 0;
        for (int cur : nums2) {
            if (buffer[cur] == 1) {
                buffer[cur] = 2;
                size += 1;
            }
        }

        int[] result = new int[size];
        int i = 0;
        int[] shorter = nums1.length < nums2.length ? nums1 : nums2;
        for (int cur : shorter) {
            if (buffer[cur] == 2) {
                buffer[cur] = 4;
                result[i] = cur;
                i += 1;
            }
        }

        return result;
    }

    /**
     * Intersection as Set operation (boxing makes it a bit expensive)
     * 
     * @param nums1 an array
     * @param nums2 another array
     * @return the arrays intersection
     */
    public int[] intersectionByCollection(int[] nums1, int[] nums2) {
        Set<Integer> left = new HashSet<Integer>();
        for (int cur : nums1) {
            left.add(cur);
        }

        Set<Integer> right = new HashSet<Integer>();
        for (int cur : nums2) {
            right.add(cur);
        }

        left.retainAll(right);
        int result[] = new int[left.size()];
        int i = 0;
        for (int cur : left) {
            result[i] = cur;
            i += 1;
        }

        return result;
    }
}
