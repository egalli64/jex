/*
 * 2161. Partition Array According to Given Pivot - https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Partition the array for the passed pivot. But the relative order of the
 * element should be maintained.
 * <p>
 * Constraints: The array is not empty, there is at least an element in the
 * array with the same value of pivot
 */
public class PartitionArrayAccordingGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int count = 0;

        for (int cur : nums) {
            if (cur < pivot) {
                left.add(cur);
            } else if (cur > pivot) {
                right.add(cur);
            } else {
                count += 1;
            }
        }

        int[] result = new int[nums.length];
        int i = 0;

        for (int cur : left) {
            result[i] = cur;
            i += 1;
        }

        for (int j = 0; j < count; j++) {
            result[i] = pivot;
            i += 1;
        }

        for (int cur : right) {
            result[i] = cur;
            i += 1;
        }

        return result;
    }
}
