/*
 * 2593. Find Score of an Array After Marking All Elements - https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.PriorityQueue;

/**
 * Given an array of positive integers, calculate its score with the given
 * algorithm: find the first smallest value and add it to the score, mark it and
 * its neighbors as visited. Repeat until all the elements are marked.
 */
public class FindScoreOfAnArrayAfterMarkingAllElements {
    /**
     * Use a heap (priority queue) on the pair value/index. Keep track of the marked
     * elements in an array. Get all the elements from the heap, adding up to the
     * score only the ones that have not been already marked.
     * 
     * @param nums the input numbers
     * @return the score
     */
    public long findScore(int[] nums) {
        PriorityQueue<Node> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(new Node(nums[i], i));
        }
        boolean[] visited = new boolean[nums.length];

        long score = 0;
        while (!heap.isEmpty()) {
            Node cur = heap.poll();
            if (!visited[cur.index()]) {
                score += cur.value();
                visited[cur.index()] = true;
                if (cur.index() > 0) {
                    visited[cur.index() - 1] = true;
                }
                if (cur.index() < visited.length - 1) {
                    visited[cur.index() + 1] = true;
                }
            }
        }
        return score;
    }
}

/**
 * Pair value/index, ordered by both components
 */
record Node(int value, int index) implements Comparable<Node> {
    @Override
    public int compareTo(Node that) {
        if (this.value != that.value) {
            return Integer.compare(this.value, that.value);
        } else {
            return Integer.compare(this.index, that.index);
        }
    }
}
