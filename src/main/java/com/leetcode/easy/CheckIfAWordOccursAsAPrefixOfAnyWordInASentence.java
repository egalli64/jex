/*
 * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence - https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a sentence and a target, check if the target is a prefix on any word in
 * the sentence. Return the index (1-based) of the first matching string found,
 * or -1 if not found.
 * <p>
 * Constraints: each word in the sentence is separated by a single blank; both
 * passed strings are not empty.
 */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
