/*
 * 3005. Count Elements With Maximum Frequency - https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * How many items in the input array have the maximum frequency.
 * Notice that different items could have it.
 */
public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        int count = 0;
        Map<Integer, Integer> buffer = new HashMap<>();

        for (int num : nums) {
            int cur = buffer.getOrDefault(num, 0);
            buffer.put(num, cur + 1);
            if (cur == max - 1) {
                count += 1;
            } else if (cur == max) {
                max += 1;
                count = 1;
            }
        }

        return max * count;
    }
}
