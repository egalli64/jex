/*
 * 1614. Maximum Nesting Depth of the Parentheses - https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a "valid parentheses string", return its max nesting depth
 * 
 * The string could contain '0'...'9', '+', '-', '*', '/', '(', and ')'
 */
public class MaximumNestingDepthOfParentheses {
    /**
     * Get the max depth
     * 
     * @param s a valid parentheses string
     * @return its max nesting depth
     */
    public int maxDepth(String s) {
        int cur = 0;
        int result = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                cur += 1;
                result = Math.max(cur, result);
            } else if (c == ')') {
                cur -= 1;
            }
        }

        return result;
    }
}
