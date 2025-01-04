/*
 * 1930. Unique Length-3 Palindromic Subsequences - https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, count how many unique palindromes of length 3 are in it.
 */
public class UniqueLength3PalindromicSubsequences {
    /**
     * Get the first/last position of each char in the string. Count how many unique
     * chars are inside each first/last interval for each char. Add them up.
     * 
     * @param s the string
     * @return the number of palindromes
     */
    public int countPalindromicSubsequence(String s) {
        Map<Character, Pair> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            Pair positions = map.putIfAbsent(cur, new Pair(i, i));
            if (positions != null) {
                positions.last = i;
            }
        }

        int result = 0;
        for (var positions : map.values()) {
            Set<Character> inside = new HashSet<>();
            for (int i = positions.first + 1; i < positions.last; i++) {
                inside.add(s.charAt(i));
            }
            result += inside.size();
        }
        return result;
    }

    /**
     * Utility class
     */
    static private class Pair {
        int first;
        int last;

        Pair(int first, int last) {
            this.first = first;
            this.last = last;
        }

        @Override
        public String toString() {
            return String.format("{%d,%d}", first, last);
        }
    }
}
