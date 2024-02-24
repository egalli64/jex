/*
 * 14. Longest Common Prefix - https://leetcode.com/problems/longest-common-prefix/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Arrays;

/**
 * Constraints:
 * 
 * <li>1 <= strs.length <= 200
 * <li>0 <= strs[i].length <= 200
 * <li>strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
    /**
     * Find the longest common prefix string
     * 
     * @param strs an array of strings
     * @return the longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (s, t) -> s.length() - t.length());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char cur = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (cur != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(cur);
        }

        return result.toString();
    }
}
