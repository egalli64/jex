/*
 * Prepare > Algorithms > Greedy > Beautiful Pairs
 * https://www.hackerrank.com/challenges/beautiful-pairs/
 *
 * Given two integer lists, count the couples of same values
 * If there is at least one non- "beautiful pairs", increase the counter, otherwise decrease it
 * Return the counter
 */
package com.hackerrank.algorithms.greedy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeautifulPairs {
    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (Integer key : A) {
            Integer value = counter.putIfAbsent(key, 1);
            if (value != null) {
                counter.put(key, value + 1);
            }
        }

        int result = 0;
        for (Integer key : B) {
            Integer count = counter.getOrDefault(key, 0);
            if (count > 0) {
                result += 1;
                counter.put(key, count - 1);
            }
        }

        return result == A.size() ? result - 1 : result + 1;
    }
}
