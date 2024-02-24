/*
 * 13. Roman to Integer - https://leetcode.com/problems/roman-to-integer/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> mapper = Map.of( //
            'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    /**
     * Convert a Roman number to its integer representation
     * 
     * @param s a Roman number
     * @return its integer representation
     */
    public int romanToInt(String s) {
        int result = 0;

        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = mapper.get(s.charAt(i));
            if (cur < prev) {
                result -= cur;
            } else {
                result += cur;
            }
            prev = cur;
        }

        return result;
    }
}
