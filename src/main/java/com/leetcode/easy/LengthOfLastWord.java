/*
 * 58. Length of Last Word - https://leetcode.com/problems/length-of-last-word/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a string s consisting of words and spaces, return the length of the
 * last word (maximal substring consisting of non-space characters only) in it
 * 
 * Constraints:
 * <ul>
 * <li>the string is non-empty
 * <li>there is at least a word in it
 */
public class LengthOfLastWord {
    /**
     * Get the last word length
     * 
     * @param s a string
     * @return the last word length
     */
    public int lengthOfLastWord(String s) {
        int lastCharPos = s.length() - 1;
        while (s.charAt(lastCharPos) == ' ') {
            lastCharPos -= 1;
        }
        return lastCharPos - s.lastIndexOf(' ', lastCharPos);
    }
}
