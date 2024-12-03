/*
 * 2109. Adding Spaces to a String - https://leetcode.com/problems/adding-spaces-to-a-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given a string, generate a copy with spaces inserted in it. An array of
 * integers is also given, stating where the spaces have to be placed.
 * <p>
 * Constraints: both string and positions are not empty. The passed positions
 * are strictly increasing
 */
public class AddingSpacesToString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (j < spaces.length && i == spaces[j]) {
                result.append(' ');
                j += 1;
            }
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
