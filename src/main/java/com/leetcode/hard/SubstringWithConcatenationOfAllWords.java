/*
 * 30. Substring with Concatenation of All Words - https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string and an array of strings, all of the same length.
 * 
 * A concatenated substring is a substring that contains all the strings of any
 * permutation of words concatenated.
 * 
 * Return the starting indices of all the concatenated substrings in the string.
 */
public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        final int wordLen = words[0].length();
        for (int i = 0; i <= s.length() - words.length * words[0].length(); i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < words.length) {
                String word = s.substring(i + j * wordLen, i + (j + 1) * wordLen);
                if (counter.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) > counter.getOrDefault(word, 0)) {
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }

            if (j == words.length) {
                result.add(i);
            }
        }

        return result;
    }
}
