/*
 * 1353. Maximum Number of Events That Can Be Attended - https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given the start/end day of a bunch of events, count how many events can be attended for at least one day
 */
public class MaximumNumberOfEventsThatCanBeAttended {
    public int maxEvents(int[][] events) {
        // same as: Arrays.sort(events, (a, b) -> a[0] - b[0]);
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int result = 0;
        int cur = 1;
        for (int i = 0; i < events.length || !pq.isEmpty(); ) {
            while (i < events.length && events[i][0] <= cur) {
                pq.offer(events[i][1]);
                i += 1;
            }

            while (!pq.isEmpty() && pq.peek() < cur) {
                pq.poll();
            }

            if (!pq.isEmpty()) {
                pq.poll();
                result += 1;
            }
            cur += 1;
        }

        return result;
    }
}
