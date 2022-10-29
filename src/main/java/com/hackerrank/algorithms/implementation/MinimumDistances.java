/*
    Prepare > Algorithms > Implementation > Minimum Distances
    https://www.hackerrank.com/challenges/minimum-distances/problem

    Minimum Distance between elements having the same value
 */
package com.hackerrank.algorithms.implementation;

import java.util.*;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        int result = Integer.MAX_VALUE;
        Map<Integer, Integer> lastIndices = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            Integer current = a.get(i);
            Integer prevIndex = lastIndices.putIfAbsent(current, i);
            if(prevIndex != null) {
                result = Math.min(result, i - prevIndex);
                lastIndices.put(current, i);
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
