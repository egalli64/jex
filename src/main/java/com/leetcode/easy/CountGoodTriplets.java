/*
 * 1534. Count Good Triplets - https://leetcode.com/problems/count-good-triplets/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * A triplet is good if:
 * <ul>
 * <li>0 <= i < j < k < len
 * <li>|arr[i] - arr[j]| <= a
 * <li>|arr[j] - arr[k]| <= b
 * <li>|arr[i] - arr[k]| <= c
 * </ul>
 * Count how many triplets are good in the passed array.
 */
public class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            result += 1;
                        }
                    }
                }
            }
        }

        return result;
    }
}
