/*
 * 2053. Kth Distinct String in an Array - https://leetcode.com/problems/kth-distinct-string-in-an-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given an array of strings, return the kth distinct string, or "".
 * <p>
 * Constraint: k is 1+
 */
public class KthDistinctStringInArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> counter = new LinkedHashMap<>(arr.length);

        for (String cur : arr) {
            counter.put(cur, counter.getOrDefault(cur, 0) + 1);
        }

        for (var entry : counter.entrySet()) {
            if (entry.getValue() == 1) {
                if (k == 1) {
                    return entry.getKey();
                } else {
                    k -= 1;
                }
            }
        }

        return "";
    }
}
