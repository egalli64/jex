/*
 * 2099. Find Subsequence of Length K With the Largest Sum - https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Extract from the passed array a subsequence having the largest sum.
 * <p>
 * Subsequence: keep the original order, non-contiguous elements are okay.
 */
public class FindSubsequenceOfLengthKWithLargestSum {
    public int[] maxSubsequence(int[] nums, int k) {
        TreeSet<Pair> buffer = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            buffer.add(new Pair(nums[i], i));
        }

        for (int i = k; i < nums.length; i++) {
            int cur = nums[i];
            if (cur > buffer.getFirst().value()) {
                buffer.removeFirst();
                buffer.add(new Pair(cur, i));
            }
        }

        Pair[] pairs = buffer.toArray(new Pair[0]);
        Arrays.sort(pairs, (left, right) -> Integer.compare(left.pos(), right.pos()));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pairs[i].value();
        }

        return result;
    }

    private record Pair(int value, int pos) implements Comparable<Pair> {
        @Override
        public int compareTo(Pair other) {
            int cmp = Integer.compare(this.value(), other.value());
            if (cmp == 0) {
                return Integer.compare(this.pos(), other.pos());
            } else {
                return cmp;
            }
        }
    }
}
