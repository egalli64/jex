/*
 * 1910. Remove All Occurrences of a Substring - https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Remove from the passed first string all the occurrences of the second one,
 * from left to right. Return the resulting string with no more occurrences of
 * the second one in it.
 * <p>
 * Constraints: both string are non-empty
 */
public class RemoveAllOccurrencesOfSubstring {
    /**
     * Check char by char for the tag
     * 
     * @param s    the input string
     * @param part the tag to be removed
     * @return the cleaned result
     */
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder(s.length());

        for (char c : s.toCharArray()) {
            result.append(c);
            checkTail(result, part);
        }

        return result.toString();
    }

    /**
     * Remove the tag if matches with the end
     * 
     * @param sb the checked string
     * @param s  the tag
     */
    private void checkTail(StringBuilder sb, String s) {
        if (sb.length() >= s.length()) {
            int i = sb.length() - s.length();
            for (int j = 0; j < s.length(); j++) {
                if (sb.charAt(i + j) != s.charAt(j)) {
                    return;
                }
            }
            sb.setLength(i);
        }
    }
}
