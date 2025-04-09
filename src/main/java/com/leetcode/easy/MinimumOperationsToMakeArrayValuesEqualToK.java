/*
 * 3375. Minimum Operations to Make Array Values Equal to K - https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Check the values in the passed array. If there is at least a value less than
 * k return -1 (invalid value detected), otherwise return the number of distinct
 * elements in input bigger than k.
 */
public class MinimumOperationsToMakeArrayValuesEqualToK {
    public int minOperations(int[] nums, int k) {
        Set<Integer> checker = new HashSet<>();
        for (int num : nums) {
            if (num < k) {
                return -1;
            } else if (num > k) {
                checker.add(num);
            }
        }

        return checker.size();
    }
}
