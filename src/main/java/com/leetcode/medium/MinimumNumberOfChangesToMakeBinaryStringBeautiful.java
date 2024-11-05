/*
 * 2914. Minimum Number of Changes to Make Binary String Beautiful - https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given an even sized boolean string, count the changes to make it "beautiful"
 * <p>
 * A string is "beautiful" if it can be partitioned in even sized substrings
 * containing 0 or 1 only
 */
public class MinimumNumberOfChangesToMakeBinaryStringBeautiful {
    /**
     * It is enough to ensure that each pair of elements has the same value
     * 
     * @param s the input string
     * @return the number of required changes
     */
    public int minChanges(String s) {
        int count = 0;

        for (int i = 0; i < s.length() - 1; i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count += 1;
            }
        }

        return count;
    }
}
