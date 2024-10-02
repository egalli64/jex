/*
 * 1331. Rank Transform of an Array - https://leetcode.com/problems/rank-transform-of-an-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array, replace each element with its rank, representing how large
 * the element is.
 * <p>
 * Rules:
 * <ul>
 * <li>The lowest rank is 1
 * <li>The larger the element, the larger the rank
 * <li>Equal elements have the same rank
 * <li>Each rank should be as small as possible
 */
public class RankTransformArray {
    /**
     * Destructive algorithm, the mapping is done in-place
     * 
     * @param arr the input array
     * @return the input array after mapping
     */
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();
        Map<Integer, Integer> ranking = new HashMap<>(sorted.length);

        for (int i = 0; i < sorted.length; i++) {
            ranking.put(sorted[i], i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ranking.get(arr[i]);
        }

        return arr;
    }
}
