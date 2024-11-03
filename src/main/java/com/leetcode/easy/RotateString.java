/*
 * 796. Rotate String - https://leetcode.com/problems/rotate-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given two strings check if they matches after the left rotation of an
 * unspecified number of chars (maybe zero)
 * 
 * Constraint: the strings are non-empty
 */
public class RotateString {
    /**
     * One liner solution: check the string sizes, they should match; then check if
     * the original string is in the doubled goal. Using a temporary string saves
     * the complexity of wrapping a looping check.
     * 
     * @param s    the input string
     * @param goal the target to be found in input
     * @return true if goal is found in input
     */
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && goal.repeat(2).contains(s);
    }
}
