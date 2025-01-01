/*
 * 1422. Maximum Score After Splitting a String - https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a string, return the maximum score, given by splitting the string in
 * two non-empty parts, and counting the '0' in the left part and the '1' in the
 * right one.
 * <p>
 * Constraints: No other char than '0' and '1' in the string, that has a minimum
 * size of 2.
 */
public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int right = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                right += 1;
            }
        }

        int left = s.charAt(0) == '0' ? 1 : 0;

        int result = left + right;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                left += 1;
            } else {
                right -= 1;
            }

            result = Math.max(result, left + right);
        }

        return result;
    }
}
