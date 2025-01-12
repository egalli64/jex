/*
 * 2116. Check if a Parentheses String Can Be Valid - https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayDeque;
import java.util.SequencedCollection;

/**
 * Given a parentheses string, return true if it is valid, meaning, open/close
 * parentheses match. However, a second strings contains a lock for each
 * character in the first one, that is 0 if the parentheses can be changes,
 * while not matching.
 * <p>
 * Constraints: both strings have the same length; first string contains only
 * '(' and ')'; second string contains '0' and '1' only
 */
public class CheckIfParenthesesStringCanBeValid {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1) {
            return false;
        }

        // 
        SequencedCollection<Integer> openFix = new ArrayDeque<>(s.length());
        SequencedCollection<Integer> unlocked = new ArrayDeque<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0') {
                unlocked.addLast(i);
            } else if (s.charAt(i) == '(') {
                openFix.addLast(i);
            } else if (s.charAt(i) == ')') {
                if (!openFix.isEmpty()) {
                    openFix.removeLast();
                } else if (!unlocked.isEmpty()) {
                    unlocked.removeLast();
                } else {
                    return false;
                }
            }
        }

        while (!openFix.isEmpty() && !unlocked.isEmpty() && openFix.getLast() < unlocked.getLast()) {
            openFix.removeLast();
            unlocked.removeLast();
        }

        return openFix.isEmpty();
    }
}
