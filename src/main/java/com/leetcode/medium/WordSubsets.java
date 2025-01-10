/*
 * 916. Word Subsets - https://leetcode.com/problems/word-subsets/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two string arrays, we want to get all strings from the first array that
 * have as sub-collection each string in the second array. They could be
 * returned in any order.
 */
public class WordSubsets {
    /**
     * To be accepted, a string should contains all chars in the strings of the
     * second lot. So, for each char in the second lot, we need to know the largest
     * number required. Then, it is just a matter of checking which strings of the
     * first lot respect the requisites.
     * 
     * @param words1 the strings to be checked
     * @param words2 the strings that are used to check the other ones
     * @return the accepted strings
     */
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<Character, Integer> target = new HashMap<>();
        for (String word : words2) {
            Map<Character, Integer> local = new HashMap<>();

            for (char cur : word.toCharArray()) {
                local.put(cur, local.getOrDefault(cur, 0) + 1);
            }

            for (var entry : local.entrySet()) {
                Integer other = target.getOrDefault(entry.getKey(), 0);
                target.put(entry.getKey(), Math.max(entry.getValue(), other));
            }
        }

        List<String> result = new ArrayList<>();

        for (String word : words1) {
            Map<Character, Integer> candidate = new HashMap<>();
            for (char cur : word.toCharArray()) {
                candidate.put(cur, candidate.getOrDefault(cur, 0) + 1);
            }

            boolean isSub = true;
            for (var entry : target.entrySet()) {
                Integer other = candidate.getOrDefault(entry.getKey(), 0);
                if (entry.getValue() > other) {
                    isSub = false;
                    break;
                }
            }
            if (isSub) {
                result.add(word);
            }
        }

        return result;
    }
}
