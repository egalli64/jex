/*
 * 1935. Maximum Number of Words You Can Type - https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Count how many words in text do not contain any broken letter.
 * Words are separated with a single blank.
 */
public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int result = 0;

        for (String word : words) {
            boolean broken = false;
            for (char c : word.toCharArray()) {
                if (brokenLetters.indexOf(c) != -1) {
                    broken = true;
                    break;
                }
            }
            if (!broken) {
                result += 1;
            }
        }

        return result;
    }
}
