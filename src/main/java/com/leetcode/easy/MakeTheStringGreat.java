/*
 * 1544. Make The String Great - https://leetcode.com/problems/make-the-string-great/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Generate a "good" string from the input one.
 * 
 * A "good" string doesn't have two adjacent characters differing only for their
 * case.
 * 
 * The string contains only lower and upper case English letters. Or could be
 * empty (and it is good).
 */
public class MakeTheStringGreat {
    private static final int GAP = 'a' - 'A';

    /**
     * Make the passed string good
     * 
     * @param s a string
     * @return the associated good string
     */
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>(s.length());

        for (char c : s.toCharArray()) {
            Character prev = stack.peek();
            if (prev != null && Math.abs(c - prev) == GAP) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        stack.reversed().forEach(c -> result.append(c));
        return result.toString();
    }
}
