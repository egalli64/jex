/*
 * 3. Longest Substring Without Repeating Characters - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * Find the length of the longest substring without repeating characters
     * 
     * @param s a string
     * @return size of the longest acceptable substring
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> checker = new HashMap<>();
        int candidate = 0;

        for (int i = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);
            Integer prevPos = checker.get(cur);
            if (prevPos != null) {
                candidate = Math.max(checker.size(), candidate);
                for (int j = i - checker.size(); j < prevPos; j++) {
                    checker.remove(s.charAt(j));
                }
            }

            checker.put(cur, i);
        }

        return Math.max(checker.size(), candidate);
    }
}
