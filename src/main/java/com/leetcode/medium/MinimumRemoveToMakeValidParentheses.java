/*
 * 1249. Minimum Remove to Make Valid Parentheses - https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Remove the minimum number of parentheses from the passed string to make it
 * valid, meaning:
 * <ul>
 * <li>it is empty</li>
 * <li>it contains only lowercase characters</li>
 * <li>it is a concatenation of two valid strings</li>
 * <li>it is included in parentheses</li>
 * </ul>
 */
public class MinimumRemoveToMakeValidParentheses {
    /**
     * String checker
     * 
     * @param s the string to be checked
     * @return a valid string generated from input
     */
    public String minRemoveToMakeValid(String s) {
        boolean[] toBeRemoved = new boolean[s.length()];
        Deque<Integer> stack = new ArrayDeque<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
            case '(' -> stack.push(i);
            case ')' -> {
                if (stack.isEmpty()) {
                    toBeRemoved[i] = true;
                } else {
                    stack.pop();
                }
            }
            }
        }

        stack.forEach(i -> toBeRemoved[i] = true);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!toBeRemoved[i])
                result.append(s.charAt(i));
        }

        return result.toString();
    }
}
