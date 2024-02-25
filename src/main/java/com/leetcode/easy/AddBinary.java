/*
 * 67. Add Binary - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given two binary strings a and b, return their sum as a binary string
 * 
 * Constraints: the strings are non-empty, no leading zero
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        String longy = a.length() > b.length() ? a : b;
        String shorty = b.length() < a.length() ? b : a;

        StringBuilder result = new StringBuilder(longy.length());
        int carry = 0;
        for (int i = 0; i < shorty.length(); i++) {
            int lCur = longy.charAt(longy.length() - i - 1) - '0';
            int sCur = shorty.charAt(shorty.length() - i - 1) - '0';
            int cur = lCur + sCur + carry;
            result.append(cur % 2);
            carry = cur / 2;
        }
        for (int i = shorty.length(); i < longy.length(); i++) {
            int cur = longy.charAt(longy.length() - i - 1) - '0' + carry;
            result.append(cur % 2);
            carry = cur / 2;
        }

        if (carry == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }
}
