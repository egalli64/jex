/*
 * 1346. Check If N and Its Double Exist - https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, check if it contains (at least) a couple of
 * values, where one is the double of the other
 * <p>
 * Constraint: there are at least two elements in the array
 */
public class CheckIfNAndItsDoubleExist {
    /**
     * Checking for double or half of the current element simplify the algorithm.
     * 
     * @param arr the input array
     * @return true if a couple half/double is found
     */
    public boolean checkIfExist(int[] arr) {
        Set<Integer> buffer = new HashSet<>();
        buffer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            if (buffer.contains(cur * 2) || (cur % 2 == 0 && buffer.contains(cur / 2))) {
                return true;
            }
            buffer.add(cur);
        }
        return false;
    }
}
