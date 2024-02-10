/*
 * LeetCode 28. Find the Index of the First Occurrence in a String
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

public class FindIndexFirstOccurrenceInString {
    /**
     * Find a needle in the haystack
     * 
     * @param haystack search here
     * @param needle   to be found in haystack
     * @return index of the first needle occurrence in haystack, or -1
     */
    public int strStr(String haystack, String needle) {
        final int lastChance = haystack.length() - needle.length() + 1;
        for (int i = 0; i < lastChance; i++) {
            boolean found = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Delegate to String::indexOf()
     * 
     * @param haystack search here
     * @param needle   to be found in haystack
     * @return index of the first needle occurrence in haystack, or -1
     */
    public int indexOf(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
