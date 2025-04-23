/*
 * 1399. Count Largest Group - https://leetcode.com/problems/count-largest-group/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * For a given integer n, partition the values in [1 .. n] accordingly with the
 * sum of their digits. Returns how many groups have the largest size.
 */
public class CountLargestGroup {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> counter = new HashMap<>();
        int maxSize = 0;
        for (int i = 1; i <= n; i++) {
            int key = countDigit(i);
            int size = counter.getOrDefault(key, 0) + 1;

            counter.put(key, size);
            maxSize = Math.max(maxSize, size);
        }

        int result = 0;
        for (var entry : counter.entrySet()) {
            if (entry.getValue() == maxSize) {
                result += 1;
            }
        }
        return result;
    }

    private int countDigit(int value) {
        int result = 0;
        while (value > 0) {
            result += value % 10;
            value /= 10;
        }
        return result;
    }
}
