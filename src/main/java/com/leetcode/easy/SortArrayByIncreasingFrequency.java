/*
 * 1636. Sort Array by Increasing Frequency - https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

/**
 * Return the given array after sorting it in increasing order based on the
 * frequency of the values. If multiple values have the same frequency, sort
 * them in decreasing order.
 */
public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        // 1. determine frequency for each element
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // 2. sort the element as required
        Comparator<Integer> comp = (left, right) -> {
            int freqL = freq.get(left);
            int freqR = freq.get(right);
            if (freqL == freqR) {
                return -Integer.compare(left, right);
            } else {
                return Integer.compare(freqL, freqR);
            }
        };
        Map<Integer, Integer> sorted = new TreeMap<>(comp);
        sorted.putAll(freq);

        // 3. generate the result
        return sorted.entrySet().stream() //
                .flatMapToInt(entry -> IntStream.range(0, entry.getValue()).map(i -> entry.getKey())) //
                .toArray();
    }
}
