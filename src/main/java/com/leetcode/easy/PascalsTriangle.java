/*
 * 118. Pascal's Triangle - https://leetcode.com/problems/pascals-triangle/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Return the first n rows of the Pascal's Triangle
 */
public class PascalsTriangle {
    private final List<List<Integer>> cache = new ArrayList<>(List.of(new ArrayList<>(List.of(1))));

    public List<List<Integer>> generate(int numRows) {
        while (cache.size() < numRows) {
            List<Integer> prev = cache.getLast();
            List<Integer> cur = new ArrayList<>(cache.size() + 1);

            cur.add(1);
            for (int i = 1; i < cache.size(); i++) {
                cur.add(prev.get(i - 1) + prev.get(i));
            }
            cur.add(1);

            cache.add(cur);
        }
        return cache.subList(0, numRows);
    }
}
