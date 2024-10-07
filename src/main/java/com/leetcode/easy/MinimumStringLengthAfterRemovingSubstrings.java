/*
 * 2696. Minimum String Length After Removing Substrings - https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a non-empty string, remove any occurrence of "AB" and "CD" from it,
 * then return its size
 * <p>
 * Notice that removing a target could create a new target to be removed
 */
public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        StringBuilder buffer = new StringBuilder();
        for (char cur : s.toCharArray()) {
            if (!buffer.isEmpty()) {
                final int last = buffer.length() - 1;
                final char prev = buffer.charAt(last);

                if (cur == 'B' && prev == 'A' || cur == 'D' && prev == 'C') {
                    buffer.deleteCharAt(last);
                    continue;
                }
            }
            buffer.append(cur);
        }
        return buffer.length();
    }
}
