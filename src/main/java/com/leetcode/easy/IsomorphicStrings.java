/*
 * 205. Isomorphic Strings - https://leetcode.com/problems/isomorphic-strings/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given two strings, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in one can be replaced to get
 * the other one.
 * 
 * Expect any ASCII character in the strings
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] is = new int[128];
        int[] it = new int[128];

        for (int i = 0; i < s.length(); i++) {
            if (is[s.charAt(i)] != it[t.charAt(i)]) {
                return false;
            }

            is[s.charAt(i)] = i + 1;
            it[t.charAt(i)] = i + 1;
        }

        return true;
    }
}
