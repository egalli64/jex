/*
 * 1717. Maximum Score From Removing Substrings - https://leetcode.com/problems/maximum-score-from-removing-substrings/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Maximize the point we get removing from the passed string each instance of:
 * "ab", giving x points; "ba", giving y points.
 */
public class MaximumScoreFromRemovingSubstrings {
    public int maximumGain(String s, int x, int y) {
        String high = x > y ? "ab" : "ba";
        String low = x > y ? "ba" : "ab";

        int result = 0;
        String step1 = remove(s, high);
        result += (s.length() - step1.length()) * Math.max(x, y) / 2;
        String step2 = remove(step1, low);
        result += (step1.length() - step2.length()) * Math.min(x, y) / 2;

        return result;
    }

    private String remove(String input, String xy) {
        if (input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder();
        for (char cur : input.toCharArray()) {
            if (cur == xy.charAt(1) && !sb.isEmpty() && sb.charAt(sb.length() - 1) == xy.charAt(0)) {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(cur);
            }
        }

        return sb.toString();
    }
}
