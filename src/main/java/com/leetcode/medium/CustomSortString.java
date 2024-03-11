/*
 * 791. Custom Sort String - https://leetcode.com/problems/custom-sort-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string describing the order to be maintained with unique chars
 * 
 * Permute the chars of a second given string to match the given order
 * 
 * Chars not specified in the order could be placed anywhere
 */
public class CustomSortString {
    /**
     * Push the chars in the string to be ordered in a map. Loop on the order char
     * and push the chars from the map to the result, accordingly to their count
     * number. Add the remaining chars from the the map to the result.
     * 
     * @param order the order pattern
     * @param s     the string to be ordered
     * @return the sorted string
     */
    public String customSortString(String order, String s) {
        Map<Character, Integer> counter = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (char c : order.toCharArray()) {
            Integer count = counter.remove(c);
            if (count != null) {
                for (int i = 0; i < count; i++) {
                    result.append(c);
                }
            }
        }

        for (var entry : counter.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }
}
