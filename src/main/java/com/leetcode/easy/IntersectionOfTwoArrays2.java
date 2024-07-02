/*
 * 350. Intersection of Two Arrays II - https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two int arrays, return their intersection. Each element in the result
 * must appear as many times as it shows in both arrays, and you may return the
 * result in any order.
 */
public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> left = makeCount(nums1);
        Map<Integer, Integer> right = makeCount(nums2);

        for (var entry : left.entrySet()) {
            entry.setValue(Math.min(entry.getValue(), right.getOrDefault(entry.getKey(), 0)));
        }

        List<Integer> result = new ArrayList<>();
        for (var entry : left.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(entry.getKey());
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private Map<Integer, Integer> makeCount(int[] data) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int cur : data) {
            count.put(cur, count.getOrDefault(cur, 0) + 1);
        }
        return count;
    }
}