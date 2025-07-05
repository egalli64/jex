/*
 * 1394. Find Lucky Integer in an Array - https://leetcode.com/problems/find-lucky-integer-in-an-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Find the largest number in the input array having frequency equal to its value, or -1
 */
public class FindLuckyIntegerInArray {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> counter = new TreeMap<>(Comparator.reverseOrder());

        for (int cur : arr) {
            counter.put(cur, counter.getOrDefault(cur, 0) + 1);
        }

        for (var entry : counter.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
