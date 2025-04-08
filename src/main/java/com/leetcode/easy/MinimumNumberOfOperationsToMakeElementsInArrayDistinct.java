/*
 * 3396. Minimum Number of Operations to Make Elements in Array Distinct - https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * How many removal of the first three elements in the input array are required
 * to leave just distinct elements in it?
 * <p>
 * The input array is not empty
 */
public class MinimumNumberOfOperationsToMakeElementsInArrayDistinct {
    public int minimumOperations(int[] nums) {
        Set<Integer> checker = new HashSet<>();
        checker.add(nums[nums.length - 1]);
        for (int i = 1; i < nums.length; i++) {
            if (!checker.add(nums[nums.length - (i + 1)])) {
                break;
            }
        }
        int excess = nums.length - checker.size();

        return excess / 3 + (excess % 3 == 0 ? 0 : 1);
    }
}
