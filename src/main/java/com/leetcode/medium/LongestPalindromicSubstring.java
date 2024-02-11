/*
 * LeetCode 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

public class LongestPalindromicSubstring {
    /**
     * Keep the range of a candidate substring
     */
    private record Range(int begin, int end) {
        int size() {
            return end - begin;
        }
    }

    /**
     * Find the longest palindromic substring
     * 
     * @param s a non-empty string
     * @return an acceptable substring
     */
    public String longestPalindrome(String s) {
        Range range = new Range(0, 1);

        for (int i = 1; i < s.length(); i++) {
            Range candidate = builder(s, i);
            if (candidate.size() > range.size()) {
                range = candidate;
            }
        }

        return s.substring(range.begin, range.end);
    }

    private Range builder(String s, int pos) {
        Range odd = builder(s, pos, pos + 1);
        Range even = builder(s, pos - 1, pos + 1);
        return odd.size() > even.size() ? odd : even;
    }

    private Range builder(String s, int begin, int end) {
        if (s.charAt(begin) != s.charAt(end - 1)) {
            return new Range(begin, begin + 1);
        }
        while (begin > 0 && end < s.length() && s.charAt(begin - 1) == s.charAt(end)) {
            begin -= 1;
            end += 1;
        }
        return new Range(begin, end);
    }
}
