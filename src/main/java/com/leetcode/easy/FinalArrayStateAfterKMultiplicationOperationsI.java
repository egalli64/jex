/*
 * 3264. Final Array State After K Multiplication Operations I - https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.PriorityQueue;

/**
 * Given an array, repeat k times this operation: multiply for the given
 * multiplier its minimum value. Then return it (keep the elements in the
 * original order!)
 */
public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Node> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(new Node(nums[i], i));
        }

        for (int i = 0; i < k; i++) {
            Node cur = heap.poll();
            cur.num *= multiplier;

            heap.add(cur);
        }

        for (int i = 0; i < nums.length; i++) {
            Node cur = heap.poll();
            nums[cur.index] = cur.num;
        }

        return nums;
    }

    /**
     * Utility class - pair for the heap
     */
    private class Node implements Comparable<Node> {
        int num;
        int index;

        public Node(int num, int index) {
            this.num = num;
            this.index = index;
        }

        @Override
        public int compareTo(Node that) {
            if (this.num == that.num) {
                return Integer.compare(this.index, that.index);
            }
            return Integer.compare(this.num, that.num);
        }

        @Override
        public String toString() {
            return "[" + num + ", " + index + "]";
        }
    }
}
