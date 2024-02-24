/*
 * 20. Valid Parentheses - https://leetcode.com/problems/valid-parentheses/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * A string could contain only '(', ')', '{', '}', '[' and ']'
 * <ul>
 * <li>Open brackets must be closed by the same type of brackets
 * <li>Open brackets must be closed in the correct order
 * <li>Every close bracket has a corresponding open bracket of the same type
 * </ul>
 * 
 * Constraints:
 * <ul>
 * <li>1 <= s.length <= 104
 * <li>s consists of parentheses only '()[]{}'
 * </ul>
 */
public class ValidParentheses {
    /**
     * Check if the string is valid
     * 
     * @param s a string
     * @return true if valid
     */
    public boolean isValid(String s) {
        Deque<Character> buffer = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') {
                buffer.push(cur);
            } else {
                Character expectedPrev = switch (cur) {
                case ')' -> '(';
                case ']' -> '[';
                case '}' -> '{';
                default -> throw new IllegalStateException("Constraint violation");
                };

                Character prev = buffer.peek();
                if (prev != expectedPrev) {
                    return false;
                } else {
                    buffer.pop();
                }
            }
        }

        return buffer.isEmpty();
    }
}
