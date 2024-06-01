/*
 * 3110. Score of a String - https://leetcode.com/problems/score-of-a-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a string s, return its score.
 * 
 * The score is the sum of the absolute difference between the ASCII values of
 * adjacent characters.
 * 
 * The string is size 2+, with only of lower case English letters in it.
 * 
 */
public class ScoreOfString {
    public int scoreOfString(String s) {
        int result = 0;

        int prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            int cur = s.charAt(i);
            result += Math.abs(cur - prev);
            prev = cur;
        }

        return result;
    }
}
