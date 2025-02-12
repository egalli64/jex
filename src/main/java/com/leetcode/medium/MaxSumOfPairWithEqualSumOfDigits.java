/*
 * 2342. Max Sum of a Pair With Equal Sum of Digits - https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of positive values, partition them accordingly to the sum of
 * their digits. Return the highest sum of the two top values partitioned as
 * said, or -1.
 */
public class MaxSumOfPairWithEqualSumOfDigits {
    /**
     * Keep the partitions in a map, where the value is the pair of the two highest
     * values. Then loop on the map to find the result.
     * 
     * @param nums
     * @return
     */
    public int maximumSum(int[] nums) {
        Map<Integer, TopPair> buffer = new HashMap<>();
        for (int num : nums) {
            var values = buffer.putIfAbsent(generateKey(num), new TopPair(num));
            if (values != null) {
                values.add(num);
            }
        }

        int result = -1;
        for (var entry : buffer.entrySet()) {
            result = Math.max(entry.getValue().sum(), result);
        }
        return result;
    }

    private int generateKey(int num) {
        int key = 0;
        while (num > 0) {
            key += num % 10;
            num /= 10;
        }
        return key;
    }

    /**
     * Pair of top values associated to a given key
     */
    private static class TopPair {
        int max;
        int min;

        TopPair(int x) {
            this.max = x;
            this.min = -1;
        }

        void add(int candidate) {
            if (candidate > max) {
                min = max;
                max = candidate;
            } else if (candidate > min) {
                min = candidate;
            }
        }

        int sum() {
            return min < 0 ? min : max + min;
        }
    }
}
