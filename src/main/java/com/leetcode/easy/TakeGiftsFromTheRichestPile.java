/*
 * 2558. Take Gifts From the Richest Pile - https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Given an array of integers, choose a given number of times the largest value
 * and reduce it to its square root. Return the sum of the leftovers.
 * <p>
 * Hint: use a max heap
 */
public class TakeGiftsFromTheRichestPile {
    /**
     * Use a PriorityQueue with reversed order as max heap.
     * 
     * @param gifts the array of integers on which operate
     * @param k     the number of time to work on the array
     * @return the leftover elements
     */
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts)
            heap.add(gift);

        for (int i = 0; i < k && heap.peek() > 1; i++) {
            heap.add((int) Math.sqrt(heap.poll()));
        }

        return heap.stream().mapToLong(Integer::longValue).sum();
    }
}
