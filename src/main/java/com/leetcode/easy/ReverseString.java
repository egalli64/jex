/*
 * 344. Reverse String - https://leetcode.com/problems/reverse-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an array of chars (seen as string), revert it in-place.
 * 
 * Required memory complexity is O(1).
 * 
 */
public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
