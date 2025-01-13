/*
 * 3223. Minimum Length of String After Operations - https://leetcode.com/problems/minimum-length-of-string-after-operations/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty string, for each char remove the left/right same char of
 * it. Return the length of the resulting string
 */
public class MinimumLengthOfStringAfterOperations {
    /**
     * Count the copies of each char, if odd only one survives, if even two.
     * 
     * @param s the input string
     * @return count of the surviving characters
     */
    public int minimumLength(String s) {
        if (s.length() < 3) {
            return s.length();
        }

        Map<Character, Integer> counter = new HashMap<>();
        for (char cur : s.toCharArray()) {
            counter.put(cur, counter.getOrDefault(cur, 0) + 1);
        }

        int result = 0;

        for (var cur : counter.values()) {
            if (cur % 2 == 0) {
                result += 2;
            } else {
                result += 1;
            }
        }

        return result;
    }
}
