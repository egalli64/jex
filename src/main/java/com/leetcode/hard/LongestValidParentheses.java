/*
 * 32. Longest Valid Parentheses - https://leetcode.com/problems/longest-valid-parentheses/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Find the length of the longest valid (well-formed) parentheses substring.
 * 
 * The input string contains just '(' and ')'.
 */
public class LongestValidParentheses {
    /**
     * Size of the longest valid substring
     * 
     * @param s a parentheses string
     * @return size of the longest sub
     */
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>(s.length() + 1);
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }
}
