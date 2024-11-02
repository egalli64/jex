/*
 * 2490. Circular Sentence - https://leetcode.com/problems/circular-sentence/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a sentence, check if it is circular:
 * <ul>
 * <li>The last character of a word is equal to the first character of the next
 * word.
 * <li>The last character of the last word is equal to the first character of
 * the first word.
 * </ul>
 * Constraints:
 * <ul>
 * <li>The sentence is not empty
 * <li>Only lowercase and uppercase English letters and spaces are allowed
 * <li>The words in sentence are separated by a single space
 * <li>There are no leading or trailing spaces
 * </ul>
 */
public class CircularSentence {
    /**
     * After checking the wrapper character, loop on all the internal chars looking
     * for blanks. Each blank should have the same char on its left and right
     * 
     * @param sentence a string matching the above requirements
     * @return true if the input is a circular sentence
     */
    public boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }

        for (int i = 1; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
