/*
 * 1128. Number of Equivalent Domino Pairs - https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Count the number of combinations, C(n, 2) = n*(n-1)/2, of the same domino in
 * the passed array
 * <p>
 * Constraints: values are in [1..9]
 */
public class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < dominoes.length; i++) {
            int id = dominoId(dominoes[i][0], dominoes[i][1]);
            counter.put(id, counter.getOrDefault(id, 0) + 1);
        }
        System.out.println(counter);

        int result = 0;

        for (int value : counter.values()) {
            if (value > 1) {
                result += value * (value - 1) / 2;
            }
        }

        return result;
    }

    private int dominoId(int top, int down) {
        return Math.min(top, down) * 10 + Math.max(top, down);
    }
}
