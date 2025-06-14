/*
 * 2566. Maximum Difference by Remapping a Digit - https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * We know that the passed integer has been modified from its original value
 * changing one digit in it (but all its occurrences). Return the difference
 * between the possible maximum and the minimum original value.
 */
public class MaximumDifferenceRemappingDigit {
    private int bigger(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '9') {
            i += 1;
        }

        if (i < s.length()) {
            s = s.replace(s.charAt(i), '9');
        }

        return Integer.parseInt(s);
    }

    private int smaller(String s) {
        s = s.replace(s.charAt(0), '0');
        return Integer.parseInt(s);
    }

    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        return bigger(s) - smaller(s);
    }
}
