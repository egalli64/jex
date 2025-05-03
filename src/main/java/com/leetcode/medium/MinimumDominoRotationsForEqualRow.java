/*
 * 1007. Minimum Domino Rotations For Equal Row - https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two arrays, representing top and bottom values in dominoes, find how
 * many rotations are need to have all tops or bottoms with the same value.
 * Return -1 if it is not possible.
 * <p>
 * Constraints: the two arrays have the same size, not less than 2, values are
 * in [1 .. 6]
 */
public class MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        Map<Integer, Stat> stats = new HashMap<>();
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] == bottoms[i]) {
                stats.put(tops[i], stats.getOrDefault(tops[i], new Stat()).increaseSame());
            } else {
                stats.put(tops[i], stats.getOrDefault(tops[i], new Stat()).increase(true));
                stats.put(bottoms[i], stats.getOrDefault(bottoms[i], new Stat()).increase(false));
            }
        }

        for (var value : stats.values()) {
            if (value.total() >= tops.length) {
                return Math.min(value.bottom, value.top);
            }
        }

        return -1;
    }

    private class Stat {
        int top = 0;
        int bottom = 0;
        int same = 0;

        Stat increaseSame() {
            same += 1;
            return this;
        }

        Stat increase(boolean isTop) {
            if (isTop) {
                top += 1;
            } else {
                bottom += 1;
            }
            return this;
        }

        int total() {
            return top + bottom + same;
        }
    }
}
