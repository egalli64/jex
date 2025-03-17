/*
 * 2206. Divide Array Into Equal Pairs - https://leetcode.com/problems/divide-array-into-equal-pairs/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an arry with 2*n elements, check if it contains n couples of same
 * elements
 */
public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        Set<Integer> checks = new HashSet<>();
        for (Integer num : nums) {
            if (!checks.remove(num)) {
                checks.add(num);
            }
        }

        return checks.isEmpty();
    }
}
