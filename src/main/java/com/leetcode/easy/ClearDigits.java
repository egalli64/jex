/*
 * 3174. Clear Digits - https://leetcode.com/problems/clear-digits/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a string, remove all digits, but removing a digit implies the remove of
 * the closest non-digit on its left
 * <p>
 * Requisite: it is caller responsibility ensure the input correctness
 */
public class ClearDigits {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (Character.isDigit(cur)) {
                result.setLength(result.length() - 1);
            } else {
                result.append(cur);
            }
        }

        return result.toString();
    }
}
