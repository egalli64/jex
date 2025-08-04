/*
 * 904. Fruit Into Baskets - https://leetcode.com/problems/fruit-into-baskets/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the size of the longest subsequence containing at most two different values (seen as fruits)
 */
public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; j < fruits.length; ) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            if (map.size() > 2) {
                int left = map.get(fruits[i]) - 1;

                if (left == 0) {
                    map.remove(fruits[i]);
                } else {
                    map.put(fruits[i], left);
                }
                i += 1;
            }

            result = Math.max(result, j - i + 1);
            j += 1;
        }

        return result;
    }
}
