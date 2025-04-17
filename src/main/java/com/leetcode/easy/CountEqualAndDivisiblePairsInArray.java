/*
 * 2176. Count Equal and Divisible Pairs in an Array - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * How many pairs in the passed array have the same value AND the product of
 * their indices is divisible by k
 * <p>
 * Constraints: 0 <= i < j < n
 */
public class CountEqualAndDivisiblePairsInArray {
    public int countPairs(int[] nums, int k) {
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i * j % k == 0 && nums[i] == nums[j]) {
                    result += 1;
                }
            }
        }

        return result;
    }
}
