/*
 * 2182. Construct String With Repeat Limit - https://leetcode.com/problems/construct-string-with-repeat-limit/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Given a string, reorder its characters to get the lexicographically largest
 * one, but without repeating each character more than a given number of times.
 */
public class ConstructStringWithRepeatLimit {
    /**
     * Map each char with its frequency. Put the resulting pairs in a max heap. Loop
     * on the heap, get from the max node the required chars. Get a single char from
     * the next node, if available, and put the node back in the heap, if not
     * emptied.
     * 
     * @param s           the input string
     * @param repeatLimit the max number of repetition in result
     * @return the resulting string
     */
    public String repeatLimitedString(String s, int repeatLimit) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Node> heap = new PriorityQueue<>();
        for (var entry : counter.entrySet()) {
            heap.add(new Node(entry.getKey(), entry.getValue()));
        }

        StringBuilder result = new StringBuilder();
        while (!heap.isEmpty()) {
            Node cur = heap.poll();
            int sz = Math.min(cur.frequency, repeatLimit);
            for (int i = 0; i < sz; i++) {
                result.append(cur.c);
            }

            cur.frequency -= sz;
            if (cur.frequency > 0 && !heap.isEmpty()) {
                Node next = heap.poll();
                result.append(next.c);
                if (next.frequency > 1) {
                    next.frequency -= 1;
                    heap.add(next);
                }
                heap.add(cur);
            }
        }

        return result.toString();
    }

    /**
     * Helper for the priority queue. Nodes are kept in descending order by char
     */
    private class Node implements Comparable<Node> {
        char c;
        int frequency;

        public Node(char c, int frequency) {
            this.c = c;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Node that) {
            return Integer.compare(that.c, this.c);
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "[" + c + ", " + frequency + "]";
        }
    }
}
