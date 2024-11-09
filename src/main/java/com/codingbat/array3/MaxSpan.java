/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;

/**
 * maxSpan - https://codingbat.com/prob/p189576
 * <p>
 * Find in the passed array the largest span between the leftmost and rightmost
 * elements with same value. A single element has span 1. Efficiency is not a
 * priority)
 */
public class MaxSpan {
    /**
     * Loop on all the elements from left to right. In a nested loop from right to
     * left find the max span for the left-current value. Keep track of the biggest
     * span, and change it as required.
     *
     * @param nums an array
     * @return the max span
     */
    public static int solution(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;
            while (nums[i] != nums[j]) {
                j -= 1;
            }
            result = Math.max(result, j - i + 1);
        }

        return result;
    }

    /**
     * Loop on all the elements from left to right. In a nested loop from right to
     * left find the max span for the left-current value. Keep track of the biggest
     * span, and change it as required.
     *
     * @param nums an array
     * @return the max span
     */
    public static int doubleFor(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;
            for (; nums[i] != nums[j]; j--) {
            }

            result = Math.max(result, j - i + 1);
        }

        return result;
    }

    /**
     * Push in a map the first/last position for each element in the input array.
     * Look for the max span in the map.
     * 
     * @param nums an array
     * @return the max span
     */
    public static int linear(int[] nums) {
        Map<Integer, SimpleEntry<Integer, Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var span = map.putIfAbsent(nums[i], new SimpleEntry<>(i, i));
            if (span != null) {
                span.setValue(i);
            }
        }

        int result = 0;

        for (var entry : map.entrySet()) {
            var span = entry.getValue();
            int len = span.getValue() - span.getKey() + 1;
            result = Math.max(len, result);
        }

        return result;
    }
}
