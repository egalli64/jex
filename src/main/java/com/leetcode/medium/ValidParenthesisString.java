/*
 * 678. Valid Parenthesis String - https://leetcode.com/problems/valid-parenthesis-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Check if a string, containing only '(', ')' and '*', is valid.
 * 
 * <ul>
 * <li>'(' and ')' must match</li>
 * <li>'*' could be seen as '(', ')', or discarded</li>
 * </ul>
 */
public class ValidParenthesisString {
    /**
     * Check if the string is valid
     * 
     * @param s a string containing just '(', ')', and '*'
     * @return true if it is valid
     */
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
            case '(' -> {
                min += 1;
                max += 1;
            }
            case ')' -> {
                min = Math.max(min - 1, 0);
                if (max == 0) {
                    return false;
                } else {
                    max -= 1;
                }
            }
            case '*' -> {
                min = Math.max(min - 1, 0);
                max += 1;
            }
            }
        }
        return min == 0;
    }
}
