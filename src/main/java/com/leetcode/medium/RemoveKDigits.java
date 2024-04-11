/*
 * 402. Remove K Digits - https://leetcode.com/problems/remove-k-digits/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a string representing a non-negative integer, return the smallest
 * possible integer after removing k digits from it
 */
public class RemoveKDigits {
    /**
     * Minimize the input number
     * 
     * @param num a non-negative integer representation
     * @param k   digits to be removed
     * @return the smallest number reduction
     */
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>(num.length());

        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k -= 1;
            }
            stack.push(digit);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k -= 1;
        }

        while (!stack.isEmpty()) {
            if (stack.peekLast() == '0') {
                stack.removeLast();
            } else {
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.isEmpty() ? "0" : result.reverse().toString();
    }
}
