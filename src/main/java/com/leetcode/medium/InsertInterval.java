/*
 * 57. Insert Interval - https://leetcode.com/problems/insert-interval/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of non-overlapping intervals described as arrays of the
 * starting - ending point
 * 
 * Given a new interval, insert it into intervals such that intervals is still
 * sorted in ascending order and with no overlap (interval merge could be
 * required)
 */
public class InsertInterval {
    /**
     * Loop on all intervals
     * 
     * @param intervals   the passed intervals
     * @param newInterval the new interval
     * @return the new intervals
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        boolean added = false;

        for (int[] cur : intervals) {
            if (cur[1] < newInterval[0] || added) {
                result.add(cur);
            } else {
                newInterval[0] = Math.min(newInterval[0], cur[0]);

                if (newInterval[1] < cur[0]) {
                    result.add(new int[] { newInterval[0], newInterval[1] });
                    result.add(cur);
                    added = true;
                } else if (newInterval[1] <= cur[1]) {
                    result.add(new int[] { newInterval[0], cur[1] });
                    added = true;
                }
            }
        }

        if (!added) {
            result.add(newInterval);
        }

        return result.toArray(new int[result.size()][]);
    }
}
